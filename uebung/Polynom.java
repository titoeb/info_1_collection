public class Polynom{
	public static void main(String[] args){
		long x = Long.parseLong(args[0]);
		System.out.println(((((13 * pow(x, 7) + 13) * x + 12) * x + 10) * pow(x, 2)));
	}	
	public static long pow(long x, long y){
		long result = 1;
		while(y > 0){
			result *= x;
			y--;
		}
		return result;
	}
}
