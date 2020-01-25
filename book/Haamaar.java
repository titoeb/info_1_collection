public class Hadamaar {
   public static boolean[][] Hadamaar(int n){
       if (n == 1){
           boolean[][] res = {{true}};
           return res;
       } else {
          // Create current matrix from past
          boolean[][] prev = Hadamaar(n - 1);
          boolean[][] next = new boolean[prev.length * 2][prev.length * 2];
          for(int row = 0; row < next.length; row++){
              for(int col = 0; col < next.length; col++){
                  if(row <  next.length / 2 || col < next.length / 2) next[row][col] = prev[row % prev.length][col % prev.length];
                  else next[row][col] = ! prev[row % prev.length][col % prev.length];
              }
          }
          return next;
       }
       
   }
   public static void main(String[] args){
       int n = Integer.parseInt(args[0]);
       boolean test[][] = Hadamaar(n);
       print_arr(test);
   }
   
   public static void print_arr(boolean[][] arr){
       for(int row = 0; row < arr.length; row++){
              for(int col = 0; col < arr.length; col++){
                System.out.print(arr[row][col] + " ");
              }
            System.out.println();
        }
   }
}

