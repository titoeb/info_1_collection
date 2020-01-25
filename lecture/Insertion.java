public class Insertion {
	public static void sort(double[] a){
		int N = a.length;
		for (int i = 1; i < N; i++){
			for(int j = i; j > 0 && a[j] < a[j-1]; j--){
				Array.swap(a,j,j-1);
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
		sort(d);
		System.out.println("nachher: ");
		StdArrayIO.print(d);
		System.out.println();
	}

}
