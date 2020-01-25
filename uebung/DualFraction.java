public class HexaFraction {
	public static void main(String[] args) {
		double z = StdIn.readDouble();
		System.out.print("0.");
		do {
			if (2*z >= 1) { System.out.print("1"); z = 2*z - 1; }
			else { System.out.print("0"); z = 2*z; }
		} while (z > 0);
		System.out.println();
	}
}
