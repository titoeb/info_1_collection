public class f{
	public static double f(double x){
		if (x <= 4) return 1;
		else return 2 * f(x - 1) + 3 * f(x - 2);
	}
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		System.out.println(f(n));
	}
	
}
