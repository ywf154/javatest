package kaos_3;

public class SalaryCalculator {
    public static void calculateSalary(Employee employee) {
        String jobTitle = employee.getJobTile();
        double salary;
        // 根据职位确定基本工资
        switch (jobTitle) {
            case "Supervisor":
                salary = 15000.0;
                break;
            case "Manager":
                salary = 8000.0;
                break;
            case "Developer":
                salary = 9000.0;
                break;
            case "Designer":
                salary = 12000.0;
                break;
            default:
                salary = 6000.0;
                break;
        }
        employee.setSalary(salary);
    }
}
