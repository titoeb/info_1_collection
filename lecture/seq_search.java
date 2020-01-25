public class seq_search{
	public static void main(String[] args){
		// Extract length of the provided arguments
		int N = args.length;

		// create integer array that will contain the inputd numbers
		int[] a = new int[N];
	
		//  Fill the array with the values from args
		for (int i = 0; i < N; i++){
			a[i] = Integer.parseInt(args[i]);
		}

		//  Search for a specific  value that is provided via stdin
		int key = StdIn.readInt();
		for (int i = 0; i < N; i++){
			if (key == a[i]){
				System.out.println(i);
				return;
			}
		}
		System.out.println("Value is not in the array!");
	}
}
