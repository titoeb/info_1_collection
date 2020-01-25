public class Temperatur{
  public static void main(String[] args) {
    System.out.print("Eingabe: "); 
    double t;
    t = StdIn.readDouble(); // Zugriff auf Standard-Eingabe
    double tf,tc;
    tf = t * 1.8 + 32; // Grad-Celsius -> Grad-Fahrenheit
    tc = (t - 32)*5/9; // Grad-Fahrenheit -> Grad-Celsius
    System.out.println(t + " Grad Celsius entsprechen "  
                 	 + tf + " Grad Fahrenheit.");
    System.out.println(t + " Grad Fahrenheit entsprechen " 
		         + tc + " Grad Celsius.");
  }
}

