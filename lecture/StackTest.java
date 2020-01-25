public class StackTest{
	public static void main(String[] args){
		Stack<String> s = new EVLStack<String>();

		String str;
		while(!StdIn.isEmpty()){
			str = new String(StdIn.readLine());
			s.push(str);
		}
		while(!s.empty()){
			str = s.pop();
			System.out.println(str);
		}
	}
}
