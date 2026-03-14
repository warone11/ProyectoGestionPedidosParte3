import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import gestionPedidos.cliente;
public class ClienteTest {
    @Test
    public void testNombreCliente(){
        cliente c = new cliente("Juan","juan@gmail.com","123456789");
        assertEquals("Juan", c.getNombre());
    }

    @Test
    public void testCorreoValido(){
        cliente c = new cliente("Ana","ana@gmail.com","123456789");
        assertTrue(c.correoValido());
    }

    @Test
    public void testCorreoIncorrecto(){
        cliente c = new cliente("Ana","anagmail","123456789");
        assertFalse(c.correoValido());
    }

    @Test
    public void testTelefonoValido(){
        cliente c = new cliente("Ana","ana@gmail.com","123456789");
        assertTrue(c.telefonoValido());
    }

    @Test
    public void testTelefonoIncorrecto(){
        cliente c = new cliente("Ana","ana@gmail.com","123");
        assertFalse(c.telefonoValido());
    }

}
