import jdk.internal.icu.text.UnicodeSet;

import javax.swing.*;
import java.util.ArrayList;

public class StudentManager {

    private ArrayList<StudentInfo> StudentList;

    private ArrayList<StudentInfo> DeletedInfo;

    public StudentManager() {
        StudentList = new ArrayList<>();
        DeletedInfo = new ArrayList<>();
    }

    public void addStudent(StudentInfo inputStudent) {
        StudentList.add(inputStudent);
    }

//    public StudentInfo findStudentByName(String name) {
//        for (StudentInfo FindStudent: StudentList) {
//            if (FindStudent.getStudentName().equalsIgnoreCase(name)){
//            return FindStudent;
//            }
//        }
//        return null;
//    }

    public void displayStudentInfo(){
        StringBuilder studentDisplay = new StringBuilder();
        studentDisplay.append(String.format("%-20s %-20s %-15s %-10s %-4s\n",
                "Name", "School","ID","Grade","GPA"));
        for (StudentInfo FindStudent : StudentList) {
            studentDisplay.append(String.format("%-17s %-22s %-9s %-10s %.1f\n",
                    FindStudent.getStudentName(),
                    FindStudent.getSchool(),
                    FindStudent.getID(),
                    FindStudent.getGrade(),
                    FindStudent.getGpa()));
        }
        displayInScrollablePane(studentDisplay.toString(),"Student Info");
    }
    public void displayClassInfo(){
        StringBuilder classDisplay = new StringBuilder();
        classDisplay.append(String.format("%-20s %-20s %-10s %-10s %-10s\n," +
                "Class", "Teacher", "Period", "Time", "Grade"));
//        for (TeacherInfo FindTeacher)

    }

    private void displayInScrollablePane(String text, String title){
        JTextArea textArea = new JTextArea(20, 50);
        textArea.setText(text);
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        textArea.setCaretPosition(0);
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);
        JOptionPane.showMessageDialog(null, scrollPane, title, JOptionPane.INFORMATION_MESSAGE);
    }

}


