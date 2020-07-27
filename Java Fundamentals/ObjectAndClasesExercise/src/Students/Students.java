package Students;

public class Students {
    private String firstName;
    private String lastName;
    private double grade;

    public Students(String firstName, String lastName, double grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public double getGrade(){
        return this.grade;
    }
    public void ToString(){
        System.out.printf("%s %s: %.2f%n",firstName ,lastName ,grade);
    }
}
