package es.uah.matcomp.mp.e1.ejerciciosclases.ej2_5;

public class TestAccountCustomer {
    public static void main(String[] args) {
        // Crear dos objetos Customer
        Customer customer1 = new Customer(36,"Sofía",'f');
        System.out.println(customer1);
        Customer customer2 = new Customer(45, "María",'f');
        System.out.println(customer2);

        // Crear un objeto Account sin balance inicial
        Account account1 = new Account(22, customer1);
        System.out.println(account1);

        // Crear un objeto Account con balance inicial
        Account account2 = new Account(22, customer2, 300);
        System.out.println(account2);

        // Acceder a atributos del cliente desde la cuenta
        String nombre1 = account1.getCustomerName();
        System.out.println(nombre1);

        // Agregar balance a la cuenta sin balance inicial
        account1.setBalance(100);
        System.out.println(account1);

        // Ingresar dinero
        account1.deposit(500.50);
        System.out.println("Balance tras ingresar dinero = " + account1.getBalance());

        // Extraer dinero sin error
        account1.withdraw(200);
        System.out.println("Balance tras extraer dinero = "+account1.getBalance());

        // Extraer dinero con error
        account1.withdraw(1000);

    }
}
