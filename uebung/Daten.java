 public class Daten {
     public static void main(String[] args) {
         int x; 
         if (Integer.parseInt(args[0]) > 0) {
             x = StdIn.readInt();
             System.out.println(x+1);
         } else
             System.out.println("Error");
     }
 }
