interface Stack<Item>{
	public boolean empty();
	public void push(Item o);
	public Item pop();
}
public class EVLStack<Item> implements Stack<Item>{ 
    private class Knoten { // innere Klasse
	Item data; Knoten next;
	Knoten (Item d, Knoten n) {
	data = d; next = n;}
    }
   
    private Knoten first;
    public boolean empty() { return (first == null); }    
    public void push(Item d) { 
	first = new Knoten( d, first);}
    public Item pop() {
	if ( empty())
	    throw new RuntimeException("pop() von leerem Stack!");
	Item d = first.data;
	first = first.next;
	return d;
    }
    public static void main(String[] args) { // Test-Unit
	Stack<String> s = new EVLStack<String>(); 
	String str;
	while (!StdIn.isEmpty()) {
	    str = new String(StdIn.readLine());
	    s.push( str);
	}
	while (!s.empty() ) { 
	    str = s.pop();  // kein cast auf String erforderlich!
	    System.out.println(str);
	}
    }
}





    

