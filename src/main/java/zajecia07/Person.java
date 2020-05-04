package zajecia07;

public class Person {
    private String name;
    private String lastName;
    private String address;
    private int telophone;

    public Person(String name, String lastName, String address, int telophone) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.telophone = telophone;
    }

    public void printInfo() {
        System.out.printf(name + " " + lastName + ", " + address + ", " + telophone);
    }
}
