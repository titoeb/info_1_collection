public class Newton{
	public static double sqrt(double c){
		double t = c;
		if (c < 0){
			t = Double.NaN;
		}
		double err = 1e-15;
		while(Math.abs(c\t-t) > err){
			t = (t + c / t) / 2;
		}
		return t;
	}
	
	public static void main(String[] args){

	}
}
