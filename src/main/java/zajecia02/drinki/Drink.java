package zajecia02.drinki;

public class Drink {

    String drinkName;
    double price;
    boolean isAlk;
    Component component1;
    Component component2;
    Component component3;

    public Drink(String drinkName, double price, boolean isAlk, Component component3, Component component2, Component component1) {
        this.drinkName = drinkName;
        this.price = price;
        this.isAlk = isAlk;
        this.component1 = component1;
        this.component2 = component2;
        this.component3 = component3;

    }

    @Override
    public String toString() {
        return "Drink{'" + drinkName + '\'' +
                ", Cena = " + price + " zl" +
                ", Z alkoholem = " + isAlk +
                ", Skladniki = " + component1 + component2 + component3 +
                '}';
    }
}
