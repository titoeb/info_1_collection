public class Knoten<Item>{
	Item data;
	Knoten<Item> next;

	public Knoten(Item o, Knoten<Item> next){
		data = o;
		this.next = next;
	}
}
