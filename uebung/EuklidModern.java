public class EuklidModern{
	public static void main(String[] args){
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int r = -1;
		
		System.out.println("| line \t| x \t| y \t| r \t| comment");
		System.out.println("| M1 \t| "+ x + " \t| " + y + "  \t| - \t| ggT(" + x + "," + y + ")");

		while ( y != 0 ) { // M2
			if(r < 0) System.out.println("| M2 \t| "+ x + " \t| " + y + "  \t| - \t|   while(" + y + " != 0)");
			else System.out.println("| M2 \t| "+ x + " \t| " + y + "  \t| " + r + " \t|   while(" + y + " != 0)");
			System.out.println("| M3 \t| "+ x + " \t| " + y + "  \t| " + r + " \t|     r = "+ x + " % " + y);
			r = x % y; // M3
			System.out.println("| M4 \t| "+ x + " \t| " + y + "  \t| " + r + " \t|     x = "+ y);
			x = y; // M4
			System.out.println("| M5 \t| "+ x + " \t| " + y + "  \t| " + r + " \t|     y = "+ r);
			y = r; // M5
		}
		System.out.println("| M2 \t| "+ x + " \t| " + y + "  \t| " + r + " \t|   while(" + y + " != 0)");
		System.out.println("| M6 \t| "+ x + " \t| " + y + "  \t| - \t|  = " + x);		
		System.out.println(x); // M6
	}
}
