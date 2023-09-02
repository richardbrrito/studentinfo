import javax.swing.*;

public class StudentManagerDriver {

    private StudentManager studentManager;

    private TeacherInfo teacherManager;

    public StudentManagerDriver() {
        studentManager = new StudentManager();
        mainMenu();
    }



    public static void main(String[] args) {
        new StudentManagerDriver();
    }

    private void mainMenu() {
        while (true) {
            String[] options = {"Enter Student Info", "Enter Class Info", "Student Info", "Current Classes","Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Select an action:",
                    "Student Manager", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
// each case is which button theyre pressing and what they do from left to right
            switch (choice) {
                case 0:
                    addStudent(studentManager);
                    break;
                case 1:
                    addClass();
                    break;
                case 2:
                    studentManager.displayStudentInfo();
                    break;
                case 3:

                    break;
                case 4:
                    System.exit(0);
                    break;

            }
        }
    }

    private static void addStudent(StudentManager manager) {
        String StudentName = JOptionPane.showInputDialog("Enter student's full name:");
        String School = JOptionPane.showInputDialog("Enter student's school:");
        String Grade = JOptionPane.showInputDialog("Enter student's grade:");
        double Gpa = Double.parseDouble(JOptionPane.showInputDialog("Enter student's GPA:"));
        int ID = Integer.parseInt(JOptionPane.showInputDialog("Enter Student's ID:"));

        String address = JOptionPane.showInputDialog("Enter student's home address:");
        String zip_code = JOptionPane.showInputDialog("Enter student's zip code:");
        String city = JOptionPane.showInputDialog("Enter student's city:");
        String state = JOptionPane.showInputDialog("Enter the state:");



        StudentAddress studentAddress = new StudentAddress(address, zip_code, city, state);
        StudentInfo studentInfo = new StudentInfo( StudentName, School, Grade, Gpa, ID);
        manager.addStudent(studentInfo);


    }

    private void addClass(TeacherInfo info){

        String className = JOptionPane.showInputDialog("Enter student's class name:");
        String Period = JOptionPane.showInputDialog("Enter class' period:");
        String TeacherName = JOptionPane.showInputDialog("Enter teacher's name:");
        double Time = Double.parseDouble(JOptionPane.showInputDialog("Enter class time:"));
        String Grade = JOptionPane.showInputDialog("Enter grade in class:");

        TeacherInfo teacherInfo = new TeacherInfo(className, Period, TeacherName, Time, Grade);
        teacherManager.addClass(teacherInfo);








    }
}