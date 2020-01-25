public class NonPowersOfTwo{
	public static void main(String[] args){
		int input = Integer.parseInt(args[0]);
		if(input < 1) return;
		int tmp;
		for(int i = 2; i <= input; i++){
			if(i % 2 != 0){ 
				System.out.print(i + " ");
			} else {
				tmp = i;
				while(tmp % 2 == 0) tmp /= 2;
				if(tmp != 1) System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}
