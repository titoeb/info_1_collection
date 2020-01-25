public class A1{
	public static void main(String[] args){
		int x = Integer.parseInt(args[0]);		
		boolean b = true;
		int t = 2;
		while ((t*t <= x) && b) {
			b=(( x%t) != 0);
			t++;
			System.out.println("t ist " + t + " b ist " + b + " und x%t ist " + x % t);
		}
		boolean res = (b && (x !=1));
		System.out.println(res);
	}
}
