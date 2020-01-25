public class Chebyshev{
	public static int count_primes(int max){
		boolean[] is_prime = new boolean[max];
		for(int i = 2; i < max; i++){
			is_prime[i] = true;
		}
		for(int cand = 2; cand < ((int) Math.sqrt(max)) + 1; cand++){
			if(is_prime[cand]){
				for(int mult = 2; mult * cand < max; mult++){
					is_prime[mult * cand] = false;
				}
			}
		}
		int sum = 0;
		for(int i = 2; i < max; i++){
			if(is_prime[i]) sum++;
		}
		return sum;
	}
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		double lower = (7 * n) / (8 * Math.log(n));
		int primes = count_primes(n);
		double upper =  (9 * n) / (8 * Math.log(n));
		System.out.println(lower + " <= " + primes + " <= " + upper + " and therefore Chebyshev is " + (lower <= primes && primes <= upper));
	}
}
