public class boyer_moore{
	public static void main(String[] args){
		char cur = '*';
		int count = 0;
		char tmp;
		while(!StdIn.isEmpty()){
			tmp = StdIn.readChar();
			if(tmp == cur){
				count++;
			} else {
				if(count == 0){
					cur = tmp;
					count++;
				} else {
					count--;
				}
			}
			StdIn.readLine();
			//System.out.println("cur: " + cur + " count: " + count);
		}
		System.out.println("Winner is " + cur + " With a count of " + count);
	}
}
