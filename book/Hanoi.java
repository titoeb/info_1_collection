public class Hanoi{
	private int[][] stapel= null;
	public Hanoi(int n){
		
		stapel = new int[3][];
		// Create the three staples
		stapel[0] = new int[n];
		stapel[1] = new int[n];
		stapel[2] = new int[n];
		
		for(int i = 0; i < n; i++){
			stapel[0][i] = i + 1;
		}
	}

	public void draw(){
		StdDraw.setXscale(0.0, 1.0);
		StdDraw.setYscale(0.0, 1.0);
		
		double res = 0.00000001;
		double unit_x =  1.0 / (3 * (stapel[0].length + 1) + 2 * res);
		double unit_y =  1.0 / ((stapel[0].length + 1 + res));
		
		
		// Draw the sticks
		StdDraw.rectangle(5.5 * unit_x, 0.0 , 0.02, 0.9);
		StdDraw.rectangle(16.5 * unit_x, 0.0 , 0.02, 0.9);
		StdDraw.rectangle(27.5 * unit_x, 0.0 , 0.02, 0.9);

		// Draw the plates on each stick
		// stick 1
		double x_start;
		for(int stp = 0; stp < 3; stp++){
			x_start = (stp + 1) * res + stp * unit_x;
			int n = stapel[stp].length;
			for(int i = 0; i < n; i++){
				if(stapel[stp][i] != 0){
					System.out.println("This will start at " + (( (double) (n + 1 - stapel[stp][i]) * unit_x)));
					StdDraw.rectangle(x_start + (((n + 1 - stapel[stp][i]) * unit_x)), unit_y * (n - i), stapel[stp][i] * unit_x / 2, unit_y / 2 );	
				}
			}	
		}
			

		// stick 2

		// stick 3

		
	}

	// Test-client
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		Hanoi test = new Hanoi(n);
		test.draw();
	}
}
