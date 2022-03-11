package grades;

import java.util.ArrayList;

public class Student {

    public static void main(String[] args) {
        Student student1 = new Student("william");
        System.out.println(student1.getStudentName());
        student1.addGrade(99);
        student1.addGrade(88);
        System.out.println(student1.getGradeAverage());
    }

    private String studentName;
    private ArrayList<Double> studentGrades;

    public Student(String studentName) {
        this.studentName = studentName;
        studentGrades = new ArrayList<>();
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



    //accessors

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public ArrayList<Double> getStudentGrades() {
        return studentGrades;
    }
}
