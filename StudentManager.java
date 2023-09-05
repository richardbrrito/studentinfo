import jdk.internal.icu.text.UnicodeSet;

import javax.swing.*;
import java.util.ArrayList;

public class StudentManager {

    private ArrayList<StudentInfo> StudentList;

    private ArrayList<TeacherInfo> classList;

    private ArrayList<StudentAddress> addressList;


    public StudentManager() {
        classList = new ArrayList<>();
        StudentList = new ArrayList<>();
        addressList = new ArrayList<>();
    }

    public void addStudent(StudentInfo inputStudent) {
        StudentList.add(inputStudent);
    }
    public void addTeacherInfo(TeacherInfo teacherInfo) {
        classList.add(teacherInfo);
    }

    public void addAddressInfo(StudentAddress inputAddress){
        addressList.add(inputAddress);
    }



    public void displayStudentInfo(){
        StringBuilder studentDisplay = new StringBuilder();
        studentDisplay.append(String.format("%-20s %-20s %-15s %-10s %-4s\n",
                "Name", "School","ID","Grade","GPA"));
        for (StudentInfo FindStudent : StudentList) {
            studentDisplay.append(String.format("%-17s %-22s %-10s %-11s %.1f\n",
                    FindStudent.getStudentName(),
                    FindStudent.getSchool(),
                    FindStudent.getID(),
                    FindStudent.getGrade(),
                    FindStudent.getGpa()));
        }
        displayInScrollablePane(studentDisplay.toString(),"Student Info");
    }
    public void displayClassInfo() {
        StringBuilder classDisplay = new StringBuilder();
        classDisplay.append(String.format("%-20s %-20s %-10s %-10s %-10s\n",
                "Class", "Teacher", "Period", "Time", "Grade"));

        for (TeacherInfo findTeacher : classList) {
            classDisplay.append(String.format("%-15s %-17s %-13s %-11s %-14s\n",
                    findTeacher.getStudentClass(),
                    findTeacher.getTeacher(),
                    findTeacher.getPeriod(),
                    findTeacher.getTime(),
                    findTeacher.getGrade()));
        }

        displayInScrollablePane(classDisplay.toString(), "Class Info");
    }

    public void displayAddressInfo(){
        StringBuilder addressDisplay = new StringBuilder();
        addressDisplay.append(String.format("%-20s %-20s %-10s %-20s\n," +
                "Home Address", "City", "State","Zip Code"));

        for (StudentAddress findAddress: addressList){
            addressDisplay.append(String.format("%-20s %-20s %-20s %-20s\n",
                    findAddress.getAddress(),
                    findAddress.getCity(),
                    findAddress.getState(),
                    findAddress.getZipcode()));
        }
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


