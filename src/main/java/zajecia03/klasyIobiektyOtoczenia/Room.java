package zajecia03.klasyIobiektyOtoczenia;

public class Room {

    String size;
    String name;
    String color;
    boolean isEmpty;

    public Room() {
        this.size = "duży";
        this.name = "salon";
        this.color = "pomarańczowy";
        this.isEmpty = false;
    }

    public Room(String size, String name, String color, boolean isEmpty) {
        this.size = size;
        this.name = name;
        this.color = color;
        this.isEmpty = isEmpty;
    }

    @Override
    public String toString() {
        return "Czy " + size + " " + name + " koloru " + color + "\n" +
                " jest jeszcze zajęty? " + isEmpty;
    }
}
