public class Ordne{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		if ( a < b && b < c){
			System.out.println(a + ", " + b + ", ", + c);
		} else if(a <= b && c <= a){
			System.out.println(c + ", " + a + ", " + b);
		}
	}
}

