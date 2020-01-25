public class student extends person{
	protected int student_id;
	protected String major;
	protected String minor;
	protected String start;
	public person(String firstname,String lastname, String birthday, int student_id, String major, String minor, String start){
		super(firstname, lastname, birthday);
		this.student_id = student_id;
		this.major = major;
		this.minor = minor;
		this.start = start;
	}
	public String started(){
		return "I started in " + start;
	}
}
