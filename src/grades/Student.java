package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Student {

    private String studentName;
    private ArrayList<Double> studentGrades;
    private HashMap<String, String> attendance;

    public Student(String studentName) {
        this.studentName = studentName;
        studentGrades = new ArrayList<>();
        attendance = new HashMap<>();
        attendance.put("2022-3-14", "P");
        attendance.put("2022-3-13", "A");

    }

    public void recordAttendance(String date, String value) {

        if (value.equalsIgnoreCase("p") || value.equalsIgnoreCase("a")) {
            attendance.put(date, value);
        }

        System.out.println("Invalid value");
    }

    public double attendancePercentage() {
        Set<String> dates = attendance.keySet();
        double absences = 0;

        for (String date : dates) {

            if (attendance.get(date).equalsIgnoreCase("A")) {
                absences += 1;
            }
        }
        return (dates.size() - absences) / dates.size();
    }

    public void addGrade(double grade) {
        studentGrades.add(grade);
    }

    public double getGradeAverage() {
        double gradeTotal = 0;

        for (double studentGrade : studentGrades) {
            gradeTotal += studentGrade;
        }
        return gradeTotal / studentGrades.size();
    }

    public void getStudentGrades() {
        for (int i = 0; i < studentGrades.size() ; i++) {
            System.out.print(studentGrades.get(i) + " ");
        }
        System.out.println();
    }



    //accessors

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public ArrayList<Double> getStudentGradesArray() {
        return studentGrades;
    }
}
