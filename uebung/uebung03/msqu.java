public class msqu{
	public static void main(String[] args){
		// add user input checking
		int a = -1;
		while(a < 0 || a / 100 > 0){
			a = StdIn.readInt();
		}
		System.out.println("The number that was read is " + a);
		
		for (int i = 0; i <= 50; i++){
			// ausgeben
			System.out.println(a);

			// quadrieren
		 	a *= a;

			// aktualisieren
			a = (a / 10) % 100; 
		}

	}
}

// Zyklus der mit der Zahl beginnt die eingegeben wurde: 60 -> 60, ....
// Zyklus der nicht mit der Zahl beginnt die eingegeben wurde: 40 -> 60, ....

// Zyklus der Laenge 2: 24 -> 57, 24
// Zyklus der nicht mit der Zahl beginnt die eingegeben wurde: 79 -> 24, 57
