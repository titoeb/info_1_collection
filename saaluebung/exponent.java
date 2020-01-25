public class exponent{
	public static double exponential(double x){
		double term = 1.0;
		double sum = 0.0;
		for(int n = 1; sum != sum + term; n++){
			sum = sum + term;
			term = term * (x / n);
		}
		return sum;
	}

	public static void main(String[] args){
		double input = Double.parseDouble(args[0]);
		System.out.println(exponential(input));
	}
}
