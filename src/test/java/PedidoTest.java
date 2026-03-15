import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import gestionPedidos.cliente;
import gestionPedidos.pedido;
import gestionPedidos.productoDigital;
import gestionPedidos.productoFisico;

public class PedidoTest {

    @Test
     void testAgregarProducto(){

        cliente c = new cliente("Luis","luis@gmail.com","123456789");
        pedido p = new pedido(c);

        productoDigital prod = new productoDigital("Curso",10.0,2.0,"personal");

        p.agregarProducto(prod,2);

        assertEquals(2,p.numeroProductos());
        p.mostrarPedido();
    }

    @Test
     void testPedidoVacio(){

        cliente c = new cliente("Luis","luis@gmail.com","123456789");
        pedido p = new pedido(c);

        assertTrue(p.pedidoVacio());
    }

    @Test
     void testCalcularTotal(){

        cliente c = new cliente("Luis","luis@gmail.com","123456789");
        pedido p = new pedido(c);

        productoFisico prod = new productoFisico("Libro",10.0,5.0);

        p.agregarProducto(prod,1);

        assertEquals(15.0,p.calcularTotal());
    }

}
