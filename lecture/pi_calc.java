public class pi_calc{
	public static void main(String[] args){
		int num_points = Integer.parseInt(args[0]);
		System.out.println(pi(num_points));
	}

	public static double pi(int n_points){
		double step = 1.0 / n_points;
		int count_rec = 0;
		int count_cir = 0;
		for(double x = 0; x <= 1; x += step){
			for(double y = 0; y <= 1; y += step){
				count_rec++;
				if(x * x + y * y <= 1) count_cir++;
			}
		}
		return 4 * (((double) count_cir) / ((double) count_rec));
	}
}


