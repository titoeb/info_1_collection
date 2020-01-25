public class book extends medium{
	String author;
	public book(String title, String author){
		super(title);
		this.author = author;
	}
	public void report(){
		System.out.println("The book " + super.title + " was written by " + this.author);
	}
	public static void main(String[] args){
		book test = new book("Datenbanken", "May, der Gott");
		test.report();
	}
}
