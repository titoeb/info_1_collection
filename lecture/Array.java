public class Array {
	public static void swap(double[] d, int i, int j){
		double tmp;
		tmp = d[i];
		d[i] = d[j];
		d[j] = tmp;
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
