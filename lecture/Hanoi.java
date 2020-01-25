public class Hanoi{
	public static void moves(int n, boolean left){
		boolean right= !left;
		if()
		moves(n-1, right);
		if(left) System.out.println(n + "links");
		else  System.out.println(n + "rechts");
		moves(n-1, right)
	}
	
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		boolean left = true;
		moves(n, left);
	}
}
