public class Sort{
	public static void swap(int[] field, int i, int j){
		if(i > field.length - 1) throw new IndexOutOfBoundsException("Cannot select element at position " + i + " out of Array with size " + field.length);
		if(j > field.length - 1) throw new IndexOutOfBoundsException("Cannot select element at position " + j + " out of Array with size " + field.length);
		
		int tmp;
		tmp = field[i];
		field[i] = field[j];
		field[j] = tmp;
	}

	public static int pos_min(int[] field, int start){
		int min = field[start];
		int min_pos = start;
		for(int i = start + 1; i < field.length; i++){
			if(field[i] < min){
				min_pos = i;
				min = field[i];
			}		
		}
		return min_pos;
	}

	public static void selection_sort(int[] field){
		int min_pos;
		for(int i = 0; i < field.length; i++){
			min_pos = pos_min(field, i);
			if(field[min_pos] < field[i]){
				swap(field, i, min_pos);
			}
		}
	}

	public static void insertion_sort(int[] field){
		boolean swapped = true;
		while(swapped){
			swapped = false;
			for(int i = 1; i < field.length; i++){
				if(field[i - 1] > field[i]){
					swap(field, i - 1, i);
					swapped = true;
				}
			}
		}

	}
	public static void main(String args[]){
		int[] test = new int[10];
		int[] test2 = new int[10];
		System.out.print("The field is: ");
		for(int i = 0; i < 10; i++){
			test[i] = (int) (Math.random() * 100);
			test2[i] = test[i];
			System.out.print(test[i] + " ");
		}
		System.out.println();
		selection_sort(test);
		System.out.print("Sorting the field with selection_sort results in: ");
		for(int i = 0; i < 10; i++){
			System.out.print(test[i] + " ");
		}
		System.out.println();
		insertion_sort(test2);
		System.out.print("Sorting the field with insertion_sort results in: ");
		for(int i = 0; i < 10; i++){
			System.out.print(test2[i] + " ");
		}
		System.out.println();
	}
}
