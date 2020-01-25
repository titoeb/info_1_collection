public class dreieck{
	public static boolean is_triangle(int n){
		for(int i = 0; i <= 2 * (((int) Math.sqrt(n)) + 1); i++){
			if(n == (i * (i + 1)) / 2){
				return true;
			}
		}
		return false; 
 	}
	public static void main(String[] args){
		int max = Integer.parseInt(args[0]);
		String out = "";
		for(int i = 0; i <= max; i++){
			if(is_triangle(i)){
				if(i != 0) out += ", ";
				out += i;
			}
		}
		System.out.println(out);
	}
}
