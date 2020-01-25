public class H_tree{
	public static void draw_tree(int degree, double x, double y, double size){
		double x0 = x - 0.5 * size;
		double y0 = y + 0.5 * size;
		StdDraw.line(x0, y0, x0, y0 - size);
		StdDraw.line(x0, y0 - 0.5 * size, x0 + size, y0 - 0.5 * size);
		StdDraw.line(x0 + size, y0, x0 + size, y0 - size);

		if(degree > 1){
			draw_tree(degree - 1, x0, y0, size / 2);
			draw_tree(degree- 1, x0, y0 - size ,size / 2 );		
			draw_tree(degree - 1, x0 + size, y0, size / 2);
			draw_tree(degree - 1, x0 + size, y0 - size ,size / 2);
		}
	}
	public static void main(String args[]){
		int num = Integer.parseInt(args[0]);
		StdDraw.setXscale(-1, 1);
		StdDraw.setYscale(-1, 1);
		draw_tree(num, 0, 0, 1);
	}
}
