package zajecia03.internetshop;

public class Category {
    String name;
    String description;

     Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return
                 name + '\'' +
                ", opis kategorii ='" + description + '\'';
    }
}
