public class pirand{
	public static void main(String[] args){
		int n =  Integer.parseInt(args[0]);
		int a = 0; 
		double x,y;
		for (int i = 0; i <= n; i++){
			x = Math.random();
			y = Math.random();
			if (x*x + y*y <= 1 ){
				a++;
			}
		}
		System.out.println(4.0 * a / n);
	}
}
