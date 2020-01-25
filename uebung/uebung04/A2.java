public class A2 {
	public static void main ( String args [] ) {
		String str = args [0];
		// Check the length of the input. If it does not have exaclty 32 bits throw error and abort execution.
		String input = args[0];
		if (input.length() != 32){
			System.out.println("Please proved a number with 32 bits!");
			return;
		}
		// Check whether anything beside 0, 1 is in the string, if the case throw error, abort execution!
		for(int i = 0; i < input.length(); i++){
			if((input.charAt(i) != '1' ) & (input.charAt(i) != '0')){
				System.out.println("The string does contain not allowed characters!");
				return;
			}	
		}
		
		// Create the variables I will extract the components of the input floating point in binary format to
		char s_binary;
		String e_binary;
		String f_binary;

		// fill the binary strings from the input!
		s_binary = input.charAt(0);
		e_binary = input.substring(1, 9);
		f_binary = input.substring(9, 32);

		//System.out.println("s is " + s_binary + " e is " + e_binary + " f is " + f_binary);
		
		// convert the number to the corresponding numbers in base 10.
		int s = s_binary - 48;
		int e = Integer.parseInt(e_binary, 2);
		double f = 0;

		for (int i = 1; i <= f_binary.length(); i++){
			f += (f_binary.charAt(i - 1) - 48) * Math.pow(2, -i);
		}


		System.out.println("s is: " + s);
		System.out.println("e is: " + e);
		System.out.println("f is: " + f);

		// Checking pos. infinity, neg. infinity, +0, -0 and NAN

		// Check NaN
		if ((e == 255) & (f != 0)){
			System.out.println("NaN");
			return;			
		}
		
		// Check for neg. / pos. infinity
		if ((e == 255) & (f == 0)){
			if( s > 0){
				System.out.println("NEGATIVE INFINITY");
			} else {
				System.out.println("POSITIVE INFINITY");

			}
			return;
		}
			
		// Check for +0 / -0
		if((e == 0) & (f == 0)){
			if( s > 0){
				System.out.println("+0");
			} else {
				System.out.println("-0");
			}
			return;
		}

		// Check for normalized - not normalized
		double v;
		if((e == 0) & (f != 0)){
			// denormalized number!
			System.out.println("The number is denormalized!");
			v =  Math.pow(-1, s) * Math.pow(2, -126) * (0.0 + f);

		} else {
			// Normalized number!
			System.out.println("The number is normalized!");
			v = Math.pow(-1, s) * Math.pow(2, e - 127) * (1.0 + f);
		}

		// Write out.		
		System.out.println("s is " + s + " e is " + e + " f is " + f + " and v is " + v);
			
	}
}

//0 10010001 10101101100010011001000
