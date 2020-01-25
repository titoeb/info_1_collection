public class faktor{
	public static void main(String[] args){
		int to_factor = Integer.parseInt(args[0]);
		//System.out.println("1 ");
		int old = to_factor;
		int i;
		for(i = 2; i * i <= old + 1; i++){
			while(to_factor % i == 0){
				System.out.println(i + " ");
				to_factor /= i;
			}
		}
		if(to_factor  != 1) System.out.println(to_factor + " ");
	}
}
