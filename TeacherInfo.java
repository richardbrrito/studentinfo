public class TeacherInfo {
    private String className;
    private String Period;
    private String TeacherName;
    private String Time;

    private String Grade;

    public TeacherInfo(String className, String Period, String TeacherName, String Time, String Grade){
        this.className = className;
        this.Period = Period;
        this.TeacherName = TeacherName;
        this.Time = Time;
        this.Grade = Grade;
    }
    //getters
    public String getStudentClass(){
        return className;
    }
    public String getPeriod(){
        return Period;
    }
    public String getTeacher(){
        return TeacherName;
    }

    public String getTime(){
        return Time;
    }
    public String getGrade(){
        return Grade;
    }
    //setters
    public void setStudentClass(String Class){
        this.className = Class;
    }
    public void setPeriod(String Period){
        this.Period = Period;
    }
    public void setTeacher(String TeacherName){
        this.TeacherName = TeacherName;
    }

    public void setTime(String Time){
        this.Time = Time;
    }
    public void setGrade(String Grade){
        this.Grade = Grade;
    }

}
