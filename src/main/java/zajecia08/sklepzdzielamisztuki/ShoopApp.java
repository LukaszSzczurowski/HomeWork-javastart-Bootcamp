package zajecia08.sklepzdzielamisztuki;

public class ShoopApp {
    public static void main(String[] args) {
        Customers customers1 = new Client("Lukasz", "Szczegół", "ul.Góry 17, Warszawa", false);
        Customers customers2 = new Company("Sony", "ul.Krakowiaków, Płock", "542-566-884", true);
        Product product = new Product("Monaliza", "Arcydzieło Leonarda da Vinci", 1000500);

        Calculate calculate = new Calculate();

        FinalBill finalBill = new FinalBill(customers1, product);
        FinalBill finalBill1 = new FinalBill(customers2, product);
        System.out.println(finalBill + "" + calculate.checkingPremiumDiscount(customers1, product));
        System.out.println(finalBill1 + "" + calculate.checkingPremiumDiscount(customers2, product));

    }
}
