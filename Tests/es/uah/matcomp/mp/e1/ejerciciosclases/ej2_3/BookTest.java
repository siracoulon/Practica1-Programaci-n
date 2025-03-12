package es.uah.matcomp.mp.e1.ejerciciosclases.ej2_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private Author author;
    private Book book;

    @BeforeEach
    void setUp() {
        // Inicializamos el autor antes de cada test
        author = new Author("J.K. Rowling", "jk.rowling@example.com");

        // Inicializamos el libro antes de cada test (usando el primer constructor)
        book = new Book("978-3-16-148410-0", "Harry Potter", author, 39.99);
    }

    @Test
    void testConstructorWithQty() {
        // Probar el constructor que incluye qty
        Book bookWithQty = new Book("978-0-345-54321-0", "The Hobbit", author, 29.99, 100);

        assertEquals("978-0-345-54321-0", bookWithQty.getIsbn());
        assertEquals("The Hobbit", bookWithQty.getName());
        assertEquals(29.99, bookWithQty.getPrice());
        assertEquals(100, bookWithQty.getQty());
        assertEquals(author, bookWithQty.getAuthor());
    }

    @Test
    void testConstructorWithoutQty() {
        // Probar el constructor sin qty
        assertEquals("978-3-16-148410-0", book.getIsbn());
        assertEquals("Harry Potter", book.getName());
        assertEquals(39.99, book.getPrice());
        assertEquals(0, book.getQty()); // El valor por defecto de qty es 0
        assertEquals(author, book.getAuthor());
    }

    @Test
    void testGetters() {
        // Verificar los getters
        assertEquals("978-3-16-148410-0", book.getIsbn());
        assertEquals("Harry Potter", book.getName());
        assertEquals(author, book.getAuthor());
        assertEquals(39.99, book.getPrice());
        assertEquals(0, book.getQty());
    }

    @Test
    void testSetters() {
        // Verificar que los setters actualizan correctamente los valores
        book.setPrice(49.99);
        book.setQty(50);

        assertEquals(49.99, book.getPrice());
        assertEquals(50, book.getQty());
    }

    @Test
    void testGetAuthorName() {
        // Verificar que el método getAuthorName() devuelve el nombre correcto del autor
        assertEquals("J.K. Rowling", book.getAuthorName());
    }

    @Test
    void testToString() {
        // Verificar que el método toString() devuelve la representación correcta del libro
        String expected = "Book[name=Harry Potter,Author[Name=J.K. Rowling,Email=jk.rowling@example.com], price=39.99, qty=0]";
        assertEquals(expected, book.toString());
    }
}
