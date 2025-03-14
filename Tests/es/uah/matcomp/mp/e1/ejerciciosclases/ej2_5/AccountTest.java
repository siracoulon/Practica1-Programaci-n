package es.uah.matcomp.mp.e1.ejerciciosclases.ej2_5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account account;
    private Customer customer;

    @BeforeEach
    void setUp() {
        // Inicializamos un cliente antes de cada test
        customer = new Customer(1, "John Doe", 'm');
        // Inicializamos la cuenta con el cliente y un saldo inicial
        account = new Account(101, customer, 500.0);
    }

    @Test
    void testConstructor() {
        // Verificar que el constructor inicializa correctamente los atributos
        assertEquals(101, account.getId());
        assertEquals(customer, account.getCustomer());
        assertEquals(500.0, account.getBalance());
    }

    @Test
    void testDeposit() {
        // Verificar que el método deposit agrega el monto correctamente al saldo
        account.deposit(200.0);
        assertEquals(700.0, account.getBalance());
    }

    @Test
    void testWithdraw() {
        // Verificar que el método withdraw reduce el saldo correctamente
        account.withdraw(100.0);
        assertEquals(400.0, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientBalance() {
        // Verificar que no se puede retirar más dinero que el saldo disponible
        account.withdraw(600.0);
        assertEquals(500.0, account.getBalance()); // Saldo no debe cambiar
    }

    @Test
    void testToString() {
        // Verificar que el método toString devuelve la representación correcta
        String expected = "John Doe(1) balance=500.0";
        assertEquals(expected, account.toString());
    }

    @Test
    void testGetCustomerName() {
        // Verificar que el método getCustomerName devuelve el nombre correcto del cliente
        assertEquals("John Doe", account.getCustomerName());
    }

    @Test
    void testAccountWithoutBalance() {
        // Verificar la creación de una cuenta sin saldo inicial
        Account accountWithoutBalance = new Account(102, customer);
        assertEquals(0.0, accountWithoutBalance.getBalance());
    }
}
