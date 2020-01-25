public class square{
	public static void main(String[] args){
		int sq = Integer.parseInt(args[0]);
		System.out.println(sq + "^2 = " + st_square(sq));
		
	}
	public static int st_square(int n){
		int collect = 0;
		int num = 1;
		for(int i = 1; i <= n; i++){
			collect += num;
			num += 2;
		}
		return collect;
	}
}
