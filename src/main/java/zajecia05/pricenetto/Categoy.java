package zajecia05.pricenetto;

public class Categoy {
    private String category;

    Categoy(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return category;
    }
}
