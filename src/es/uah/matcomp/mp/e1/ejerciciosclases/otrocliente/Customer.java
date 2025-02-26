package es.uah.matcomp.mp.e1.ejerciciosclases.otrocliente;

public class Customer {
    private int id;
    private String name;
    private char gender; //m o f
    /** Constructor principal*/
    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    /** Getters para cada atributo */
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }
    /** toString */
    @Override
    public String toString() {
        return name + "(" + id + ")";
    }
}
