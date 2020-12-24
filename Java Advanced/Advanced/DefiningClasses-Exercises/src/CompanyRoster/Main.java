package CompanyRoster;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, Department> departmentMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] inputLine = scan.nextLine().split("\\s+");
            Employee employee;

            String name = inputLine[0];
            double salary = Double.parseDouble(inputLine[1]);
            String position = inputLine[2];
            String department = inputLine[3];

            if (inputLine.length == 4) {
                String email = "n/a";
                int age = -1;

                employee = new Employee(name, salary, position, department, email, age);

            } else if (inputLine.length == 6) {
                String email = inputLine[4];
                int age = Integer.parseInt(inputLine[5]);

                employee = new Employee(name, salary, position, department, email, age);

            } else {
                try {
                    int age = Integer.parseInt(inputLine[4]);
                    String email = "n/a";

                    employee = new Employee(name, salary, position, department, email, age);

                } catch (NumberFormatException e) {
                    String email = inputLine[4];
                    int age = -1;
                    employee = new Employee(name, salary, position, department, email, age);

                }

            }
            departmentMap.putIfAbsent(department, new Department(department));
            departmentMap.get(department).getEmployeeList().add(employee);

        }

        Department bestDepartment = departmentMap.entrySet()
                .stream()
                .max(Comparator.comparingDouble(value -> value.getValue().averageSalary()))
                .get()
                .getValue();

        System.out.println("Highest Average Salary: " + bestDepartment.getName());

        bestDepartment
                .getEmployeeList()
                .stream()
                .sorted((l, r) -> Double.compare(r.getSalary(), l.getSalary()))
                .forEach(employee -> System.out.printf("%s %.2f %s %d%n",employee.getName(), employee.getSalary(), employee.getEmail(), employee.getAge()));
    }
}
