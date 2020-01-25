public class line{
	final double slope;
	final double section;
	final String name = "";
	public line(slope, section){
		this.slope = slope;
		this.section = section;
	}

	public line(slope, section, name){
		this.slope = slope;
		this.section = section;
		this.name = name;
	}	

	public line(point p1, point p2, name){
		this.name = name;
		this.slope = (p1.x - p2.x) / (p1.y - p2.y);
		
	}


	public line(point p1, point p2){
		line(p1, p1, "");
	}	
}
