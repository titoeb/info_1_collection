public class Binary{

	public static int search(int key, int[] a){
		return search(key, a, 0, a.length);
	}
	public static int search(int key, int[] a, int lo, int hi){
		if(hi <= lo) return -1;
		int mid = (lo + hi) / 2;
		if(key < a[mid]) return search(key, a, lo, mid);
		else if(a[mid] < key) return search(key, a, mid + 1, hi);
		else return mid;
	}

	public static void main(String[] args){
	int[] a = new int[args.length];
	for (int i = 0; i < args.length; i++){
		a[i] = Integer.parseInt(args[i]);
	}
	int key = StdIn.readInt();
	System.out.println(search(key, a));
	}
}
