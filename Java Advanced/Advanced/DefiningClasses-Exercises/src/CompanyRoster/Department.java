package CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employeeList;

    public Department(String name){
        this.name = name;
        this.employeeList = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void addToList(Employee employee){
        this.employeeList.add(employee);
    }

    public List<Employee> getEmployeeList(){
        return this.employeeList;
    }

    public double averageSalary(){
        return this.employeeList.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
    }
}
