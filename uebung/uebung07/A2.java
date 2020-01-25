public class A2{

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

	public static void dragonCurve(int k){
		// Calculate the length of the char array and create it accordingly.
		int len = (int) Math.pow(2, k + 1) - 1;
		char[] dragon = new char[len];

		// Create the actual dragon curve
		dragonCurve(dragon, k);

		// Print out length and the generated dragon curve
		System.out.println(len);
		System.out.println(dragon);		
	}

	public static void dragonCurve(char[] dragon, int k){
		String dragon_string = dragonCurve_string(k);
		for(int i = 0; i < dragon.length; i++){
			dragon[i] = dragon_string.charAt(i);
		}
	}


	public static String dragonCurve_string(int k){
		if(k == 0){
			return "F";
		} else {
			String lower = dragonCurve_string(k - 1);
			String output = lower + "R";
			char cur_char;
			for(int i = (lower.length() - 1); i >= 0; i--){
				cur_char = lower.charAt(i);
				if (cur_char == 'R')
					output = output + "L";
				else if (cur_char == 'L')
					output = output + "R";
				else 
					output = output + "F";
				
			}
			return output;			
		}
			
	}

	public static void main(String[] args){
		// Test whether two arguments were provided
		if(args.length != 2){
			System.out.println("Please provide a char and a number");
			return;
		}
				

		// Read in number and the char
		char c = args[0].charAt(0);
		int k = Integer.parseInt(args[1]);

		// Check if c is the right char
		if(!(c == 'D' || c == 'R')){
			System.out.println("Please provide R for Random or D for Dragoncurve");
			return;
		}
		/* Depending on whether a dragon curve or random characters should be created check the inputed number
			and execute the according method. */

		if (c == 'R'){
			if(k < 0 || k > 100000){
				System.out.println("Please give a positive number below or equal 100000");
				return;
			}
			randchars(k);
		} else {
			if(k < 0 || k > 20){
				System.out.println("Please give a positive number below or equal 20");
				return;
			}
			dragonCurve(k);
		}
		return;	
	}

}
