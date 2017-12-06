package project1;

public class TeacherUser {
	private int UserId;
	private String Firstname;
	private String Lastname;
	
	//	A TeacherID will be followed with an id, first name, last name
	
	public TeacherUser (int UserId, String Firstname, String Lastname) {
		this.UserId = UserId;
		this.Firstname = Firstname;
		this.Lastname = Lastname;
	}
	
	//return UserId
		public int getUserId() {
		return UserId;
	}

	//Return user FirstName
		public String getFirstname() {
		return Firstname;
	}
	
	//Return user LastName
	public String getLastname() {
		return Lastname;
	}
}