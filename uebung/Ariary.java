public class Ariary extends Currency{
	public String toString(){
		return Integer.toString(super.getUnits()) + " MAG, " + Integer.toString(super.getFractions()) + " Iraimbilanja.";
	}
	public int getAriary(){
		return(super.getUnits());
	}
	public int getIraimbilanja(){
		return(super.getFractions());
	}
	public Ariary(){
		super();
		super.setSeperator(',');
	}
	public Ariary(int ariary, int iraimbilanja){
		super(ariary, iraimbilanja);
		super.setSeperator(',');
		normalize();
		
	}
	public void normalize(){
		if(super.getFractions() < 0) super.setFractions(-super.getFractions());
		if(super.getUnits() > 0){
			super.setUnits(super.getUnits() + super.getFractions() / 5);
			super.setFractions(super.getFractions() % 5);
		} else {
			super.setUnits(- ((-super.getUnits() )+ super.getFractions() / 5));
			super.setFractions(super.getFractions() % 5);
		}
	}
		public static void main(String[] args){
		// Test-Unit for Currency
		// simple creation
		Ariary test1 = new Ariary(3, 4);
		System.out.println(test1);

		// creatino that has to be normalized
		Ariary test2 = new Ariary(3, 100);
		System.out.println(test2);

		// negative value for fractions
		Ariary test3 = new Ariary(-3, -89);
		System.out.println(test3);
		
		Ariary test4 = new Ariary(3, -89);
		System.out.println(test4);

		// negative value for fractions + normalizing
		Ariary test5 = new Ariary(5, -189);
		System.out.println(test5);
	}	
}

