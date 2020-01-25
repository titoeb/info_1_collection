public class Kammerton{
	public static void main(String[] args){
		int sps = 44100;
		int hz = Integer.parseInt(args[0]);
		double duration = 4.0;
		int N = (int) (sps * duration);
		
		double[] a = new double[N + 1];
		for(int i = 0; i <= N; i++){
			a[i] = Math.sin(2 * Math.PI * hz * i / sps);
		}
		StdAudio.play(a);
	}
}
