public class OddSum{
	public static void main(String[] args){
		if (args.length > 0){
			int end = Integer.parseInt(args[0]);
			int col = 0;
			for(int i = 1; i <= end; i+=2){
				col += i;
			}
			System.out.println("Sum of odd numbers below " + end + " is: " + col);
		}
	}
}
