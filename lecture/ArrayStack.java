public class ArrayStack implements Stack{

	private int max = 16;
	private int count;
	private Object[] elements;
	
	// Constructor
	public EVLStack(){
		count = null;
		elements = new Object[max];
	}

	// All Operation
	// Is the stack empty?
	public boolean empty(){
		return first == 0;
	}

	// Add another object on the stack
	public void push(Object o){
		element[count] = o;
		count++;
	}

	// Give the first object on the stack
	public Object pop() {
		if(empty()) 
			throw new RuntimeExeception("Pop is not defined for an empty stack!");
		count--;
		return elements[count + 1];
	}
}
