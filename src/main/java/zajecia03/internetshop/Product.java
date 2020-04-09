package zajecia03.internetshop;

public class Product {
    String productName;
    double price;
    String productDescription;
    Category category;


    public Product(String productName, double price, String productDescription, Category category) {
        this.productName = productName;
        this.price = price;
        this.productDescription = productDescription;
        this.category = category;
    }


    void showInfo() {
        System.out.println("Product{" +
                "Product = '" + productName + '\'' +
                ", Cena = " + price +
                ", opis produktu = '" + productDescription + '\'' +
                ", kategoria = " + category +
                '}');
    }
}
