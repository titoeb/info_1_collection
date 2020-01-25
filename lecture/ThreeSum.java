public class ThreeSum{
	// Variable containing the possible numbers
	private int[] numbers;

	public int count(){
		// Count the number of three sums in the array numbers
		int count = 0;
		for(int i = 0; i < numbers.length; i++){
			for(int j = i + 1; j < numbers.length; j++){
				for(int k = j + 1; k < numbers.length; k++){
					if(i != j && j != k){
						if(numbers[i] + numbers[j] + numbers[k] == 0) count++;
					}
				}
			}
		}
		return count;
	}
	public void printAll(){
		// Count the number of three sums in the array numbers
		int count = 0;
		for(int i = 0; i < numbers.length; i++){
			for(int j = i + 1; j < numbers.length; j++){
				for(int k = j + 1; k < numbers.length; k++){
					if(i != j && j != k){
						if(numbers[i] + numbers[j] + numbers[k] == 0) 
							System.out.println(numbers[i] + " + " + numbers[j] + " + " + numbers[k] + " = 0");
					}
				}
			}
		}
	}

	public ThreeSum(int len, int[] numbers){
		this.numbers = new int[len];
		for(int i = 0; i < len; i++){
			this.numbers[i] = numbers[i];
		}
	}
	public static void main(String[] args){
		// Test-unit

		// Read-in array
		System.out.println("How many elements will the array have?");
		int len = StdIn.readInt();
		System.out.println("Please give the " + len + " integer.");
		int[] num = new int[len];
		for(int i = 0; i < len; i++){
			num[i] = StdIn.readInt();
		}

		ThreeSum test = new ThreeSum(len, num);
		System.out.println("There are " + test.count() + " Three-Sum numbers in there!");
		test.printAll();
	}
}
