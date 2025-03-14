package es.uah.matcomp.mp.e1.ejerciciosclases.ej2_4;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;
    /** Constructor */
    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }
    /** Getters para cada atríbuto */
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getAmount() {
        return amount;
    }
    /** Setter para customer */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    /** Setter para amount */
    public void setAmount(double amount) {
        this.amount = amount;
    }
    /** Getters para acceder a los atríbutos de la instancia customer
     * desde una instancia invoice*/
    public int getCustomerId() {
        return customer.getId();
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public int getCustomerDiscount() {
        return customer.getDiscount();
    }
    /** Getter que devuelve el precio tras el descuento */
    public double getAmountAfterDiscount() {
        return this.amount *(100 - customer.getDiscount())/100;
    }
    /** toString */
    public String toString() {
        return "Invoice [id=" + id + ", customer=" + customer.toString() + ", amount=" + amount + "]";
    }
}
