public class NonSquares{
	public static void main(String[] args){
		int input = Integer.parseInt(args[0]);
		if(input < 1) return;
		double res;
		for(int i = 2; i <= input; i++){
			res = Math.sqrt(i);
			// DEBUG: System.out.println("i: " + i + " , Math.sqrt(i) = " + res + " Math.round(res): " + Math.round(res));
			if(Math.abs(res - Math.round(res)) > 0.01) System.out.print(i + " ");
		}
		System.out.println();
	}
}
