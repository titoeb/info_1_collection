public class Rohr {
	private String name;
	private Rohr links;
	private Rohr rechts;

    	public Rohr(String name, Rohr links, Rohr rechts){
		this.name = name;

		if(links == null) this.links = null;
		else this.links = links;

		if(rechts == null) this.rechts = null;
		else this.rechts = rechts;
	}
	
	public String getName(){
		return this.name;
	}

	public void wasserfluss(){
		System.out.println("Rohr \"" + name + "\":");
		if(links != null) System.out.println("--> Rohr \"" + links.getName() + "\"");
		else System.out.println("--> Abfluss");
		if(rechts != null) System.out.println("--> Rohr \"" + rechts.getName() + "\"");
		else System.out.println("--> Abfluss");
		System.out.println();
		if(links != null) links.wasserfluss();
		if(rechts != null) rechts.wasserfluss();
	}
    
	public static void main(String args[]) {
	        // Test-Unit
		Rohr R5 = new Rohr("R5", null, null);
		Rohr R4 = new Rohr("R4", null, R5);
		Rohr R3 = new Rohr("R3", null, null);
		Rohr R2 = new Rohr("R2", R4, null);
		Rohr R1 = new Rohr("R1", R2, R3);
		R1.wasserfluss();
		
	}
}

