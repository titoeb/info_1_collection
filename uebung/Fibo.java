public class Fibo{
	public static int fib(int in){
		int cur = 1;
		int past = 1;
		int tmp;
		while(in > 2){
			tmp = cur;
			cur = past + cur;
			past = tmp;
			in--;
		}
		return cur;
	}
	public static void main(String[] args){
		System.out.println(fib(Integer.parseInt(args[0])));
	}
}
