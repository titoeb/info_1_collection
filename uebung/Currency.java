public class Currency implements Separable{
	private int units;
	private int fractions;
	private char separator;
	public int getUnits(){
		return this.units;
	}
	public int getFractions(){
		return this.fractions;
	}
	public void setSeperator(char seperator){
		this.separator = separator;
	}
	protected void setUnits(int units){
		this.units = units;
	}
	protected void setFractions(int fractions){
		this.fractions = fractions;
	}
	public void normalize(){
		if(this.fractions < 0) this.fractions = - this.fractions;
		this.units += this.fractions / 100;
		this.fractions = this.fractions % 100;
	}
	public String toString(){
		return Integer.toString(this.units) + this.separator + Integer.toString(this.fractions);
	}
	public Currency(){
		this.units = 1;
		this.fractions = 0;
		this.separator = ',';
	}
	public Currency(int units, int fractions){
		this.units = units;
		this.fractions = fractions;
		normalize();
		this.separator = ',';
	}
	public Currency(int units, int fractions, char separator){
		this.units = units;
		this.fractions = fractions;
		normalize();
		this.separator = ',';
	}
	public static void main(String[] args){
		// Test-Unit for Currency
		// simple creation
		Currency test1 = new Currency(3, 4, ',');
		System.out.println(test1);

		// creatino that has to be normalized
		Currency test2 = new Currency(3, 100, ',');
		System.out.println(test2);

		// negative value for fractions
		Currency test3 = new Currency(-3, -89, ',');
		System.out.println(test3);
		
		Currency test4 = new Currency(3, -89, ',');
		System.out.println(test4);

		// negative value for fractions + normalizing
		Currency test5 = new Currency(5, -189, ',');
		System.out.println(test5);
	}	
}
