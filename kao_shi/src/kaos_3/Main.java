package kaos_3;
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Liu Jia","Designer",5000);
        SalaryCalculator.calculateSalary(e1);
        Employee e2 = new Employee("Tom","Developer");
        SalaryCalculator.calculateSalary(e2);
        System.out.println(e1.getSalary());
        System.out.println(e2.getSalary());
    }
}
