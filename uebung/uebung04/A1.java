public class A1{
	public static void main(String[] args){
	// Read in n
	int n = Integer.parseInt(args[0]);

	// Check whether n > 0 else abort.		
	if (n <= 0){
		System.out.println("The value has to be larger than zero!");
		return;
	}

	// Create int array;
	int[] randints = new int[n];
	
	// Fill the array with random numbers!

	//System.out.println("The numbers were:");
	for(int i = 0; i < n; i++){
		randints[i] = (int) ((Math.random() * (n)) + 1 );
		//System.out.print(randints[i] + " " );
	}
	// System.out.println();

	// create aggregator that will contain the arithmetic and geometric average
	double a = 0.0; // arithmetic
	double b = 1.0; // geometric
	
	for(int i = 0; i < n; i++){
		a+= (double) randints[i];
		b*= (double) randints[i];
	}
	
	// normalize the two cumsum / cumprod
	a = a / n;
	b = Math.pow(b, 1.0 / n);
	//System.out.println("a: " + a + " b: " + b);

	// Check whether the arithmetic mean is greater equal the geometric average
	if (a >= b){
		System.out.println("OK");
	} else {
		System.out.println("WIEDERLEGT");	
	}

	}
}
