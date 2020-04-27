package zajecia07.sklepinternetowy;

public class Director extends Employee {
    public double bonus;

    public Director(String contactDetails, double salary, double bonus) {
        super(contactDetails,salary);
        this.bonus = bonus;
    }

    double totalPayment(){
        return salary + bonus;
    }
}
