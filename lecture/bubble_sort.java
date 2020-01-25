public class bubble_sort{
	public static void main(String[] args){
		int len = Integer.parseInt(args[0]);
		int[] array = new int[len];
		System.out.print("Array before sorting: ");
		for(int i = 0; i < len; i++){
			array[i] = rand_int(len);
			System.out.print(array[i]);
		}
		System.out.println();
		bubble_sort(array);
		System.out.print("Array after sorting: ");
		for(int i = 0; i < len; i++){
			System.out.print(array[i]);
		}
		System.out.println();		
	}
	public static int rand_int(int max){
		return (int) (Math.random() * (double) max);
	}
	
	public static void bubble_sort(int[] array){
		boolean swapped = false;
		int tmp;
		do{	swapped = false;
			for(int i = 1; i < array.length; i++){
				if(array[i - 1] > array[i]){
					tmp = array[i - 1];
					array[i - 1] = array[i];
					array[i] = tmp;
					swapped = true;										
				}
			}
		}
		while(swapped);
	}
}
