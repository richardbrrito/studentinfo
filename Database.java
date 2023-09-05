import java.util.ArrayList; //arraylist import
public class Database {

    private static Database instance;
    //holds the single instance of the database class
    private ArrayList<StudentInfo> StudentList; //Makes an arraylist to store the Students
    private StudentInfo CurrentStudent; // Holds name of current student
    private int CurrentIndex; // Keeps track of the index of the arraylist
    private boolean found; // Checks to see if the student has been found

    private Database() { // Constructor
        this.StudentList = new ArrayList<>();
        this.CurrentStudent = null;
        this.CurrentIndex = -1;
        this.found = false;
    }
    public static Database getInstance() { // If the instance doesn't exist, it makes one.
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    // Search Student By Name
    public void search(String StudentName){ // method to perform search
        found = false; // false so that if found the if statement makes it true
        for (int i= 0; i < StudentList.size(); i++){ // for statement that runs throughout the whole student list
            if(StudentList.get(i).getStudentName().equals(StudentName)){ // if studentlist size = first name run if statement
                CurrentStudent = StudentList.get(i); // set currentStudent to the matching student
                CurrentIndex = i; // set index in array to the one of the student
                found = true; // true if student name is found
                break; // break because if found it doesnt need to keep searching
            }
        }
    }
    public void add(StudentInfo newStudent){
        StudentList.add(newStudent); // adds newStudent to arraylist StudentList

    }




}
