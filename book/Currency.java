public class Currency implements Separable{
	private int units, fractions;
	private char separator;

	public Currency(){
		this.units = 1;
		this.fractions = 1;
		this.separator = ',';
	}

	public Currency(int units, int fractions){
		this();
		this.units = units;
		this.fractions = fractions;

		normalize();
	}

	public Currency(int units, int fractions, char separator){
		this();
		this.units = units;
		this.fractions = fractions;
		this.separator = separator;

		normalize();
	}

	public Currency(Currency o){
		this();
		this.units = o.getUnits();
		this.fractions = o.getFractions();
		this.separator = o.getSeparator();

		normalize();
	}
	
	public char getSeparator(){
		return this.separator;
	}
	
	public int getUnits (){
		return this.units;
	}
	public int getFractions (){
		return this.fractions;
	}
	public void setSeparator (char separator ){
		this.separator = separator;
	}
	public void normalize(){
		if(this.fractions < 0) this.fractions = - this.fractions;
		this.units += this.fractions / 100;
		this.fractions = this.fractions % 100;	
	}
	public String toString(){
		if(fractions < 9){
			return this.units + this.separator +"0" + this.fractions;
		} else {
			return this.units + this.separator + "" + this.fractions;
		}
	}
}
