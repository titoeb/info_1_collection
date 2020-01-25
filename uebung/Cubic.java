public class Cubic {
	public static void main(String[] args){
		double x = 10.0;
		double a = StdIn.readDouble();
		int count = 0;
		while((x * x * x) - a >= (Float.MIN_VALUE * 10e27)){
			System.out.println("X old: " + x + " X new: " + ((2 * x +  a / Math.pow(x, 2)) / 3.0 ));
			System.out.println("a is: " + a);
			System.out.println("min val: " +  ((Float.MIN_VALUE * 10e20) ));
			x = ((2 * x +  a / Math.pow(x, 2)) / 3.0 );
			count++;
			//if(count > 10000) break;
		}
		System.out.println(x);
	}
}
