package zajecia08.sklepzdzielamisztuki;

public class Calculate {

    private final double discountForPremium = 0.1;

    public double checkingPremiumDiscount(Customers customer, Product product) {
        double price = product.getPrice();
        if (customer.isPremium()) {
            return price * (1 - discountForPremium);
        }
        return price;
    }
}
