	public class prime_sieve{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		for(int k = 2; k <= n; k++){
			for (int j = 2; j <= (n/j); j++){
				if(n % j == 0)
					System.out.println("nein");
					return;
				}
			System.out.println("Ja!");
		}{
	}

}
