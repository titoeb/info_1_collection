public class GeoMean{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		if(! (n > 1)) throw new RuntimeException("n has to be large than one! ");
		double[] rand_field = new double[n];
		for(int i = 0; i < n; i++){
			rand_field[i] = ((Math.random() + 1) * n);
		}
		System.out.println("Geo: " + geo_mean(rand_field) + " ari " + arithmetic_mean(rand_field));
		if(arithmetic_mean(rand_field) >= geo_mean(rand_field)) System.out.println("Ok");
		else System.out.println("Widerlegt!");
	}

	public static double arithmetic_mean(double[] numbers){
		double acc = 0;
		for(int i = 0; i < numbers.length; i++){
			acc += numbers[i];
		}
		return acc / numbers.length;
	}
	public static double geo_mean(double[] numbers){
		double acc = 1;
		for(int i = 0; i < numbers.length; i++){
			acc *= numbers[i];
		}
		return Math.pow(acc, 1.0 / numbers.length);
	}
}
