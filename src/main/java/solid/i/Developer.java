package solid.i;

/**
 * Notice that the Employee class has behavior that doesn’t make sense for the Developer position: getCommission().
 * The developer’s salary is calculated based on hours worked and contracted, having no relation to total sales in a period.
 */
public class Developer extends Employee {

    private double salary;

    public Developer(double salary) {
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public double getCommission() {
        return 0d;
    }
}