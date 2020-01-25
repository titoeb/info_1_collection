public class MyClass {
    public static void main(String args[]) {
        int[] test = {93, 3, 12, 4, 9 , 1, 33, 12};
        show(test);
        msort(test);
        show(test);
    }
    public static void show(int[] array){
        for(int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
        System.out.println();
    }
    public static void msort(int[] array){
        msort(array, 0, array.length);
    }
    public static void msort(int[] array, int low, int hi){
        int n = hi - low;
        
        // An array of length 1 is already sorted
        if(n <= 1) return;
        
        // Determine the middle
        int mid = low + n / 2;
        
        // Recursively sort the upper or lower half
        msort(array, low, mid);
        msort(array, mid, hi);
        
        // Now the work begins. Always assume the the parts of the array are always sorted, as they are because of the recursive call of the function
        // Create a tempory field to keep to elements;
        int[] tmp = new int[n];
        
        // No put the elements of the arrays into the help array by their seized;
        int i = low, j = mid, k;
        for(k = 0; i < mid && j < hi; k++){
            if(array[j] > array[i]){
                // The first element of the second half is smaller
                tmp[k] = array[i];
                i++;
            } else {
                tmp[k] = array[j];
                j++;
            }
        }
        
        // No we either all elements of the first half of array, or the second half of the array are in the tmp array in correct order
        // Therefore, now the remaining elements have to be inserted behind the other ones. As they are still sorted the order will be correct
        while(i < mid){
            tmp[k] = array[i];
            i++;
            k++;
        }
        while(j < hi){
            tmp[k] = array[j];
            j++;
            k++;
        }
        // Finally we have to copy the elements of the temporary array in the final one
        for(i = 0; i < tmp.length; i++) array[low + i] = tmp[i];
    }
}

