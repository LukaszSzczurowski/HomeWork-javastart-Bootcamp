package zajecia08.sklepzdzielamisztuki;

public class Client extends Customers {
    private String lastName;

    public Client(String name, String lastName, String address, boolean isPremium) {
        super(name, address, isPremium);
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "klient indywidualny: " + getName() + " " + lastName + ", adres: " + getAddress() + ", klient  Premium: " +
                isPremium();
    }


}
