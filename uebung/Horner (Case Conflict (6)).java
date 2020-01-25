public class horner{
	public static void main(String[] args){
		// Load the coeffecients from the commnand line input;
		double[] coef = new double[args.length];
		for(int i = 0; i < args.length; i++){
			coef[i] = Double.parseDouble(args[i]);
		}

		// Load x
		double x = StdIn.readDouble();
		
		// Calculate the term with the horner schema
		double result;

		
	}
}
