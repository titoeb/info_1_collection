public class echo {
	public static void main(String args[]){
		int iter = 0;
		while (iter < args.length){
		System.out.print(args[iter] + " ");
		++iter;
		}
		System.out.print("\n");
	}
}
