public class Waehrung{
  public static void main(String[] args) {
    System.out.print("Eingabe: "); 
    double input_currency = StdIn.readDouble(); // Zugriff auf Standard-Eingabe
    double dollar = 1.12 * input_currency; // Euro -> Dollar
    double euro = (1.0 / 1.12) * input_currency; // Dollar -> Euro
    System.out.println(input_currency + "Euro entstprechen"  
                 	 + dollar + " Dollar");
    System.out.println(input_currency + " Dollar entsprechen" 
		         + euro + " Euro.");
  }
}
