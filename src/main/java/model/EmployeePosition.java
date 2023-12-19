package model;

public enum EmployeePosition {
    UNEMPLOYED(0), MANAGER(15000), DIRECTOR(20000), SALES_ADVISOR(10000), RECEPTIONIST(5000);

    EmployeePosition(double salary) {
        this.salary = salary;
    }

    private final double salary;

    public double getSalary() {
        return salary;
    }
}
