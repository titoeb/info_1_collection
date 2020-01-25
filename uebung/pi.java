public class pi{
	public static void main (String[] args) {
		double a = 0;
		double r = Double.parseDouble(args[0]);
		for (int y = 0; y < r; y++){
			for (int x = 0; x < r; x++){
				if (y*y + x*x < r*r){
					a++;
				}
			}
		}
		System.out.println( 4 * a/(r*r));
	}
}
