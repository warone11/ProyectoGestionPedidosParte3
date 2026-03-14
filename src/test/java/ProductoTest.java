import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import gestionPedidos.productoDigital;
import gestionPedidos.productoFisico;

public class ProductoTest {

    @Test
    public void testPrecioFinalDigital(){
        productoDigital p = new productoDigital("Juego",20.0,5.0,"personal");
        assertEquals(20.0, p.calcularPrecioFinal());
    }

    @Test
    public void testCalculoIva(){
        productoDigital p = new productoDigital("Juego",100.0,5.0,"personal");
        assertEquals(21.0, p.calculoIva());
    }

    @Test
    public void testPrecioFinalFisico(){
        productoFisico p = new productoFisico("Libro",10.0,5.0);
        assertEquals(15.0, p.calcularPrecioFinal());
    }

    @Test
    public void testPrecioValido(){
        productoFisico p = new productoFisico("Libro",10.0,5.0);
        assertTrue(p.precioValido());
    }

    @Test
    public void testPrecioNegativo(){
        productoFisico p = new productoFisico("Libro",-5.0,5.0);
        assertFalse(p.precioValido());
    }

}
