package Google;

public class Company {
    private String name;
    private String department;
    private double salary;

    public Company(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public static Company createCompany(String[] tokens) {
        String name = tokens[2];
        String department = tokens[3];
        double salary = Double.parseDouble(tokens[4]);

        return new Company(name, department, salary);
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f", this.name, this.department, this.salary);
    }
}