package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Book {
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty;
    /** Primer constructor dados isbn, name, author y price*/
    public Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    /** Segundo constructor dados isbn, name, author, price y qty */
    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    /** Getters para cada atributo */
    public String getIsbn() {
        return isbn;
    }
    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public int getQty() {
        return qty;
    }
    /** Setter para Price**/
    public void setPrice(double price) {
        this.price = price;
    }
    /** Setter para qty */
    public void setQty(int qty) {
        this.qty = qty;
    }
    /** Métodos para acceder a los atributos de la instancia autor desde la instancia libro */
    public String getAuthorName() {
        return author.getName();
    }
    /** toString*/
    @Override
    public String toString() {
        return "Book[name=" + name + "," + author.toString() + ", price=" + price + ", qty=" + qty +"]";
    }
}
