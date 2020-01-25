public class wc{
	public static void main(String[] args){
		int word_count = 0;
		String word;
		while(!StdIn.isEmpty()){
			word = StdIn.readString();
			word_count++;
		}
		System.out.println(word_count);
	}
}
