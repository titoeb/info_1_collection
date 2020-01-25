public class echo{
	public static void main(String args[]){
		String output = "";
		for(int i = args.length - 1; i >= 0; i--){
			output += args[i] + " " ;
		}
		System.out.println(output);
	}
}
