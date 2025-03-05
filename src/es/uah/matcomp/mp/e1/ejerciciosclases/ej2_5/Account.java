package es.uah.matcomp.mp.e1.ejerciciosclases.ej2_5;

public class Account {
    private int id;
    private Customer customer;
    private double balance;
    /** Constructor principal dados todos los atributos */
    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    /** Segundo constructor dados id y customer */
    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }
    /** Getters para cada atributo */
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getBalance() {
        return balance;
    }
    /** Setter para balance */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    /** toString */
    @Override
    public String toString() {
        return customer.toString() + " balance=" + balance;
    }
    /** Getter para name de customer desde account */
    public String getCustomerName() {
        return customer.getName();
    }
    /** método para ingresar dinero */
    public Account deposit(double amount) {
       this.balance += amount;
       return Account.this;
    }
    /** método para extraer dinero */
    public Account withdraw(double amount) {
        if (amount < this.balance) {
            this.balance -= amount;
        }
        else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return Account.this;
    }
}
