public class collatz{
	static void collatzIterativOutput(int n){
		// Erstelle eine Laufvariable zum Zaehlen der erstellten Zahlen		
		int index = 0;

		// Gebe die erste, uebergebene Zahl aus.
		System.out.println(index + " " + n);

		// Iteriere so lange bis entweder eins erreicht wurde oder der Integer ueberlaeuft.
		while((n != 1) & (n < Integer.MAX_VALUE)){
			if(n % 2 == 0){
				// Zahl ist durch zwei teilbar, also gerade.
				n = n / 2;
			} else {
				// Zahl ist nicht durch teilbar, also ungerade
				n = 3 * n + 1;	
			}
			// Erhoehe den Index da gerade neue Zahl erstellt
			++index;

			// Gebe die erstellte Zahl aus!
			System.out.println(index + " " + n);
		}
	}
	static int[] collatzIterativ(int n){
		// Erstelle das Feld
		int[] feld = new int[1];

		// Fuelle es mit der ersten Zahl
		feld[0] = n;
		
		// Erstelle die naechste Zahl bis die Reihe bei eins endet oder der Integer ueberlauft
		while((n != 1) & (n < Integer.MAX_VALUE)){
			if(n % 2 == 0){
				// Zahl ist durch zwei teilbar, also gerade.
				n = n / 2;
			} else {
				// Zahl ist nicht durch teilbar, also ungerade
				n = 3 * n + 1;	
			}
			// Hange die neue, ermittelte Zahl an das Feld.
			feld = appendInt(feld, n);
		}
		// Gebe das erstellt feld aus.
		// Wenn es einen Ueberlauf gab gib null aus, sonst das feld
		if(n == Integer.MAX_VALUE){
			return null;		
		} else {
			return feld;
		}
	}
	public static int[] appendInt(int[] a, int b){
		// Erstelle das neue Feld, welches eine Element laneger sein muss als das alte Feld.
		int[] out = new int[a.length + 1];

		// Iteriere ueber das alte Feld und schreibe jedes Element in das neue Feld
		for(int i = 0; i < a.length; i++){
			out[i] = a[i];
		}
		// Haenge das neue Element and das neue feld an
		out[a.length] = b;

		// Gebe das array aus.
		return out;
	}
	public static void main(String[] args){
		// Teste of eins oder zwei Argumente eingegeben wurden
		if((args.length != 1) & (args.length != 2)){
			System.out.println("Bitte geben sie entweder eine order zwei Zahlen ein!");
			return;
		}

		// Teste ob n eine ganze, positive Zahl ist
		for(int i = 0; i < args[0].length(); i++){
			if(Character.isDigit(args[0].charAt(i)) == false){
				System.out.println("Bitte geben sie eine ganze, positive Zahl ein!");
				return;
			}
		}
	
		// Test of m eine ganze, positive Zahl ist
		if (args.length > 1){
			for(int i = 0; i < args[1].length(); i++){
				if(Character.isDigit(args[1].charAt(i)) == false){
					System.out.println("Bitte geben sie eine ganze, positive Zahl ein!");
					return;
				}
			}
		}
	
		// Auf jeden Fall exisitert n und wir brauche es auch.
		int n = Integer.parseInt(args[0]);

		// test of n groesser null ist
		if(n == 0){
			System.out.println("Bitte geben sie eine ganze, positive Zahl ein!");
			return;
		}

		// Wenn eine ganze Zahl uebergeben wurde gib rufe damit beide funktionen auf!
		if(args.length == 1){
			collatzIterativOutput(n);
			System.out.println();
			int[] out = collatzIterativ(n);
			for(int i = 0; i < out.length; i++){
				System.out.println(i + " " + out[i]);
			}	
		} else {
			// Zwei ganze, positive Zahlen wurden uebergeben und ich teste die Collanzvermutung!

			// Jetzt brauchen wir auch m!
			int m = Integer.parseInt(args[1]);
			
			// test of m groesser null ist
			if(m == 0){
				System.out.println("Bitte geben sie eine ganze, positive Zahl ein!");
				return;
			}

			// Test ob n > m
			if(n > m){
				System.out.println("N: " + n + " ist groesser m: " + m + " !");		
				return;	
			}

			// teste die Collatz Vermuting fuer alle Werte m bis n
			for(int i = n; i <= m; i++){
				// Wenn es zu einem Ganzzahlueberlauf kam koennen wir keinen aussage treffen.
				if(collatzIterativ(i) == null){
					System.out.println("Kann keine Aussage treffen!");			
					return;
				}
			}			
			// Sollten wir durch die Schleife gekommen sein, gabe es keinen Ganzzahl ueberlauf und 
			// die Collatz Vermutung hat immer gehalten.
			System.out.println("Die Collatz Vermutung gilt fur all Zahlen von " + n + " bis " + m + ".");
		}
	}
}
