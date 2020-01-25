public class evaluate{
	char[] input;
	char[] operators = new char[0];
	int[] values = new int[0];
	public evaluate(char[] input){
		this.input = input;
	}
	public int get_result(){
		process();
		return values[0];	
	}

	private void process(){
		evaluate_input();
		compute_result();
	}

	private void evaluate_input(){
		if(input_empty()) throw new IllegalArgumentException("Please prove some input");
		for(int i = 0; i < input.length; i++){
			if(is_allowed_operator(input[i])){
				if(values_empty()) throw new IllegalArgumentException("The input has to start with a number but started with the operator " + input[i]);
				if(input[i] == '*'){
					int last = remove_value();
					int next = input[i + 1] - '0';
					append_value(last * next);
					i++;
				} else {
					append_operator(input[i]);
				}
			} else { if(Character.isDigit(input[i])){
				append_value(input[i] - '0');

			} else throw new IllegalArgumentException("Element " + i + " of input string is neither a number nor +, - or * but a " + input[i]);

			} 
		}
	}
	public void compute_result(){
		int cur = 0;
		int last = 0;
		char cur_op;
		while(!values_one_left()){
			cur = remove_value();
			last = remove_value();
			cur_op = remove_operator();
			if(cur_op == '+'){
				append_value(cur + last);
			} else {
				if(cur_op == '-') append_value(last - cur);
				else throw new IllegalArgumentException("Internal array operators does contain inavlid operators!");
			}
		}
	}
	private boolean values_one_left(){
		return values.length < 2;
	}
	private boolean is_allowed_operator(char op){
		return op == '+' || op == '-' || op == '*';
	}
	private boolean operators_empty(){
		return operators.length == 0;
	}
	private boolean values_empty(){
		return values.length == 0;
	}
	private boolean input_empty(){
		return input.length == 0;
	}
	
	private void append_operator(char new_op){
		char[] tmp = new char[operators.length + 1];
		for(int i = 0; i < operators.length; i++){
			tmp[i] = operators[i];
		}
		tmp[operators.length] = new_op;
		operators = tmp;
	}
	private void append_value(int new_val){
		int[] tmp = new int[values.length + 1];
		for(int i = 0; i < values.length; i++){
			tmp[i] = values[i];
		}
		tmp[values.length] = new_val;
		values = tmp;
	}
	private char remove_operator(){
		if (operators.length > 0){
			char return_val = operators[operators.length - 1];
			char[] tmp = new char[operators.length - 1];
			for(int i = 0; i < operators.length - 1; i++){
				tmp[i] = operators[i];
			}
			operators = tmp;
			return return_val;
		} else {
			throw new  ArrayIndexOutOfBoundsException("Internal array operators is empty and no element can be removed!");
		}
	}
	private int remove_value(){
		if (values.length > 0){
			int return_val = values[values.length - 1];
			int[] tmp = new int[values.length - 1];
			for(int i = 0; i < values.length - 1; i++){
				tmp[i] = values[i];
			}
			values = tmp;
			return return_val;
		} else {
			throw new  ArrayIndexOutOfBoundsException("Internal array values is empty and no element can be removed!");
		}
		
	}
	public static void main(String[] args){
		if(args.length < 1 || args.length > 1) throw new IllegalArgumentException("Please provide one string containing the calculation!");
		char[] input = new char[args[0].length()];
		for(int i = 0; i < input.length; i++){
			input[i] = args[0].charAt(i);
		}
		evaluate test = new evaluate(input);
		System.out.println("Result is: " + test.get_result());
	}
}
