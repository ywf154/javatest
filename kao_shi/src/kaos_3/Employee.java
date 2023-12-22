package kaos_3;

import java.util.Objects;

public class Employee {
    private String name;
    private String jobTile;
    private double salary;
    public Employee(String name, String jobTile) {
        this.name = name;
        this.jobTile = jobTile;
    }

    public Employee(String name, String jobTile,double salary) {
        this.name = name;
        this.jobTile = jobTile;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTile() {
        return jobTile;
    }

    public void setJobTile(String jobTile) {
        this.jobTile = jobTile;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(jobTile, employee.jobTile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, jobTile, salary);
    }
}
