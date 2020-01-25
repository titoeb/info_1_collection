public class rumors{
	public static void main(String[] args){
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		System.out.println("The average probabilty of people knowing is " + simulate_rumor(n1, n2));

	}
	public static double simulate_rumor(int n_peope, int simulations){
		double[] prop = new double[simulations];
		for(int i = 0; i < simulations; i++){
			prop[i] = ((double) count(simu_run(n_peope)) )/ simulations;
		}
		double sum = 0;
		for(int i = 0; i < simulations; i++){
			sum += prop[i];
		}
		return sum / simulations;
			
	}
	public static int count(boolean[] input){
		int sum = 0;
		for(int i = 0; i < input.length; i++){
			if(input[i]) sum++;
		}	
		return sum;
	}
	public static boolean[] simu_run(int number){
		boolean[] knowing = new boolean[number];
		int next = (int) (Math.random() * number);
		int last;
		while(!knowing[next]){
			knowing[next] = true;
			last = next;
			next = (int) (Math.random() * (number - 1));
			if(next >= last) next++;
		}
		return knowing;
		
	}

}
