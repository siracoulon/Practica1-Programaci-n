package es.uah.matcomp.mp.e1.ejerciciosclases.ej1_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account account1;
    private Account account2;

    @BeforeEach
    void setUp() {
        // Inicialización de las cuentas antes de cada test
        account1 = new Account("A001", "Juan");
        account2 = new Account("A002", "Pedro", 500);
    }

    @Test
    void testConstructor() {
        // Verificar que los valores del constructor son correctos
        assertEquals("A001", account1.getId());
        assertEquals("Juan", account1.getName());
        assertEquals(0, account1.getBalance());

        assertEquals("A002", account2.getId());
        assertEquals("Pedro", account2.getName());
        assertEquals(500, account2.getBalance());
    }

    @Test
    void testCredit() {
        // Probar el método credit
        account1.credit(200);
        assertEquals(200, account1.getBalance());

        account1.credit(300);
        assertEquals(500, account1.getBalance());
    }

    @Test
    void testDebit() {
        // Probar el método debit
        account2.debit(200);
        assertEquals(300, account2.getBalance());

        account2.debit(400); // Intentar debitar más de lo que tiene
        assertEquals(300, account2.getBalance()); // El balance no debe cambiar
    }

    @Test
    void testTransferTo() {
        // Probar el método transferTo
        account2.transferTo(account1, 200);
        assertEquals(300, account2.getBalance()); // El balance de account2 debe ser 300
        assertEquals(200, account1.getBalance()); // El balance de account1 debe ser 200

        account2.transferTo(account1, 400); // Intentar transferir más de lo que tiene
        assertEquals(300, account2.getBalance()); // El balance de account2 no debe cambiar
        assertEquals(200, account1.getBalance()); // El balance de account1 tampoco debe cambiar
    }

    @Test
    void testToString() {
        // Probar el método toString
        String expected = "Account [id=A001,name=Juan,balance=0]";
        assertEquals(expected, account1.toString());

        expected = "Account [id=A002,name=Pedro,balance=500]";
        assertEquals(expected, account2.toString());
    }
}
