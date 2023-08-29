package selfwork;

public class studentinfo {
	
	private String FirstName;
	private String LastName;
	private String School;
	private double Grade;
	private double gpa;
	
	public studentinfo(String FirstName, String LastName, String School, double Grade, double gpa) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.School = School;
		this.Grade = Grade;
		this.gpa = gpa;
	}
	
	//getters
	public String FirstName() {
		return FirstName;
	}
	public String LastName() {
		return LastName;
	}
	public String School() {
		return School;
	}
	public double Grade() {
		return Grade;
	}
	public double gpa() {
		return gpa;
	}
}
