public class Brownian{
	public static void Brown(double x0, double y0, double x1, double y1, double prec){
		if(Math.abs(x0 - x1) < prec){
			StdDraw.line(x0, y0, x1, y1);
		} else {
			double sigma = (Math.random() - 0.5) / 5;
			Brown(x0, y0, (x0 + x1) / 2, (y0 + y1) / 2 + sigma, prec);
			Brown((x0 + x1) / 2, (y0 + y1) / 2 + sigma, x1, y1, prec);
		}
	}
	public static void main(String[] args){
		double prec = Double.parseDouble(args[0]);
		Brown(0, 0.5, 1, 0.5, prec);
	}
}
