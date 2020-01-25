public class bin_search{
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
		int lo = 0;
		int hi = N-1;
		int mid;
		
		while(lo <= hi){
			mid = (hi + lo) / 2;
			if (key < a[mid])
				hi = mid-1;
			else if (a[mid] < key)
				lo = mid+1;
			 else {
				System.out.println(mid);
				return;
			}
		}
		System.out.println("The value is not in the array!");
	}
}
