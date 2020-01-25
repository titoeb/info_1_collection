public class Euro extends Currency{
	private final String name= "EUR";
	public String toString(){
		return super.toString() + " " + this.name;
	}
	public int getEuro(){
		return(super.getUnits());
	}
	public int getCent(){
		return(super.getFractions());
	}
	public void setCent(int cents){
		super.setFractions(cents);
		super.normalize();
	}
	public void setEuro(int euro){
		super.setUnits(euro);
		super.normalize();
	}
	public Euro(){
		super();
		super.setSeperator(',');
	}
	public Euro(int euro, int cents){
		super(euro, cents);
		super.setSeperator(',');
	}
		public static void main(String[] args){
		// Test-Unit for Currency
		// simple creation
		Euro test1 = new Euro(3, 4);
		System.out.println(test1);

		// creatino that has to be normalized
		Euro test2 = new Euro(3, 100);
		System.out.println(test2);

		// negative value for fractions
		Euro test3 = new Euro(-3, -89);
		System.out.println(test3);
		
		Euro test4 = new Euro(3, -89);
		System.out.println(test4);

		// negative value for fractions + normalizing
		Euro test5 = new Euro(5, -189);
		System.out.println(test5);
	}	
}

