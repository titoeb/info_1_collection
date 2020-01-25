public class Collatz{
	public static void collatzIterativOutput(int n){
		int val = n;
		int index = 0;
		while(index < (Integer.MAX_VALUE - 1) && n != 1 && n < (Integer.MAX_VALUE - 1) / 3){
			val = coll_next(val);
			System.out.println(index + ": " + val);
			index++;
		}
	}
	public static int coll_next(int curr){
		if(curr % 2 == 0) return curr / 2;
		else return 3 * curr + 1;	

	}
	static int [] collatzIterativ(int n){
		int[] coll = new int[1];
		coll[0] = n;
		for(int i = 0; coll[i] != 1 && coll[i] < (Integer.MAX_VALUE - 1) / 3; i++){
			coll = appendInt(coll, coll_next(coll[i]));
		}
		if(coll[coll.length - 1] == 1) return coll;
		else return null;
	}
	public static int[] appendInt(int[] a, int b){
		int[] ret = new int[a.length + 1];
		for(int i = 0; i < a.length; i++) ret[i] = a[i];
		ret[a.length] = b;
		return ret;
	}
	public static void main(String[] args){
		if(args.length < 1 || args.length > 2) throw new RuntimeException("Please provide one or two arguments!");
		int n = Integer.parseInt(args[0]);
		if(args.length == 1){
			int[] res = collatzIterativ(n);
			for(int i = 0; i < res.length; i++){
				System.out.print(res[i] + " ");
			}
			System.out.println();
		} else {
			int m = Integer.parseInt(args[1]);
			int[] res;
			for(int i = n; i <= m; i++){
				if(collatzIterativ(i) == null) System.out.println(i + ": Keine Aussage");
				else System.out.println(i + ": Gilt");
			}			
		}
	}
	
}
