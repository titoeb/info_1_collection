public class bigger{
	public static void main(String[] args){
		boolean increasing = true;
		int last = Integer.MIN_VALUE;
		int current;
		while(!StdIn.isEmpty()){
			current = StdIn.readInt();
			increasing = increasing && current >= last;
			last = current;
		}
		System.out.println(increasing);
	}
}
