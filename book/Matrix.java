public class Matrix{
	public static void main(String[] args){

	}
	public static double dot(double[] a, double[] b){
		// Returm the vector dot product
		if(a.length != b.length) throw new RuntimeException("Can only create vecgor dot product of matrix with same shape!");
		double sum = 0;
		for(int i = 0; i < a.length; i++) sum+= a[i] * b[i];
		return sum;
	}
	public static double[][] multiply(double[][] a, double[][] b){
		// return the matrix produt of a, b
		
	}
	public static double[][] transpose(double[][] a){
		double[][] result = new double[a[].shape][a.shape];
		for(int row = 0; row < a.length; row++){
			for(int col = 0; col < a[0].length; col++){
				result[col][row] = a[row][col];
			}
		}
		return result;		

	}
	public static double[] multiply(double[][] a, double[] x){
		double[] result = new double[a.length];
		for(int row = 0; row < a.length; row++){
			for(int col = 0; col < a.length; col++){
				result[i] += a[row][col] * x[col];
			}
		}
		return result;
		
	
	}
}
