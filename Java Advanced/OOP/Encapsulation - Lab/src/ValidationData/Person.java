public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) throws IllegalAccessException {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    public void setFirstName(String firstName) throws IllegalAccessException {
        if (firstName.length() > 3){
            this.firstName = firstName;
        }else {
            throw new IllegalAccessException("First name cannot be less than 3 symbols");
        }
    }

    public void setLastName(String lastName) throws IllegalAccessException {
        if (lastName.length() > 3){
            this.lastName = lastName;
        }else {
            throw new IllegalAccessException("Last name cannot be less than 3 symbols");
        }
    }

    public void setAge(int age) throws IllegalAccessException {
        if (age > 0){
            this.age = age;
        }else {
            throw new IllegalAccessException("Age cannot be zero or negative integer");
        }
    }

    public void setSalary(double salary) throws IllegalAccessException {
        if (salary >= 460){
            this.salary = salary;
        }else {
            throw new IllegalAccessException("Salary cannot be less than 460 leva");
        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void increaseSalary(double bonus){
        if (this.age < 30){
            this.salary = this.salary * (bonus / 200 + 1);
        }else {
            this.salary = this.salary * (bonus / 100 + 1);
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %s leva", this.firstName, this.lastName, this.salary);
    }
}
