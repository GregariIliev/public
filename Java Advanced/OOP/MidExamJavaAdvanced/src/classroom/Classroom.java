package classroom;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    public int capacity;
    public List<Student> students;

    public Classroom(int capacity) {
        this.capacity = capacity;
        this.students = new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public int getStudentCount() {
        return this.students.size();
    }

    public String registerStudent(Student student) {
        String text = "";

        if (this.students.size() < this.capacity) {
            if (this.students.size() == 0) {
                this.students.add(student);
                return text = String.format("Added student %s %s", student.getFirstName(), student.getLastName());
            }
            for (Student currentStudent : this.students) {
                String currentStudentFirstName = currentStudent.getFirstName();
                String currentStudentLastName = currentStudent.getLastName();

                String studentFirstName = student.getFirstName();
                String studentLastName = student.getLastName();

                if (currentStudentFirstName.equals(studentFirstName) && currentStudentLastName.equals(studentLastName)) {
                    return text = "Student is already in the classroom";
                } else {
                    this.students.add(student);
                    return text = String.format("Added student %s %s", student.getFirstName(), student.getLastName());
                }
            }
        } else {
            text = "No seats in the classroom";
        }

        return text;
    }

    public String dismissStudent(Student student){
        String result = "Student not found";

        for (int i = 0; i < this.students.size(); i++) {
            String currentStudentFirstName = this.students.get(i).getFirstName();
            String currentStudentLastName = this.students.get(i).getLastName();

            String studentFirstName = student.getFirstName();
            String studentLastName = student.getLastName();

            if (currentStudentFirstName.equals(studentFirstName) && currentStudentLastName.equals(studentLastName)){
                this.students.remove(i);
                return result = String.format("Removed student %s %s",student.getFirstName(), student.getLastName());
            }
        }
        return result;
    }

    public String getSubjectInfo(String subject){
        boolean subjectFound = false;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Subject: ").append(subject).append(System.lineSeparator());
        stringBuilder.append("Students:").append(System.lineSeparator());

        for (Student student : this.students) {
            if (student.getBestSubject().equals(subject)){
                subjectFound = true;
                stringBuilder.append(student.getFirstName()).append(" ").append(student.getLastName())
                .append(System.lineSeparator());
            }
        }
        if (!subjectFound){
            stringBuilder = new StringBuilder();
            stringBuilder.append("No students enrolled for the subject");
        }
        return stringBuilder.toString().trim();
    }

    public Student getStudent(String firstName, String lastName){

        Student returnStudent = null;
        for (Student student : this.students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                 returnStudent = student;
                 break;
            }
        }
        return returnStudent;
    }

    public String getStatistics(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Classroom size: ").append(this.students.size()).append(System.lineSeparator());
        for (Student student : this.students) {
            stringBuilder.append("==");
            stringBuilder.append(student.toString()).append(System.lineSeparator());
        }

        return stringBuilder.toString().trim();
    }
}
