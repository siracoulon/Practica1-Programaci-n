package es.uah.matcomp.mp.e1.ejerciciosclases.ej3_2;

public class Person {
    private String name;
    private String address;
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public Person() {}
    public String getName() {
        return name;

    }
    public String getAddress() {
        return address;

    }
    public void setAddress(String Address) {
        this.address = Address;
    }
    @Override
    public String toString(){
        return "[name= " + name+ ", address= " + address + "]";
    }
}

