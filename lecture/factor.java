public class factor{
	public static void factor(int number){
		System.out.print(number + ": ");
		int test = 2;
		while(number > 1){
			if (number % test == 0){
				System.out.print(test + " ");
				number /= test;
 			} else {
				test++;	
			}
		}
	
	}
	public static void main(String[] args){
		int test = Integer.parseInt(args[0]);
		if (test >= 2){
			factor(test);
			System.out.println();
		}
		
	}

}
