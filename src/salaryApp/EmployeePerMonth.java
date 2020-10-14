package salaryApp;

public class EmployeePerMonth implements Salary {

    private int salary;
    private int workDays;

    public EmployeePerMonth(int salary, int workDays) {
        this.salary = salary;
        this.workDays = workDays;
    }

    @Override
    public int salaryCount() {
        return salary * workDays;
    }
}
