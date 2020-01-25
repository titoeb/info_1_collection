public abstract class Product implements Comparable{
	private String productName;
	private double productPreis;

	public Product(String name, double Preis){
		this.productName = name;
		setPreis(Preis);
	}
	public String getName(){
		return productName;
	}
	public void setName(String name){
		productName = name;
	}
	public void setPreis(double preis){
		if(preis >= 0) productPreis = preis;
		else productPreis = 0;
	}
	public double getPreis(){
		return productPreis;
	}
	public String toString(){
		String verdeblichkeit = "";
		if(verderblich()){
			verdeblichkeit = " (verderblich)";
		}
		return productName + verdeblichkeit +  ": " + productPreis + " EUR";
	}
	public int compareTo(Object o){
		Product p = (Product) o;
		if(productPreis > p.getPreis()) return -1;
		else if(productPreis < p.getPreis()) return 1;
		else return 0;
		
	}
	public abstract  boolean verderblich();
}
