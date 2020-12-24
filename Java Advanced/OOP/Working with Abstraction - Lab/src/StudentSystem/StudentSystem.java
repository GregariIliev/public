package StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> studentSystem;

    public StudentSystem() {
        this.studentSystem = new HashMap<>();
    }

    public void printStudent(String[] studentData) {
        String studentName = studentData[1];
        if (this.studentSystem.containsKey(studentName)) {
            System.out.println(this.studentSystem.get(studentName).toString());
        }
    }

    public void putStudentToTheSystem(String[] studentData) {
        String studentName = studentData[1];
        int studentAge = Integer.parseInt(studentData[2]);
        double studentGrade = Double.parseDouble(studentData[3]);

        if (!this.studentSystem.containsKey(studentName)) {
            Student student = new Student(studentName, studentAge, studentGrade);
            this.studentSystem.put(studentName, student);
        }
    }
}
