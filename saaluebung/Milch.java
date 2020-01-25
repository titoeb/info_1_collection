public class Milch extends Product{
	
	public Milch(String name, double preis){
		super(name, preis);
	}

	public boolean verderblich(){
		return true;
	}

	public static void main(String[] args){
		
		// Test-unit 
		Milch Supermilch = new Milch("Supermilch", 3.5);
		Milch Ultramilch = new Milch("Ultramilch", 5.5);
		System.out.println(Supermilch);
		if(Supermilch.compareTo(Ultramilch) < 0){
			System.out.println("Supermilch is more expensive than Ultramilch");
		} else {
			System.out.println("Ultramilch is more expensive than Supermilch");		
		}
	}
}
