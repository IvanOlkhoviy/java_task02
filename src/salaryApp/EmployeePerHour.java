package salaryApp;

public class EmployeePerHour implements Salary {

    private int salary;

    public EmployeePerHour(int salary) {
        this.salary = salary;
    }

    @Override
    public int salaryCount() {
        int coefficient = 2;
        return salary * coefficient ;
    }
}
