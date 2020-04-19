package zajecia05.pricenetto;

import zajecia03.internetshop.Category;

public class Product {
    private String name;
    private String description;
    private double nettoPrice;
    private Categoy categoy;


    Product(String name, String description, double nettoPrice, Categoy categoy) {
        this.name = name;
        this.description = description;
        this.nettoPrice = nettoPrice;
        this.categoy = categoy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getNettoPrice() {
        return nettoPrice;
    }

    public void setNettoPrice(double nettoPrice) {
        this.nettoPrice = nettoPrice;
    }

    public Categoy getCategoy() {
        return categoy;
    }

    public void setCategoy(Categoy categoy) {
        this.categoy = categoy;
    }

    @Override
    public String toString() {
        return name + " '" + description + "', nettoPrice= " + nettoPrice + ", category= " + categoy;
    }
}
