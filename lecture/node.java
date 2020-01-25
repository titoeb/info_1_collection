public class node{
	private double data = 0.0;
	private node next = null;

	public node get_next(){
		return next;
	}

	public void set_next(node next){
		this.next = next; 
	}
	public double get_data(){
		return this.data;
	}
	public node(double data, node next){
		this.data = data;
		this.next = next;
	}
}
