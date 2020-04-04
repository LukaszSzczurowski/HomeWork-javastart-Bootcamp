package zajecia02.drinki;

public class Bar {

    public static void main(String[] args) {

        Component component = new Component("Martini", 0.250);
        Component component1 = new Component("Wermut", 0.050);
        Component component2 = new Component("Vódka", 0.200);
        Drink drink = new Drink("Kaktail Martini", 80, true, component, component1, component2);

        System.out.println(drink);
        System.out.println();
        volumeDrink(drink);


    }

    private static void volumeDrink(Drink drink) {
        System.out.format("Pojemnoß© drinka \u2602" + drink.drinkName + "\u2602, wynosi %.3f ml", (drink.component1.quantity +
                drink.component2.quantity + drink.component3.quantity));
    }
}
