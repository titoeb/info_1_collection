public class Geld {
	private int euro , cent ;
	// Konstruktor
	public Geld (int euro, int cent) {
		this.euro = euro;
		this.cent = cent;
		normalize();
	}
	private void normalize(){
		this.euro += this.cent / 100;
		this.cent = this.cent % 100;
	}
	public boolean equals(Geld o){
		int cent_own = this.euro * 100 + this.cent;
		int cent_other = e.euro * 100 + o.cent;
		return cent_own == cent_other;
	}
	public void add(Geld g){
		this.cent += g.cent;
		this.euro += g.euro;
		normalize();
	}
	public String toString(){
		if(this.cent < 10) return this.euro + ",0" + this.cent + "Euro";
		else return this.euro + "," + this.cent + "Euro";
	}
	public static void main(String[] args){

	}
}
