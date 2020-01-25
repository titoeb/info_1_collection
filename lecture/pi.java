public class pi{
	public static void main(String[] args){
		int r = Integer.parseInt(args[0]);
		int a = 0; // Accumulator
		for (int y = 0; y <= r; y++){
			for (int x = 0; x <= r; x++){
				if (x*x + y*y <= r*r){
					a++;
				}
			}
		}
		System.out.println(4.0 * a / ((r + 1) * (r + 1)));
	}
}
