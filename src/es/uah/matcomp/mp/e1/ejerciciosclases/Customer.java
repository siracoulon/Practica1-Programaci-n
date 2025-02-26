package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Customer {
    private int id;
    private String name;
    private int discount;
    /** Constructor*/
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }
    /** Getters para cada atributo */
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getDiscount() {
        return discount;
    }
    /** Setter para discount */
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    /** toString*/
    @Override
    public String toString() {
        return name + "(" + id + ")" + "(" + discount + "%)";

    }

}
