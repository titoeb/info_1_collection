public class randint{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		double x = Math.random();
		System.out.println( (int) (n * x) + 1);
	}
}
