public class muenzen{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		double rand;
		for (int i = 0; i < n; i++){
			if (Math.random() < 0.5){
				System.out.print(0);
			} else {
				System.out.print(1);
			}
		}
		System.out.println();
	}
}
