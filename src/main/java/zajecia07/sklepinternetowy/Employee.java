package zajecia07.sklepinternetowy;

public class Employee extends Person {
    public double salary;

    public Employee(String contactDetails, double salary) {
        super(contactDetails);
        this.salary = salary;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println(" Wypłata: " + salary);
    }
}
