package zajecia08.sklepzdzielamisztuki;

public class Company extends Customers {
    private String nip;

    public Company(String name, String address, String nip, boolean isPremium) {
        super(name, address, isPremium);
        this.nip = nip;
    }

    @Override
    public String toString() {
        return "Firma: " + getName() + ", nip: " + nip + ", adres: " + getAddress() + ", klient  Premium: " +
                isPremium();
    }

}
