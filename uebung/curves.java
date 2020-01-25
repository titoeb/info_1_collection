public class curves{
	public static void main(String[] args){
		double x = Double.parseDouble(args[0]);
		System.out.println("six(x) = " + Math.sin(x) + " sin_me(x) = " + sin_me(x));
		System.out.println("cos(x) = " + Math.cos(x) + " cos_me(x) = " + cos_me(x));
	}
	public static double sin_me(double x){
		double sum = x;
		double term = - (x * x * x) / (3 * 2);
		for(int i = 5; sum != sum + term; i+= 2){
			sum += term;
			term *= -(x * x) / (i * (i - 1));
		}
		return sum;
	}
	public static double cos_me(double x){
		double sum = 1;
		double term = - x * x / 2;
		for(int i = 4; sum != sum + term; i+= 2){
			sum += term;
			term *= -(x * x) / (i * (i - 1));
		}
		return sum;
	}
}
