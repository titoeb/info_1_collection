public class Dollar extends Currency{
	public static final double EURO_RATE = 0.8152;
	public static final double ARIARY_RATE = 3245.0;
	private final String name= "Dollar";
	public String toString(){
		return super.toString() + " " + this.name;
	}
	public int getDollar(){
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
	private Dollar exchange(Currency other, int frac_per_unit, double change){
		int Fractions = other.getFractions() + other.getUnits() * frac_per_unit;
		return new Dollar(0, (int) (Fractions * change));
	}
	public Dollar exchange(Euro other){
		return exchange((Currency) other, 100, EURO_RATE);
	}
	public Dollar exchange(Ariary other){
		return exchange((Currency) other, 5, EURO_RATE);
	}
	public Dollar(){
		super();
		super.setSeperator('.');
	}
	public Dollar(int euro, int cents){
		super(euro, cents);
		super.setSeperator('.');
	}
		public static void main(String[] args){
		// Test-Unit for Currency
		// simple creation
		Dollar test1 = new Dollar(3, 4);
		System.out.println(test1);

		// creatino that has to be normalized
		Dollar test2 = new Dollar(3, 100);
		System.out.println(test2);

		// negative value for fractions
		Dollar test3 = new Dollar(-3, -89);
		System.out.println(test3);
		
		Dollar test4 = new Dollar(3, -89);
		System.out.println(test4);

		// negative value for fractions + normalizing
		Dollar test5 = new Dollar(5, -189);
		System.out.println(test5);
	}	
}

