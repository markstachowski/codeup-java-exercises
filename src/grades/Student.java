package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
// Instance variables:
    private String name;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }
// Getters:
    public String getName() { return this.name; }
    public int getGrade(int index) { return this.grades.get(index); }

    public double getGradeAverage() {
        double sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }
// Setters:
    public void setName(String name) { this.name = name; }
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

// Main entry point
    public static void main(String[] args) {

        Student student = new Student("Mark");
        System.out.println(student.getName());
        student.addGrade(80);
        System.out.println(student.getGrade(0));
        student.addGrade(90);
        student.addGrade(85);
        System.out.println(student.getGradeAverage());

    }

}
