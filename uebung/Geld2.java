public class Geld2{
	private int euro , cent ;
	// Konstruktor
	public int getEuro(){
		return this.euro;
	}
	public int getCent(){
		return this.cent;
	}
	public Geld2(int euro, int cent) {
		this.euro = euro;
		this.cent = cent;
		normalize();
	}
	private void normalize(){
		this.euro += this.cent / 100;
		this.cent = this.cent % 100;
	}
	public boolean equals(Geld2 o){
		int cent_own = this.euro * 100 + this.cent;
		int cent_other = o.getEuro() * 100 + o.getCent();
		return cent_own == cent_other;
	}
	public void add(Geld2 g){
		this.cent += g.getCent();
		this.euro += g.getEuro();
		normalize();
	}
	public String toString(){
		if(this.cent < 10) return this.euro + ",0" + this.cent + " Euro";
		else return this.euro + "," + this.cent + " Euro";
	}
	public static void main(String[] args){
		Geld2 test1 = new Geld2(7, 101);
		System.out.println(test1);
		Geld2 test2 = new Geld2(7, 101);
		System.out.println(test1.equals(test2));
		test1.add(test2);
		System.out.println(test1);	
	}
}
