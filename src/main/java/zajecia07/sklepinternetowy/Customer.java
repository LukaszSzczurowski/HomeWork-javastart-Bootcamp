package zajecia07.sklepinternetowy;

public class Customer extends Person {

    public double sumOfexpenses;

    public Customer(String contactDetails, double sumOfexpenses) {
        super(contactDetails);
        this.sumOfexpenses = sumOfexpenses;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println(", Wydał juz u nas: " + sumOfexpenses);
    }
}
