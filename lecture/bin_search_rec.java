public class bin_search_rec{

	public static void main(String[] args){
		int[] test_array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9 ,10, 11};
		System.out.print("The test array is: ");
		for(int i = 0; i < test_array.length; i++){
			System.out.print(test_array[i]);
		}
		int value = Integer.parseInt(args[0]);
		System.out.println();
		System.out.println("The value " + value + " was found at position " + bin_search_rec(test_array, 0, test_array.length , value));
		
	}
	public static int bin_search_rec(int[] field, int start, int end, int value){
		if (start == end) return start;
		else{
			int median = (end + start) / 2;
			if(value > field[median]) return bin_search_rec(field, median + 1, end, value);
			else {
				if(value < field[median]) return bin_search_rec(field, start, median - 1, value);
				else return median;
			}
		}
	}
}
