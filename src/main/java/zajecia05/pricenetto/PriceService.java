package zajecia05.pricenetto;

public class PriceService {

    double countBruttoPrice(Product product) {
        double bruttoPrice = 0;
        switch (product.getCategoy().getCategory()){
            case "Buty":
                bruttoPrice = product.getNettoPrice() * 1.23;
                break;
            case "Kurtki":
                bruttoPrice = product.getNettoPrice() * 1.2;
                break;
            default:
                System.out.println("undefined");
                break;
        }

        return bruttoPrice;
    }
}
