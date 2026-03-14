package gestionPedidos;
import java.util.ArrayList;
import java.util.List;

public class pedido {
    private List<producto> productos;
    private cliente cliente;
    public pedido(cliente cliente) {
        this.cliente=cliente;
        this.productos=new ArrayList<producto>();
    }
    public void agregarProducto(producto p, int cant) {
        for (int i = 0; i < cant; i++) {
            productos.add(p);
        }
    }
    public Double calcularTotal() {
        Double suma=0.0;
        for (producto producto : productos) {
            suma+=producto.calcularPrecioFinal();
        }
        return suma;
    }
    public void mostrarPedido(){
        System.out.println("Pedido:\n********************************");
        for (producto producto : productos) {
            System.out.println(producto.mostrarInformacion());
        }
        System.out.println("********************************\nTotal: "+calcularTotal());
    }
    public int numeroProductos(){
    return productos.size();
    }

    public boolean pedidoVacio(){
        if(productos.size()==0){
            return true;
        }
        return false;
    }
}
