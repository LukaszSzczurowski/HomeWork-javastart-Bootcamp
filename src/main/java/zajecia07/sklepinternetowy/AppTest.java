package zajecia07.sklepinternetowy;

public class AppTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Jacek Kawalec Z Mińska tel:56060480",2000.5);

        customer.printInfo();

        Director director = new Director("Lukasz Szczurowski, ul.Brodnicka tel 010101011", 10000,5000);

        System.out.println(director.contactDetails + " zarobił w sumie: " + director.totalPayment());
    }
}
