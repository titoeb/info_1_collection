public class jos_perm{
	public static int[] josephusPermutation(int length, int step){
		int[] circle = new int[length];
		for(int i = 0; i <length; i++) circle[i] = -1;
		josephusRecursive(circle, 0, step);
		return circle;
	}
	private static void josephusRecursive(int[] circle, int last, int step){
		// First we have to found out in which round we are
		int cur_round;
		if (circle[last] == -1) cur_round = 1;
		else cur_round = circle[last] + 1;

		// If the current round cur_round is equal to the length of circle we are done
		if(cur_round <= circle.length){
			// We have some work to do!
			// First of all we have to find the position pos at which the next number will be taken!
			int pos;
			if(cur_round == 1){
				// We know that still all numbers are still in the circle.
				// minus one since the first number at pos 0 is still in the ring and is counted as the first step.
				circle[(last + step - 1) % circle.length] = cur_round;
				josephusRecursive(circle, (last + step - 1) % circle.length, step);
			} else {
				pos = last;
				int step_loc = step;
				while(step_loc > 0){
					pos = (pos + 1) % circle.length;
					if (circle[pos] == -1) step_loc--;
				}
				circle[pos] = cur_round;
				josephusRecursive(circle, pos, step);
			}
		}

		
		
	}
	public static void main(String[] args){
		int length = Integer.parseInt(args[0]);
		int step  = Integer.parseInt(args[1]);
		int[] jos = josephusPermutation(length, step);
		System.out.print("The Permutation is: ");
		for(int i = 0; i < jos.length; i++){
			System.out.print(jos[i] + " ");
		}
		System.out.println();
	}
}
