public class fun{
	public static void draw_fun(double start, double end, int n_step){
		double step_size = (end - start) / n_step;
		
		StdDraw.setYscale(-2, 2);
		StdDraw.setXscale(start,end);

		for(double pos = start; pos <= end; pos += step_size){
			StdDraw.line(pos, this_fun(pos), pos + step_size, this_fun(pos + step_size));
		}
	}
	public static double this_fun(double x){
		return Math.sin(4 * x) + Math.sin(20 * x);
	}
	public static void main(String[] args){
		double start = Double.parseDouble(args[0]);
		double end = Double.parseDouble(args[1]);
		int steps = Integer.parseInt(args[2]);
		draw_fun(start, end, steps);
	}
}
