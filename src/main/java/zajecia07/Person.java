package zajecia07;

public class Person {
    public String name;
    public String lastName;
    public String address;
    public int telophone;

    public Person(String name, String lastName, String address, int telophone) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.telophone = telophone;
    }

    void printInfo() {
        System.out.printf(name + " " + lastName + ", " + address + ", " + telophone);
    }
}
