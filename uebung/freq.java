public class freq{
	public static void main(String[] args){
		int min, max;		
		if (args.length == 1){
			min = 0;
			max = Integer.parseInt(args[0]);
		} else {
			if(args.length == 3){
				min = Integer.parseInt(args[0]);
				max = Integer.parseInt(args[1]);
			} else {
				System.out.println("Please provide one or two arguments!");
				return;
			}
		}
		int[] freq = new int[max - min];
		for(int i = 0; i < max - min; i++){
			freq[StdIn.readInt() - min]++; 	
		}
		int maximum = Integer.MIN_VALUE;
		int pos = 0;
		for(int i = 0; i < max - min; i++){
			if(freq[i] > maximum){
				maximum = freq[i];
				pos = i;
			}	
		}
		System.out.println(min + pos);
	}
}
