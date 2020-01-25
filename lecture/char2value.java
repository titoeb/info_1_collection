public class char2value{
	public static void main(String[] args){
		while(!StdIn.isEmpty()){
			char c = StdIn.readChar();
			System.out.println(c + ": " + (int) c);
		}
	}
}
