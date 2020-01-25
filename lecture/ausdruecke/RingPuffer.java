public class RingPuffer implements queue, stack{
	/* The internal Data structures */	
	Object[] P = new Object[10];
	int first = 0;
	int count = 0;
	int array_length = 10;

	/* private methods for Ringpuffer */
	private void resize(){
		
		Object[] tmp = new Object[array_length * 2];
		for(int i = 0; i < count; i++){
			tmp[(i) % (array_length * 2)] = P[(first + i) % array_length]; 
		}

		array_length = array_length * 2;
		first = 0;
		P = tmp;
	}
	
	/* Methods for the queue */
	public Object dequeue(){
		// Are there some elements in the array?
		if(empty()){
			// There are not elements in the array, throw exception!
			throw new java.util.EmptyStackException();
		} else {
			count--;			
			return P[(first + count) % array_length];
		}
	}
	public boolean empty(){
		return count == 0;
	}

	public void enqueue(Object o){
		if(count + 1 >= array_length){
			resize();
		}
		if (first == 0){
			first = array_length - 1;			
		} else {
			first--;
		}
		P[first] = o;
		count++;
		
	}
	
	/* Methods for the stack */	
	public Object pop(){
		// Are there some elements in the array?
		if(empty()){
			// There are no elements in the array, throw exception!
			throw new java.util.EmptyStackException();
		} else {
			// Give the first element and remove it!
			count--;

			return P[(first + count) % array_length];
		}
	}

	public void push(Object o){
		// Check whether enough space
		if(count + 1>= array_length){
			resize();
		}
		P[(first + count) % array_length] = o;
		count++;
	}

	public static void main(String[] args) {
		stack s = new RingPuffer();
		queue q = new RingPuffer();
		String str;
		while (!StdIn.isEmpty()) {
			str = new String(StdIn.readLine());
			s.push( str);
			q.enqueue( str);
		}
		System.out.println("Output stack:");
		while (!s.empty() ) {
			str = (String) s.pop(); // kein cast auf String erforderlich!
			System.out.println(str);
		}
		System.out.println("Output queue:");
		while (!q.empty() ) {
			str = (String) q.dequeue(); // kein cast auf String erforderlich!
			System.out.println(str);
		}
	}
}
