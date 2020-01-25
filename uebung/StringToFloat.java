public class StringToFloat{
	public static void main(String[] args){
		System.out.println(make_double(args[0]));
	}

	public static double make_double(String input){

		// Test for -/+ inf, Nan and +0, -0;
		if (extract_exp(input) == -127){
			if (Math.abs(extract_mant(input)) - 1<= Double.MIN_VALUE * 1.5){
				if(extract_sign(input) == 1) return 0.0;
				else return -0.0;
			}
		}
		if (extract_exp(input) == 255 - 127){
			if(Math.abs(extract_mant(input)) - 1<= Double.MIN_VALUE * 1.5){
				if(extract_sign(input) == 1) return Double.POSITIVE_INFINITY;
				else return Double.NEGATIVE_INFINITY;
			} else {
				return Double.NaN;
			}

		}
		double res = extract_sign(input) * extract_mant(input) * Math.pow(2, extract_exp(input));
		System.out.println("s: " + extract_sign(input) + " ,  m : " + extract_mant(input) +  " e: " + extract_exp(input) + " v: " + res);
		
		return res;
		
	}
	public static int extract_sign(String input){
		// First char does represent the sign
		// 0 = negative, 1 = positive
		if (input.charAt(0) == '0') return 1;
		else return -1;
	}
	public static int extract_exp(String input){
		// Exponent is 11 bit long and start at position 2 (0-based arrays make that 1)
		// It is saved in the 2-complement format
		int exponent = 0;
		int num = 1;
		for(int i = 8; i > 0; i--){
			exponent += num * (input.charAt(i) - '0');
;
			num *= 2;
		}
		return exponent - 127;
	}
	public static double extract_mant(String input){
		// Exponent is 11 bit long and start at position 2 (0-based arrays make that 1)
		// It is saved in the 2-complement format
		double mantisse = 0.0;
		double exp = 1.0;
		for(int i = 9; i < 32; i++){
			exp /= 2;
			mantisse += exp * (input.charAt(i) - '0');
		}
		return 1.0 + mantisse;
	}
}
