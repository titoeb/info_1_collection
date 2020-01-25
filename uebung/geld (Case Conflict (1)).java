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
}
