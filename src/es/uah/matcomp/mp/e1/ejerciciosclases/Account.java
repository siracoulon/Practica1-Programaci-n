package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Account {
    private String id;
    private String name;
    private int balance;
    /** Constructor principal dados id y name con balance por defecto */
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }
    /** Segundo constructor dados id, name y balance */
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    /** Getters para id, name y balance */
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    /** Método para credit */
    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }
    /** Método para debit*/
    public int debit(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        }
        else {
            System.out.println("Amount exceeded balance.");
        }
        return this.balance;
    }
    /** Método transferTo */
    public int transferTo(Account another,int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            another.balance += amount;
        }
        else {
            System.out.println("Amount exceeded balance.");
        }
        return this.balance;
    }
    /** toString */
    public String toString() {
        return "Account [id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}
