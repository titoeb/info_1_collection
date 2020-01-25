public class Geld{
	private int euro, cent;

	// Constructor
	public Geld(int e, int c){
		save_enter(e, c);
	}
	private void save_enter(int e, int c){
		int euro = e;
		int cent = c;
		if(cent > 99){
			euro += cent / 100;
			cent = cent % 100;
		}
		this.euro = euro;
		this.cent = cent;
	}
	public boolean equals(Geld b){
		if(this.euro == b.euro && this.cent == b.cent) return true;
		else return false;
	}
	public void add(Geld g){
		save_enter(this.euro + g.euro, this.cent + g.cent);
	}
	public String toString(){
		return this.euro + "," + this.cent + " Euro";
	}
	public static void main(String args[]){
		System.out.println("Please enter first amount!");
		Geld test1 = new Geld(StdIn.readInt(), StdIn.readInt());
		System.out.println(test1);
		System.out.println("Please enter second amount!");
		Geld test2 = new Geld(StdIn.readInt(), StdIn.readInt());
		System.out.println("geld1.equals(geld2) == " + test1.equals(test2));
		test1.add(test2);
		System.out.println("geld1.add(geld2) == " + test1);
	}
}
