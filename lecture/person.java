public class person{
	protected String firstname;
	protected String lastname;
	protected String birthday;
	public String birthday() {
		return "My birthday is " + birthday;
	}
	public person(String firstname, String lastname, String birthday){
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthday = birthday;
	}
}
