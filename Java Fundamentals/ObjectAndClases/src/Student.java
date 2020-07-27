import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String hometown;

    public Student() {

    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHometown() {
        return this.hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        String listOfStudents = scan.nextLine();
        while (!"end".equals(listOfStudents)) {

            String[] detailsStudents = listOfStudents.split("\\s+");

            String firstName = detailsStudents[0];
            String lastName = detailsStudents[1];
            int age = Integer.parseInt(detailsStudents[2]);
            String homeTown = detailsStudents[3];

            Student student = new Student();

            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setAge(age);
            student.setHometown(homeTown);

            studentList.add(student);

            listOfStudents = scan.nextLine();
        }
        String cityName = scan.nextLine();

        for (int i = 0; i < studentList.size(); i++) {
            String getStudentCityName = studentList.get(i).getHometown();
            if (getStudentCityName.equals(cityName)){
                String fName = studentList.get(i).getFirstName();
                String lName = studentList.get(i).getLastName();
                int age = studentList.get(i).getAge();

                System.out.printf("%s %s is %d years old%n",fName ,lName ,age);
            }
        }
    }
}