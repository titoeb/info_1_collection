public class ArrayTools {
	public static void BubbleSort(int[] arr, boolean print){
		boolean swapped = true;
		int tmp;

		while(swapped){
			if(print) print_array(arr);
			swapped = false;
			for(int j = 1; j < arr.length; j++){
				if(arr[j - 1] > arr[j]){
					swapped = true;
					tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				}
			}
		}
	}
	public static void SelectionSort(int[] arr, boolean print){
		int tmp;
		int min;
		for(int i = 0; i < arr.length; i++){
			if(print) print_array(arr);
			min = i;
			for(int j = i + 1; j < arr.length; j++){
				if(arr[min] > arr[j]) min = j;
			}
			tmp = arr[i];
			arr[i] = arr[min];
			arr[min] = tmp;
		}
	}
	public static void print_array(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
		public static void InsertionSort(int[] arr, boolean print){
		int tmp;
		for(int i = 1; i < arr.length; i++){
			if(print) print_array(arr);
			for(int j = i; i >= 0 && arr[j] > arr[j - 1]; j--){
				tmp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = tmp;
			}
		}
	}
	public static void main(String[] args) {
		int[] test = {5, 3, 1, 6, 2 ,7, 4, 8};
		System.out.println("BubbleSort:");
		//print_array(test);
		BubbleSort(test, true);
		//print_array(test);
		System.out.println();
		System.out.println("SelectionSort:");
		int[] test2 = {5, 3, 1, 6, 2 ,7, 4, 8};
		SelectionSort(test2, true);
		System.out.println();
		System.out.println("InsertionSort:");
		int[] test3 = {5, 3, 1, 6, 2 ,7, 4, 8};
		SelectionSort(test3, true);

	}
}
