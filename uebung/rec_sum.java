public class rec_sum{
	public static int summe(int[] v, int von,int bis){
		if(bis == von ) return v[von];
		else{
			int middle = (von + bis) / 2;
			return summe(v, von, middle) + summe(v, middle + 1, bis);
		}
	}
	public static int[] resize(int[] input, int size){
		int[] tmp = new int[size];
		int run;
		if(size > input.length) run = input.length; // returned array gets bigger
		else run = size; // returned array gets smaller
		for(int i = 0; i < run; i++) tmp[i] = input[i];	
		return tmp;
	}

	public static void main(String[] args){
		int cur_len = 5;
		int pos = 0;
		int[] test = new int[cur_len];
		while(!StdIn.isEmpty()){
			if(pos > cur_len - 1){
				test = resize(test, pos + 5);
				cur_len += 5;
			}
			test[pos] = StdIn.readInt();
			pos++;
		}
		test = resize(test, pos);
	
		System.out.println("Sum: " + summe(test, 0, test.length -1));
	}
}
