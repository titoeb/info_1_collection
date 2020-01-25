public class normal{
	public static double dnorm(double x){
		return  (Math.exp(-(x * x) / 2) / Math.sqrt(2 * Math.PI));
	}

	public static double dens(double z){
		double term = z;
		double start = 0;
		for(int n = 3; term + start != start; n+= 2){
			start += term;			
			term *=  (z * z) / n;
			System.out.println(n);
		}
		return 0.5 + dnorm(z) * start;
	}
	public static void main(String[] args){
		double test = Double.parseDouble(args[0]);
		System.out.println(dens(test));
	}
}
