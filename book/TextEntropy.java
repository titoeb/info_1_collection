public class TextEntropy{
	public static void main(String[] args){
		String text = StdIn.readAll();
		double[] freqs = countChars(text);
		double entropy = 0.0;
		for(int i = 0; i < freqs.length; i++){
			entropy += -freqs[i] * log2(freqs[i] + 1e-15);
		}
		System.out.println(entropy);
	}
	public static double[] countChars(String text){
		double[] counts = new double[52];
		int pos;
		for(int i = 0; i < text.length(); i++){
			pos = GivePos(text.charAt(i));
			if(pos != -1) counts[pos]++;
		}

		double sum = 0;
		for(int i = 0; i < counts.length; i++){
			 sum += counts[i];
		}
		
		for(int i = 0; i < counts.length; i++){
			counts[i] /= sum;
		}
		return counts;
	}
	public static int GivePos(char c){
		if(c >= 'A' && c <= 'Z'){
			return c - 'A';
		} else{
			if(c >= 'a' && c <= 'z'){
				return c - 'a' + 'Z' - 'A' + 1;
			} else return -1;
		}

	}
	public static double log2(double val){
		return Math.log(val) / Math.log(2);
	}
}
