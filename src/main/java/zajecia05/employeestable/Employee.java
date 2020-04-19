package zajecia05.employeestable;

public class Employee {
    private String name;
    private String lastName;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String lastName, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{ " + name + " " + lastName + ", pensja = " + salary + " zl}";
    }
}
