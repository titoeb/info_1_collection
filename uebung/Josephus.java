public class Josephus{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		int s = Integer.parseInt(args[1]);
		int[] jos = josephusPermutation(n, s);
		for(int i = 0; i < jos.length; i++){
			System.out.print(jos[i] + " ");
		}
		System.out.println();
		
	}
	public static int[] josephusPermutation(int length, int step){
		int[] circle = new int[length];
		for(int i = 0; i < length; i++) circle[i] = -1;
		josephusRecursive(circle, 0, step);
		return circle;

	}
	private static void josephusRecursive(int[] circle, int last, int step){
		if(circle[last] == circle.length) return;
		
		int round = circle[last];

		if(round == circle.length) return;


		if(round == -1){
			// first step
			circle[(step - 1) % circle.length] = 1;
			josephusRecursive(circle, (step - 1) % circle.length, step);
		} else {
			// normal step;
			int count = step;
			int pos = last;
			while(count > 0){
				pos = (pos + step - 1) % circle.length;
				if(circle[pos] == -1) count--;
			}
			circle[pos] = round + 1;
			josephusRecursive(circle, pos, step);
		}
	}
}

