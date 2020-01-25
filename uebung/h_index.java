public class h_index{
	public static void main(String[] args){
		int[] input = new int[args.length];
		for(int i = 0; i < args.length; i++){
			input[i] = Integer.parseInt(args[i]);
		}
		for(int i  = 0; i < args.length; i++){
			if(i >= input[i]){
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}
}
