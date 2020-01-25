public class PowersOfTwo{
	public static void main(String[] args){
		int iter;
		int p = 1;
		for (iter = 0; iter < 30; ++iter){
			System.out.println(iter + " " + p);
			p = 2 * p;
		}
	}
}
