public class BinarySquareRoot{
	public static double sqrt(double val){
		return(sqrt_bin_search(0, val, 0.000001));
	}
	private static double sqrt_bin_search(double min, double res, double interval){
		// Generate all the examples
		double max = res;
		int number = (int) ((max - min) / interval) + 1;
		int pos = 0;
		double[] cand = new double[number];
		for(double val = min; val <= max; val += interval){
			cand[pos] = val;
			pos++;
		}


		// Binary search in candidates
		int start = 0;
		int stop = cand.length - 1;
		int median;
		while(stop - start > 5){
			median = (stop + start) / 2;
			if(res  < cand[median] * cand[median]){
				stop = median - 1;
			
			} else {
				if(res  > cand[median] * cand[median]){
					start = median + 1;
				} else {
					start = median;
					stop = median;			
				}
			}
		}
		return((cand[start] + cand[stop]) / 2);
	}
	public static void main(String[] args){
		double input = Double.parseDouble(args[0]);
		System.out.println("Sqrt(" + input + ") = " + sqrt(input) + " | " + Math.sqrt(input));
	}
}
