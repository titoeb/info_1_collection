public class entropy{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		double[] numbers = new double[n];
		double[] ps = new double[n];
		double sum = 0;
		for(int i = 0; i < n; i++){
			numbers[i] = StdIn.readDouble();
			sum += numbers[i];
		}
		for(int i = 0; i < n; i++){
			ps[i] = numbers[i] / sum;
		}
		double entropy = 0;
		for(int i = 0; i < n; i++){
			entropy += ps[i] * log(ps[i], 2);
		}
		System.out.println(-entropy);
		
	}
	public static double log(double x, int base){
		return Math.log(x) / Math.log(base);
	}
}
