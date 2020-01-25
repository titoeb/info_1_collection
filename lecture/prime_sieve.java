	public class prime_sieve{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		boolean[] is_prime = new boolean[n - 1]; 
		for (int k = 2; k < n; k++){
			is_prime[k] = true;
		}
		for (int k = 2; k * k < n; k++){
			if(is_prime(k)){
				for (int j = k; k*j < n; j++){
					is_prime[k*j] = false;
				}
			}
		}
		for (int k = 2; k <= n; k++){
			if (is_prime[k]){
				System.out.println(k);
			}
		}
		

}
