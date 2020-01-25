public class ub5{
	public static void main(String[] args){
		double[] a = {1,2,3,4,5};	
		double x = 1.1;
		int n = 4;
		// My part ....
		// array fuer die potenzen
		double[] pot = new double[n + 1]; 
	
		double x_squ = x * x;
		pot[0] = 1;
		pot[1] = x;
		double result;
		// wenn n == 1 oder n == 2 manuelle berechnung
		if (n > 1){
			// Berechne die quadrierten exponenten von x^3, x^5, ... x^((n-1)*2 + 1)
			for (int i = 2; i <= n; i++){
				pot[i] = pot[i - 1] * x_squ;
			}
		} else{
			
			System.out.println(a[0]);
			return;
		} 
		result = a[n];
		
		for (int i = n; i > 0; i--){
			result =  result * pot[i] + a[i - 1];
		}
		System.out.println(result);
	}
}
