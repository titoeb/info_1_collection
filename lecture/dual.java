public class dual{
	public static void main(String[] args){
		String s = ""; // Accumulator
		int z = StdIn.readInt();
		while (z != 0){
			s = (z % 2) + s;
			z /= 2;
		}
		System.out.println(s);
	}
}
