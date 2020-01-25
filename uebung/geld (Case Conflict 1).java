public class geld implements Comparable<geld>{
	int amount;
	public geld(int amount){
		this.amount = amount;
	}
	public int getAmount(){
		return this.amount;
	}
	public int compareTo(geld other){
		return this.amount - other.getAmount();
	}
}
