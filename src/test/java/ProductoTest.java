import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import gestionPedidos.productoDigital;
import gestionPedidos.productoFisico;

public class ProductoTest {

    @Test
     void testPrecioFinalDigital(){
        productoDigital p = new productoDigital("Juego",20.0,5.0,"personal");
        assertEquals(20.0, p.calcularPrecioFinal());
    }

    @Test
     void testCalculoIva(){
        productoDigital p = new productoDigital("Juego",100.0,5.0,"personal");
        assertEquals(21.0, p.calculoIva());
    }

    @Test
     void testPrecioFinalFisico(){
        productoFisico p = new productoFisico("Libro",10.0,5.0);
        assertEquals(15.0, p.calcularPrecioFinal());
    }

    @Test
     void testPrecioValido(){
        productoFisico p = new productoFisico("Libro",10.0,5.0);
        assertTrue(p.precioValido());
    }

    @Test
     void testPrecioNegativo(){
        productoFisico p = new productoFisico("Libro",-5.0,5.0);
        assertFalse(p.precioValido());
    }
    @Test
     void testGettersAndSetters(){
        productoFisico pf= new productoFisico("producto", 100.0, 5.0);
        pf.setNombre("productoNew");
        assertEquals(pf.getNombre(), "productoNew");
        pf.setPrecio(90.0);
        assertEquals(pf.getPrecio(), 90.0);
        pf.setCosteEnvio(7.0);
        assertEquals(pf.getCosteEnvio(), 7.0);
        assertEquals(pf.calcularPrecioFinal(), 97.0,1.0);
        productoDigital pd=new productoDigital("producto", 100.0, 50.0, "8343543543541");
        pd.setNombre("productoNew");
        assertEquals(pd.getNombre(), "productoNew");
        pd.setPrecio(90.0);
        assertEquals(pd.getPrecio(), 90.0);
        pd.setTamanyoDescarga(7.0);
        assertEquals(pd.getTamanyoDescarga(), 7.0);
        pd.setLicencia("54635342432");
        assertEquals(pd.getLicencia(), "54635342432");
        assertEquals(pd.mostrarInformacion(), "Nombre: productoNew Precio: 90.0 Tamaño de descarga: 7.0 Licencia: 54635342432");
    }

}
