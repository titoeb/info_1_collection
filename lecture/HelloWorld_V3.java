public class HelloWorld_V3{
	public static void main(String[] args){
		String out = args[0];
		System.out.print(" ");
		for(int i = 0; i < (out.length() + "Hello ".length()) + 1; i++){
			System.out.print("_");
		}
		System.out.println();
		System.out.print("/");
		for(int i = 0; i < (out.length() + "Hello ".length()); i++){
			System.out.print(" ");
		}
		System.out.print(" \\");
		System.out.println();
		System.out.println("| Hello " + out + " \\");

		System.out.print("\\");
		for(int i = 0; i < (out.length() + "Hello ".length() + 3); i++){
			System.out.print("_");
		}
		System.out.print("\\");
		System.out.println();
	}
}
