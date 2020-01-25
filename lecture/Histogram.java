public class Histogram{
	int[] hist;
	int max;
	public Histogram(int N){
		hist = new int[N + 1];
		max = N;
	}
	public void addData(int in){
		if (in > max) throw new RuntimeException("This histogram can only save values up to " + max);
		hist[in]++;
	}
	public void addData(int[] in){
		for(int i = 0; i < in.length; i++){
			if (in[i] > max) throw new RuntimeException("This histogram can only save values up to " + max + " and at position " + i + " the value " + in[i] + " was found!");
			hist[in[i]]++;
		}
	}

	public void draw(){
		int max = hist[0];
		for(int i = 1; i < hist.length; i++){
			if(hist[i] > max) max = hist[i];
		}
		StdDraw.setXscale(0, hist.length - 1);
		StdDraw.setYscale(0, max);
		for(int i = 0; i < hist.length; i++){
			StdDraw.filledRectangle(i + 0.5, 0, 0.475 , 0.5 * hist[i]);
		}
	}	
	public static void main(String[] args){
		// simulate some data
		int max = Integer.parseInt(args[0]);
		int size = Integer.parseInt(args[1]);
		int[] data = new int[size];
		for(int i = 0; i < size; i++){
			data[i] = (int) (Math.random() * max);
		}		
		Histogram test = new Histogram(max);
		test.addData(data);
		test.draw();
	}
}
