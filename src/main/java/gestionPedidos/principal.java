package gestionPedidos;


public class principal {

    public static void main(String[] args) {
        productoFisico PS5 = new productoFisico("PlayStation5", 499.99, 10.0);
        productoDigital PSPlus1anyo= new productoDigital("Tarjeta PSPlus 1 Año", 79.99, 0.0, "No aplicable");
        cliente Juan = new cliente("Juan", "JuanPeres@gmail.com", "758674568");
        pedido pedido1 = new pedido(Juan);
        pedido1.agregarProducto(PS5, 1);
        pedido1.agregarProducto(PSPlus1anyo, 2);
        System.out.println(PS5.mostrarInformacion());
        System.out.println(PSPlus1anyo.mostrarInformacion());
        System.out.println(Juan.mostrarInformacion());
        pedido1.mostrarPedido();


        
    }
}
