package es.uah.matcomp.mp.e1.ejerciciosclases.ej2_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    private Author author;

    @BeforeEach
    void setUp() {
        // Inicializamos el objeto Author antes de cada test
        author = new Author("John Doe", "johndoe@example.com");
    }

    @Test
    void testConstructor() {
        // Verificar que el constructor inicializa correctamente los atributos
        assertEquals("John Doe", author.getName());
        assertEquals("johndoe@example.com", author.getEmail());
    }

    @Test
    void testGetName() {
        // Verificar que el método getName() devuelve el nombre correcto
        assertEquals("John Doe", author.getName());
    }

    @Test
    void testGetEmail() {
        // Verificar que el método getEmail() devuelve el email correcto
        assertEquals("johndoe@example.com", author.getEmail());
    }

    @Test
    void testSetEmail() {
        // Verificar que el método setEmail() actualiza correctamente el email
        author.setEmail("newemail@example.com");
        assertEquals("newemail@example.com", author.getEmail());
    }

    @Test
    void testToString() {
        // Verificar que el método toString() devuelve la representación correcta del objeto Author
        String expected = "Author[Name=John Doe,Email=johndoe@example.com]";
        assertEquals(expected, author.toString());
    }
}
