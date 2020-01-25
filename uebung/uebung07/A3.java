public class A3{

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

	public static char[] levy_curve(char[] c_curve){
		// Create output char of appriopriate length
		char[] out = new char[2 * c_curve.length + 4];

		// fill in the elements we know the positions of
		out[0] = '+';
		out[out.length - 1] = '+';
		out[out.length / 2] = '-';
		out[(out.length / 2) - 1] = '-';
		// fill in the array from the last iteration forwards and backwards.
		for(int i = 1; i < (out.length / 2) - 1; i++){
			out[i] = c_curve[i - 1];		
		}

		int pos = 0;
		for(int i = (out.length / 2) + 1; i < out.length - 1; i++){
			out[i] = c_curve[pos];
			++pos;
		}
		return out;	
	}



	public static int repl_levy(char[] input){

		// Find first F and therefore, first element to replace
		int count_f = 0;
		while(input[count_f] != 'F'){
			count_f++;
		}
		
		int pos_read = count_f;
		int pos_write = 0;

		int pos, count_plus, count_minus;
		while(pos_read < input.length - count_f){
			if(input[pos_read] == 'F'){
				// We have a F therefore simply copy this in the output and pos_write and pos_read will be increased by one
				input[pos_write] = 'F';
				++pos_read;
				++pos_write;
			} else {
				/* Here it is more complicated. We have to count the number of pluses and minusses until the next 'F'
					and let the minus and pluses cancel each other out */
				pos = 0;
				count_plus = 0;
				count_minus = 0;
				while(input[pos_read + pos] != 'F'){
					if(input[pos_read + pos] == '+')
						++count_plus;
					else
						++count_minus;
					++pos;
				}
				
				if(count_plus > count_minus){
					for(int i = 0; i < (count_plus - count_minus) / 2; i++){
						input[pos_write] = 'R';
						++pos_write;
					}
				} else {
					for(int i = 0; i < (count_minus - count_plus) / 2; i++){
						input[pos_write] = 'L';
						++pos_write;
					}
				}

				pos_read += pos;
			}
		}

		return pos_write;
	}
	public static void Levy(int k){
		// Calculate the length of the char array and create it accordingly.
		char[] l_curve = {'F'};

		// Create iteratively the levy curves
		for(int i = 1; i <= k; i++){
			l_curve = levy_curve(l_curve);
		}

		// Replace the levy curves with other chars
		int len = repl_levy(l_curve);

		// Give the result out 
		System.out.println(len);
		for(int i = 0; i < len; i++){
			System.out.print(l_curve[i]);
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
		if(!(c == 'D' || c == 'R' || c == 'L')){
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
			if (c == 'D')
				dragonCurve(k);
			else
				Levy(k);
		}
		return;	
	}

}
