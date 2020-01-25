import java.util.Arrays;
public class SortierClient{
	public static void main(String[] args){
		final int N = Integer.parseInt(args[0]);
		Comparable[] f = new String[N];
		for(int i = 0; i < N; i++){
			f[i] = StdIn.readString();
		}
		Arrays.sort(f);
		for(int i = 0; i < N; i++){
			System.out.println(f[i]);
		}
	}
}
