package es.uah.matcomp.mp.e1.ejerciciosclases.ej1_5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    private InvoiceItem invoiceItem;

    // Este método se ejecuta antes de cada test
    @BeforeEach
    void setUp() {
        // Inicializamos el objeto InvoiceItem con datos de prueba
        invoiceItem = new InvoiceItem("A001", "Producto Test", 5, 10.0);
    }

    // Test del constructor y los getters
    @Test
    void testConstructorAndGetters() {
        assertEquals("A001", invoiceItem.getId());
        assertEquals("Producto Test", invoiceItem.getDesc());
        assertEquals(5, invoiceItem.getQty());
        assertEquals(10.0, invoiceItem.getUnitPrice());
    }

    // Test del método setQty
    @Test
    void testSetQty() {
        invoiceItem.setQty(10);
        assertEquals(10, invoiceItem.getQty());
    }

    // Test del método setUnitPrice
    @Test
    void testSetUnitPrice() {
        invoiceItem.setUnitPrice(15.0);
        assertEquals(15.0, invoiceItem.getUnitPrice());
    }

    // Test del método getTotal
    @Test
    void testGetTotal() {
        assertEquals(50.0, invoiceItem.getTotal(), 0.001);
    }

    // Test del método toString
    @Test
    void testToString() {
        String expected = "InvoiceItem[id=A001, desc=Producto Test, qty=5, unitPrice=10.0]";
        assertEquals(expected, invoiceItem.toString());
    }
}
