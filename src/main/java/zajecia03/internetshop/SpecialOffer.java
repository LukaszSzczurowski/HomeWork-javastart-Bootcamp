package zajecia03.internetshop;

public class SpecialOffer {
    String specialOfferDescription;
    String promotionTime;
    double discount;
    Product product;

    public SpecialOffer(String specialOfferDescription, String promotionTime, double discount, Product product) {
        this.specialOfferDescription = specialOfferDescription;
        this.promotionTime = promotionTime;
        this.discount = discount;
        this.product = product;
    }

    void specialPrice(Product pro) {
        pro.price *= discount;
    }

    void specialCutPrice(Product pro, double disco) {
        pro.price *= disco;
    }
}
