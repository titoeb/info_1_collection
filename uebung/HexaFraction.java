public class HexaFraction {
	public static void main(String[] args) {
		double z = StdIn.readDouble();
		System.out.print("0.");
		do {
			if (16*z >= 1) { System.out.print(z % 16); z = 16*z - 1; }
			else { System.out.print("0"); z = 16*z; }
		} while (z > 0);
		System.out.println();
	}
}
