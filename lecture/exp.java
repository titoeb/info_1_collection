public class exp{
	public static void main(String[] args){
		double x = Double.parseDouble(args[0]);
		double sum = 0.0;
		double term = 1.0;
		double zaehl, nenn;
		for (int n = 1; sum != sum + term; n++){
			sum += term;
			zaehl = 1.0;
			nenn = 1.0;
			for (int i = 1; i <= n; i++){
				zaehl = zaehl * x;
				nenn = nenn * n;
			}		
			term = zaehl / nenn;
		}
		System.out.println(sum);
	}
}
