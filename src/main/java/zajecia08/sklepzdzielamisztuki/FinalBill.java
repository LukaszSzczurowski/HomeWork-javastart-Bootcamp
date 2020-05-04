package zajecia08.sklepzdzielamisztuki;

public class FinalBill {
    private Customers customer;
    private Product product;

    public FinalBill(Customers customer, Product product) {
        this.customer = customer;
        this.product = product;
    }

    public Customers getCustumer() {
        return customer;
    }

    public void setCustumer(Customers custumer) {
        this.customer = custumer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return customer + "" + product + ". Cena po rabacie: ";
    }
}
