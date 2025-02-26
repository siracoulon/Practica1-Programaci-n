package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Author {
    /** Atríbutos */
    private String name;
    private String email;
    /** Constructor */
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }
    /** Getters */
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    /** Setter para email */
    public void setEmail(String email) {
        this.email = email;
    }
    /** to String */
    public String toString() {
        return "Author[Name=" + name + ",Email=" + email + "]";
    }
}
