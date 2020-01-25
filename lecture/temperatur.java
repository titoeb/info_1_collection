public class temperatur{
	public static void main(String[] args){
	System.out.print("Eingabe:: ");
	double t = StdIn.readDouble();
	double tc  = (t-32) * (5/9);
	double tf = t * 1.8 + 32;
	System.out.println(t + " Grad Fahreneinheit entsprechen " + tc + " Grad Celcius");
	System.out.println(t + " Grad Celcius entsprechen" + tf + " Grad Fahreneinheit");
	}
}
