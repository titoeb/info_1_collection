public class film extends medium{
	int length;
	public film(String title, int length){
		super(title);
		this.length = length;
	}
	public void report(){
		System.out.println("The movie " + super.title + " is " + this.length + " long");
	}
	public static void main(String[] args){
		film test = new film("The Database", 10000);
		test.report();
		
	}

}
