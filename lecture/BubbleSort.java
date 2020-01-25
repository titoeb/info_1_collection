public class BubbleSort{
	public static void main(String[] args){
		int n = args.length;
		int[] f= new int[n];
		for (int i = 0; i < n; i++){
			f[i] = Integer.parseInt(args[i]);
		}
		boolean swapped = false;
		int tmp;
		do {
			swapped = false;
			for (int i = 0; i < (n - 1); i++){
				if (f[i] > f[i + 1]){
					tmp = f[i];
					f[i] = f[i + 1];
					f[i + 1] = tmp;
					swapped = true; 
				}
			}
		} while(swapped);
		
		for (int i = 0; i < n; i++){
			System.out.print(f[i] + " ");
		}
		System.out.println();
	}
}
