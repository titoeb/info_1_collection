public class GameOfLife{
	private boolean alive[][];
	private int n;

	public GameOfLife(int n){
		this.n = n;
		alive = new boolean[n][];
		for(int i = 0; i < n; i++){
			alive[i] = new boolean[n];
		}
		for(int row = 0; row < n; row++){
			for(int col = 0; col < n; col++){
				alive[row][col] = Math.random() < 0.5 ? true : false;
			}
		}
	}

	public void show(){
		StdDraw.clear();
		double unit = 1.0 / n ;
		for(int row = 0; row < n; row++){
			for(int col = 0; col < n; col++){
				if(alive[row][col]) StdDraw.filledRectangle((n - 1 - row) * unit + 0.5 * unit, (n - 1 - col) * unit + 0.5 * unit, unit / 2.0, unit / 2.0);
			}
		}
	}

	public void run(){
		int count;
		for(int row = 0; row < n; row++){
			for(int col = 0; col < n; col++){
				count = count(row, col);
				if(count == 3) alive[row][col] = true;
				else{
					if(count == 1) alive[row][col] = false;
					else{
						if(count > 3) alive[row][col] = false;		
					}
				}
			}
		}
		
	}
	private int count(int row, int col){
		int sum = 0;
		for(int i = -1; i < 2; i++){
			for(int j = -1; j < 2; j++){
				if(!(i == 0 && j == 0)) sum += getElement(row + i, col + j);
			}
		}
		return sum;
	}
	private  int getElement(int row, int col){
		if(row < 0 || row > n -1) return 0;
		if(col < 0 || col > n -1) return 0;
		if(alive[row][col]) return 1;
		else return 0;
	}
	public static void sleepy(){
		try
		{
		    Thread.sleep(500);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
	}

	// Test - unit
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		GameOfLife test = new GameOfLife(n);
		for(int i = 0; i < 20; i++){
			test.show();
			test.run();
			sleepy();
		}
	}
}
