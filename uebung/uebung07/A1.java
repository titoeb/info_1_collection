public class A1{

	public static void randchars(int k){
		// give number of chars that will be created
		System.out.println(k);

		// Print out random chars
		double cur_rand;
		for(int i = 0; i < k; i++){

			// Draw random number
			cur_rand = StdRandom.uniform();
			
			// Give out F, L or R
			if (cur_rand <= 0.33){
				System.out.print("F");
			} else {
				if (cur_rand <= 0.66)
					System.out.print("L");
				else
					System.out.print("R");
			}
		}
		System.out.println();
	}
	public static void main(String[] args){
		
		// Read in number of generated chars
		int k = Integer.parseInt(args[0]);

		// input check: negative or too large values (>100000)
		if(k < 0 || k > 100000){
			System.out.println("Please give a positive number below 100000");
			return;
		}
		randchars(k);
		return;	
	}

}
