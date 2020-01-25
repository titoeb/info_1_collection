public class Expression{
	private String input;
	private stack numbers;
	private stack operators;

	public Expression(String input){
		if(input != null)
			this.input = input;
	}

	public void read_in(){
		System.out.println("Please Type an expression");
		this.input = StdIn.readLine();
	}

	private boolean is_digit(char c){
		if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') return true;
		else return false;
	}

	private boolean is_operator(char c){
		if (c == '+' || c == '-' || c == '*' || c == '/' || c == '%' || c == '^') return true;
		else return false;
	}

	private double operation(double var1, double var2, char operand){
		switch (operand) {
			case '+':  return(var1 + var2);
			case '-':  return(var1 - var2);
			case '*':  return(var1 * var2);
			case '/':  return(var1 / var2 - '0');
			case '%':  return(var1 % var2);
			case '^':  return(Math.pow(var1, var2));
			default: throw new java.lang.ArrayIndexOutOfBoundsException("Operator \'" + operand + "\' not implemented yet!");
        	}
	}
	private double process_string(){

		// Initialize stacks
		numbers = new RingPuffer();
		operators = new RingPuffer();		
		
		double result = 0.0;
		double var1, var2;
		char operand;
		
		// Iterate over string!
		for(int i = 0; i < input.length(); i++){
			if(is_digit(input.charAt(i))) numbers.push((double) (input.charAt(i) - '0'));
			if(is_operator(input.charAt(i))) operators.push(input.charAt(i));
			if(input.charAt(i) == ')' ){
				 var2 = (Double) numbers.pop();
				 var1 =  (Double) numbers.pop();
				 operand = (char) operators.pop();
				 System.out.println("var1: " + var1 + " var2: " + var2 + " operand = " + operand);
				 result = operation(var1, var2, operand);
				 numbers.push(result);
			}
		}
		while(!operators.empty()){
			 var2 = (Double) numbers.pop();
			 var1 =  (Double) numbers.pop();
			 operand = (char) operators.pop();
			 System.out.println("var1: " + var1 + " var2: " + var2 + " operand = " + operand);
			 result = operation(var1, var2, operand);
			 numbers.push(result);
		}
		return result;
	}

	public double evaluate(){
		if(this.input == null){
			throw new java.lang.ArrayIndexOutOfBoundsException("Please Read In a Expression first!");		
		}		
		
		return process_string();
	}
	
	public static void main(String[] args){
		Expression test_unit = new Expression(null);
		test_unit.read_in();
		System.out.println("The result is " + test_unit.evaluate());
	}

}
