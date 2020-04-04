package zajecia02.drinki;

public class Component {

    String nameComponent;
    double quantity;

    public Component(String nameComponent, double quantity) {
        this.nameComponent = nameComponent;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "[" + nameComponent + " -> ilosc = " + quantity + "]";
    }
}
