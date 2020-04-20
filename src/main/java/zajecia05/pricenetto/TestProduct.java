package zajecia05.pricenetto;

public class TestProduct {
    public static void main(String[] args) {
        Categoy cat1 = new Categoy("Buty");
        Categoy cat2 = new Categoy("Kurtki");
        Product product1 = new Product("Super boots Niue", "Najlepsze buty do miasta", 200.0, cat1);
        Product product2 = new Product("Super softy 4F", "Nieprzemakalnai przewiewna", 200, cat2);

        PriceService priceService = new PriceService();
        double priceService1 = priceService.countBruttoPrice(product1);
        double priceService2 = priceService.countBruttoPrice(product2);
        System.out.println(product1);
        System.out.println(product2);

        System.out.println("Cena brutto dla " + product1 + ", wynosi: " + priceService1);
        System.out.println("Cena brutto dla " + product2 + ", wynosi: " + priceService2);
    }
}
