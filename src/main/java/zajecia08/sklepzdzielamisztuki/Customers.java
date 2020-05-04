package zajecia08.sklepzdzielamisztuki;

public class Customers {
    private String name;
    private String address;
    private boolean isPremium;

    public Customers(String name, String address, boolean isPremium) {
        this.name = name;
        this.address = address;
        this.isPremium = isPremium;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
