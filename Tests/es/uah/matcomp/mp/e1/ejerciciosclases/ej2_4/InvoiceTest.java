package es.uah.matcomp.mp.e1.ejerciciosclases.ej2_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    private Customer customer;
    private Invoice invoice;

    @BeforeEach
    void setUp() {
        customer = new Customer(1, "John Doe", 10);
        invoice = new Invoice(101, customer, 100.0);
    }

    @Test
    void getId() {
        assertEquals(101, invoice.getId());
    }

    @Test
    void getCustomer() {
        assertEquals(customer, invoice.getCustomer());
    }

    @Test
    void getAmount() {
        assertEquals(100.0, invoice.getAmount(), 0.001);
    }

    @Test
    void setCustomer() {
        Customer newCustomer = new Customer(2, "Jane Doe", 15);
        invoice.setCustomer(newCustomer);
        assertEquals(newCustomer, invoice.getCustomer());
    }

    @Test
    void setAmount() {
        invoice.setAmount(200.0);
        assertEquals(200.0, invoice.getAmount(), 0.001);
    }

    @Test
    void getCustomerId() {
        assertEquals(1, invoice.getCustomerId());
    }

    @Test
    void getCustomerName() {
        assertEquals("John Doe", invoice.getCustomerName());
    }

    @Test
    void getCustomerDiscount() {
        assertEquals(10, invoice.getCustomerDiscount());
    }

    @Test
    void getAmountAfterDiscount() {
        assertEquals(90.0, invoice.getAmountAfterDiscount(), 0.001);
    }

    @Test
    void testToString() {
        String expected = "Invoice [id=101,Customer[id=1,name=John Doe,discount=10], amount=100.0]";
        assertEquals(expected, invoice.toString());
    }
}