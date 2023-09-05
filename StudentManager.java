

public class StudentInfo {

    private String StudentName;
    private String School;
    private String Grade;
    private double Gpa;
    private int ID;


    public StudentInfo(String StudentName, String School, String Grade, double Gpa, int ID) {
        this.StudentName = StudentName;
        this.School = School;
        this.Grade = Grade;
        this.Gpa = Gpa;
        this.ID = ID;
    }


    //getters
    public String getStudentName() {
        return StudentName;
    }

    public String getSchool() {
        return School;
    }

    public String getGrade() {
        return Grade;
    }

    public double getGpa() {
        return Gpa;
    }
    public int getID(){
        return ID;
    }


    //setters
    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public void setSchool(String School) {
        this.School = School;
    }

    public void setGpa(double Gpa) {
        this.Gpa = Gpa;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}
