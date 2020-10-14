package salaryApp;

public class SalaryApp {
    public static void main(String[] args) {

        EmployeePerHour perHour = new EmployeePerHour(400);
        EmployeePerMonth perMonth = new EmployeePerMonth(20,30);

        System.out.println(perHour.salaryCount());
        System.out.println(perMonth.salaryCount());
    }
}
