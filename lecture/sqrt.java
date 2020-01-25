public class sqrt{
	public static void main(String[] args){
		double a = Double.parseDouble(args[0]);
		double r = a;
		int iter = 0;
		double eps = 1e-15;
		while( Math.abs(a / r - r) > eps * r){
			r = (r + (a / r)) / 2;
			iter += 1;
		}
		System.out.println("The result is: " + r + " And it took " + iter + " Iterations");
	}
}
