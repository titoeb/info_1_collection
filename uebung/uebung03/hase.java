public class hase{
	public static void main(String[] args){
		// Iterate over all numbers 0, ... , 99
		for (int b = 0; b < 100; b++){
			int a = b;
			//System.out.println("The number that was read is " + a);

			// create array to store numbers
			int[] array = new int[101];

			// fill arary with -1 
			
			for (int i = 0; i < 101 ; i++){
				// quadrieren
			 	a *= a;

				// aktualisieren
				a = (a / 10) % 100; 
				array[i] = a;
			}


			int igel = 0;
			int hase = 0;
			int was_cyc = 0;
			int past_igel = -1;
			
			for (int i = 0; i < 100; i++){
				// Aktualisiere Position des Igels
				igel++;
						
				// Aktualisiere die Position des Hasen (achte darauf das er nicht aus dem array hoppelt!)
				hase = (hase + 2) % 101;
				
				// if in last iteration a cycle was found, it is of step size two if igel did change.
				// Did it?
				if (was_cyc == 1){
					if (array[igel] == past_igel){
						was_cyc = 0;
						//System.out.println("Was no cycle. Past igel was " + past_igel + " current igel is " + array[igel]);		
					} else {
						System.out.println("Cyc found for " + b);
						break;		
					}
				}
				
				// if hase = igel cyc was found!
				if (array[hase] == array[igel]){
					was_cyc = 1;
					past_igel = array[igel];
					//System.out.println("Found cycle igel was " + array[igel] + " hase was " + array[hase]);
				
				}

				//System.out.println("Igel is at " + igel + " Hase is at " + hase);	
			}
		
		}
	}
}

