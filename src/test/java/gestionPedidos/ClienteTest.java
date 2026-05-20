package gestionPedidos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
public class ClienteTest {
    @Test
     void testNombreCliente(){
        cliente c = new cliente("Juan","juan@gmail.com","123456789");
        assertEquals("Juan", c.getNombre());
    }

    @Test
     void testCorreoValido(){
        cliente c = new cliente("Ana","ana@gmail.com","123456789");
        assertTrue(c.correoValido());
    }

    @Test
     void testCorreoIncorrecto(){
        cliente c = new cliente("Ana","anagmail","123456789");
        assertFalse(c.correoValido());
    }

    @Test
     void testTelefonoValido(){
        cliente c = new cliente("Ana","ana@gmail.com","123456789");
        assertTrue(c.telefonoValido());
    }

    @Test
     void testTelefonoIncorrecto(){
        cliente c = new cliente("Ana","ana@gmail.com","123");
        assertFalse(c.telefonoValido());
    }
    @Test
    void testGettersYSetters(){
        cliente c = new cliente("Javier","javi123@gmai.com", "987654321");
        c.setCorreo("javinuevo@gmail.com");
        assertEquals(c.getCorreo(), "javinuevo@gmail.com");
        c.setNombre("JaviNuevo");
        assertEquals(c.getNombre(), "JaviNuevo");
        c.setTelefono("999999999");
        assertEquals(c.getTelefono(), "999999999");
    }
    @Test
     void testMostrarInformacion(){
        cliente c = new cliente("Javier","javi123@gmail.com", "987654321");
        assertEquals(c.mostrarInformacion(), "Nombre: Javier Correo: javi123@gmail.com Telefono: 987654321");
    }

}
