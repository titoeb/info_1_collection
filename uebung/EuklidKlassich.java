public class EuklidKlassich{
	public static void main(String[] args){
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		System.out.println("| line \t| x \t| y \t| comment");
		System.out.println("| K1 \t| "+ x + " \t| " + y + "  \t| ggT(" + x + "," + y + ")");
		while ( y != 0 ){
			System.out.println("| K2 \t| "+ x + " \t| " + y + "  \t|   while(" + y + " != 0)");
			System.out.println("| K3 \t| "+ x + " \t| " + y + "  \t|     if(" + x + " > " + y + ")");
			if ( x > y ){ // K3
				System.out.println("| K4 \t| "+ x + " \t| " + y + "  \t|       x = " + x + " - " + y);
				x = x - y; // K4
			} else {
				System.out.println("| K5 \t| "+ x + " \t| " + y + "  \t|       y = " + y + " - " + x);
				y = y - x; // K5
			}
		}
		System.out.println("| K2 \t| "+ x + " \t| " + y + "  \t|   while(" + y + " != 0)");
		System.out.println("| K6 \t| "+ x + " \t| " + y + "  \t| = " + x);
	}
}
