public class OmittedNumbers{
	private boolean[] is_prime;
	public OmittedNumbers(int below){
		is_prime = new boolean[below + 1];
		sieve(below);
		// Although 2 is a prime number, it is not in the class of omitted numbers
		is_prime[2] = false;
	} 	
	public void show(){
		System.out.print("The Omitted number between 1 and " + (is_prime.length - 1) + " are: ");
		for(int i = 1; i < is_prime.length; i++){
			if(is_prime[i])	System.out.print(i + " ");
		}
		System.out.println();
	}
	private void sieve(int below){
		// first all numbers in prime are candidates!
		for(int i = 0; i < is_prime.length; i++) is_prime[i] = true;


		for(int cand = 2; cand < (int) (Math.sqrt(is_prime.length) + 1); cand++){
			if(is_prime[cand ]){
				for(int multiple = 2; multiple * cand < is_prime.length ; multiple++) is_prime[cand * multiple] = false;
			}
		}
	}
	public static void main(String[] args){
		int below = Integer.parseInt(args[0]);
		OmittedNumbers test = new OmittedNumbers(below);
		test.show();
	}
}
