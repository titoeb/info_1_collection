public class circle{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		double p = Double.parseDouble(args[1]);
		double step = 2 * Math.PI / (n - 1);
		double min = 0.1;
		double max = 0.2;
		StdDraw.setXscale(-1, 1);
		StdDraw.setYscale(-1, 1);
		double x, y , rad;
		for(int i = 0; i < n; i++){
			x = Math.random();
			y = Math.random();
			rad = Math.random() * (max - min);
			if(Math.random() > 0.5) StdDraw.setPenColor(StdDraw.BLACK);
			else StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledCircle(x, y , rad);
		}
	}
}
