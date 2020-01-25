public class EVLStack<Item> implements Stack<Item>{

	Knoten<Item> first;
	
	// Constructor
	public EVLStack(){
		first = null;
	}

	// All Operation
	// Is the stack empty?
	public boolean empty(){
		return first == null;
	}

	// Add another object on the stack
	public void push(Item o){
		first = new Knoten<Item>(o, first);
	}

	// Give the first object on the stack
	public Item pop() {
		if(empty()) 
			throw new RuntimeException("Pop is not defined for an empty stack!");
		Item o = first.data;
		first = first.next;
		return o;
	}
}
