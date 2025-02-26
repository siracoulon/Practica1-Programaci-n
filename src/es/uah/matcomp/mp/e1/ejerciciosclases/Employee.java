package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    /** Constructor principal con atributos dados */
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    /** Getter para id */
    public int getId() {
        return id;
    }
    /** Getter para firstName */
    public String getFirstName() {
        return firstName;
    }
    /** Getter para lastName */
    public String getLastName() {
        return lastName;
    }
    /** Getter para name*/
    public String getName(){
        return firstName + " " + lastName;
    }
    /** Getter para salary */
    public int getSalary() {
        return salary;
    }
    /** Setter para Salary*/
    public void setSalary(int salary) {
        this.salary = salary;
    }
    /** Getter para AnnualSalary*/
    public int getAnnualSalary() {
        return salary * 12;
    }
    /** método para aumentar el salario porcentualmente */
    public int raiseSalary(int percent) {
        this.salary = salary + (salary * percent / 100);
        return this.salary;
    }
    /** toString */
    public String toString() {
        return "Employee[id=" + id + ",name=" + firstName + " " + lastName + ",salary=" + salary + "]";
    }
}
