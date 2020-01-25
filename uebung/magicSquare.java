public class magicSquare{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		int[][] square = readSquare(n);
		System.out.println(isMagic(square));
	}
	public static int[][] readSquare(int n){
		int[][] square = new int[n][n];
		for(int row = 0; row < n; row++){
			for(int col = 0; col < n; col++){
				square[row][col] = StdIn.readInt();
			}			
		}
		return square;
	}
	public static boolean isMagic(int [][] cand){
		boolean is_magic = true;
		int global_sum = 0;
		
		// calcuate first col sum
		for(int row = 0; row < cand.length; row++){
			global_sum += cand[row][0];
		}
		System.out.println(global_sum);
		int local_sum;
		// calucate remaining col sums

		for(int col = 1; col < cand.length; col++){
			local_sum = 0;
			for(int row = 0; row < cand.length; row++){
				local_sum += cand[row][col];
			}
			is_magic = is_magic && local_sum == global_sum;
		}
	
		// calculate all col sums
		for(int row = 0; row < cand.length; row++){
			local_sum = 0;
			for(int col = 0; col < cand.length; col++){
				local_sum += cand[row][col];
			}
			is_magic = is_magic && local_sum == global_sum;
		}

		//calculate diagonal sums
		// digaonal: upper left, lower right
		local_sum = 0;
		for(int rowcol = 0; rowcol < cand.length; rowcol++){
			local_sum += cand[rowcol][rowcol];
		}
		is_magic = is_magic && local_sum == global_sum;

		// diagonal lower left, upper right
		local_sum = 0;
		for(int col = 0; col < cand.length; col++){
			local_sum += cand[cand.length - 1 - col][col];
		}
		is_magic = is_magic && local_sum == global_sum;
		return is_magic;
		
	}
}
