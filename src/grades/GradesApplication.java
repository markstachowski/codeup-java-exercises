package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = getStudents();
        System.out.println(students);
    }

    public static HashMap<String, Student> getStudents() {
        HashMap<String, Student> students = new HashMap<>();
        Student s1 = new Student("Fred");
        Student s2 = new Student("Tony");
        Student s3 = new Student("Lisa");
        Student s4 = new Student("Kyle");
// Add grades to all student objects
        s1.addGrade(80);
        s1.addGrade(100);
        s1.addGrade(90);

        s2.addGrade(80);
        s2.addGrade(88);
        s2.addGrade(70);

        s3.addGrade(77);
        s3.addGrade(96);
        s3.addGrade(90);

        s4.addGrade(100);
        s4.addGrade(45);
        s4.addGrade(77);

        students.put("fred", s1);
        students.put("tony", s2);
        students.put("lisa", s3);
        students.put("kyle", s4);

        return students;
    }
}
