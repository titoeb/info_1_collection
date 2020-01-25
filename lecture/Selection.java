public class Selection {
	public static void sort(double[] a){
		int n = a.length;
		for(int i = 0; i < N-1; i++){
			int m = i;
			for(int j = i + 1; j < N; j++){
				if(a[j] < a[m]){
					m = j;
				}
				Array.swap(a,m,i)
			}
		}
	}
	public static void main(String[] args){
		int n = args.length;
		double[] d = new double[n];
		for(int i = 0; i < n; i++){
			d[i] = Double.parseDouble(args[i]);
		}
		System.out.println("vorher: ");
		StdArrayIO.print(d);
		System.out.print("zu tauschende Positionen: ");
		int i = StdIn.readInt(), j = StdIn.readInt();
		swap(d,i,j);
		System.out.println("nachher: ");
		StdArrayIO.print(d);
		System.out.println();
	}

}
