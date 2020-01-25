public class power{
	public static double calcMore(int n){
		if(n == 0) return 1.0;
		double ergebnis;
		if(n > 0){
			ergebnis = calcMore(n - 1);
			if(ergebnis > Double.MAX_VALUE / 2) return 0.0;
			else ergebnis *= 2;
		} else {
			ergebnis = calcMore(n + 1);
			if(ergebnis < 2 * Double.MIN_VALUE) return 0.0;
			else ergebnis /= 2;
		}
		return ergebnis;
	}
	public static void main(String[] args){
		int input = Integer.parseInt(args[0]);
		System.out.println(calcMore(input));
	}
}
