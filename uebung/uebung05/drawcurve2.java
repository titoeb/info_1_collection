public class drawcurve2{
	public static void main(String args[]){
		// Lade Daten
		char[] Z = readChar1D();

		// Simuliere Lauf zur Skalierung des Feldes.
		int min_x = 0;
		int max_x = 0;
		int min_y = 0;
		int max_y = 0;
		int pos_x = 0;
		int pos_y = 0;
		int dir = 0;
		for(int i = 0; i < Z.length; i++){
			// Hier simuliere ich die Bewegung
			if(Z[i] == 'F'){
				//Bewege Dich!
				switch(dir){
				case 0:
					// Bewege nach rechts
					pos_x++;
					break;
				case 1:
					// Bewege nach unten
					pos_y--;
					break;
				case 2:
					// Bewege nach links
					pos_x--;
					break;
				case 3:
					// Bewege nach oben
					pos_y++;
					break;	
				default:
					System.out.println("Falsche Richtung!");
					//return;	
				}
			} else if(Z[i] =='L'){
				if (dir - 1 < 0){
					//System.out.println("dir was " + dir + " and will be set to " + 3);
					dir = 3;				
				} else {
					dir = dir - 1;
					//System.out.println("dir was " + dir + " and will be set to " + (dir - 1));
				}
				
			} else if(Z[i] == 'R'){
				dir = (dir + 1) % 4;
				//System.out.println("dir was " + dir + " and will be set to " + (dir + 1) % 4);
			} else{
				System.out.println("Fehlerhafte Zeichenkette.");
				return;		
			}
			// Hier stelle ich fest ob eine neues maximum/minum erreicht wurde.
			//System.out.println("(" + pos_x + ", " + pos_y + ")");
			min_x = Math.min(min_x, pos_x);
			min_y = Math.min(min_y, pos_y);
			max_x = Math.max(max_x, pos_x);
			max_y = Math.max(max_y, pos_y);
			
		}
  
		// Zeichne das Feld
		//StdDraw.setXscale(min_x + 1, max_x + 1);
		//StdDraw.setYscale(min_y + 1, max_y + 1);
		double offset_x = 0.1 * (max_x - min_x);
		double offset_y = 0.1 * (max_x - min_x);
		StdDraw.setXscale(min_x - offset_x , max_x + offset_x);
		StdDraw.setYscale(min_y - offset_y, max_y + offset_y);


		// Zeichne die Bewegung.
		pos_x = 0;
		pos_y = 0;
		dir = 0;
		for(int i = 0; i < Z.length; i++){
			// Hier simuliere ich die Bewegung
			if(Z[i] == 'F'){
				switch(dir){
				case 0:
					// Bewege nach rechts
					StdDraw.line(pos_x, pos_y, pos_x + 1, pos_y);
					pos_x++;
					break;
				case 1:
					// Bewege nach unten
					StdDraw.line(pos_x, pos_y, pos_x, pos_y - 1);
					pos_y--;
					break;
				case 2:
					// Bewege nach links
					StdDraw.line(pos_x, pos_y, pos_x -1, pos_y);
					pos_x--;
					break;
				case 3:
					// Bewege nach oben
					StdDraw.line(pos_x, pos_y, pos_x, pos_y + 1);
					pos_y++;
					break;		
				}
				//Bewege Dich!
			} else if(Z[i] =='L'){
				if (dir - 1 < 0){
					//System.out.println("dir was " + dir + " and will be set to " + 3);
					dir = 3;				
				} else {
					dir = dir - 1;
					//System.out.println("dir was " + dir + " and will be set to " + (dir - 1));
				}
			} else if(Z[i] == 'R'){
				dir = (dir + 1) % 4;
				//System.out.println("dir was " + dir + " and will be set to " + (dir + 1) % 4);
			} else{
				System.out.println("Fehlerhafte Zeichenkette.");
				return;		
			}
			// Hier stelle ich fest ob eine neues maximum/minum erreicht wurde.

			
		}
	}
	public static char[] readChar1D(){
		final int N = StdIn.readInt();
		StdIn.readLine();
		char[] a = new char[N];
		for(int i = 0; i < N; i++){
			a[i] = StdIn.readChar();
		}	
		return a;
	}
}
