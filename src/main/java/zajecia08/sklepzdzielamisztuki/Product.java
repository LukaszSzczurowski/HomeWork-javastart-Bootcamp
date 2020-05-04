package zajecia08.sklepzdzielamisztuki;

public class Product {
    private String name;
    private String description;
    private double price;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return " .Zakupiono [" + name + "," + description + "] cena: " + price;
    }
}
