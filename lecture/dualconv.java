public class dualconv{
	public static void main(String[] args){
		double z;
		do {	
			System.out.println("Zahl >= 0 und < 1 eingeben:");
			z = StdIn.readDouble();	
		}
		while (z < 0 || z >= 1);
				

		System.out.print("0.");
		
		System.out.print("0.");
		while ( z > 0){
			if ((2 * z) >= 1){
				System.out.print('1');
				z = (2 * z) - 1;
			} else {
				System.out.print('0');
				z = 2 * z;
			}
		}
		System.out.println();
	}
}
