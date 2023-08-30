package StudentSelfProject;

public class StudentInfo {

    private String FirstName;
    private String LastName;
    private String School;
    private double Grade;
    private double Gpa;

    public StudentInfo(String FirstName, String LastName, String School, int Grade, double Gpa) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.School = School;
        this.Grade = Grade;
        this.Gpa = Gpa;
    }

    //getters
    public String getFirstName() {
        return FirstName;
    }
    public String getLastName() {
        return LastName;
    }
    public String getSchool() {
        return School;
    }
    public double getGrade() {
        return Grade;
    }
    public double getGpa() {
        return Gpa;
    }
    //setters
    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }
    public void setLastName(String LastName){
        this.LastName = LastName;
    }
    public void setSchool(String School){
        this.School = School;
    }

    public void setGpa(double Gpa) {
        this.Gpa = Gpa;
    }
    public void setGrade(int Grade){
        this.Grade = Grade;
    }
}
