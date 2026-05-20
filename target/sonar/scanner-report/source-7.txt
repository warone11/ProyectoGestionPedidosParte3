package gestionPedidos;

public class productoFisico extends producto{
    private Double costeEnvio;
    public productoFisico(String nombre, Double precio, Double costeEnvio) {
        super(nombre, precio);
        this.costeEnvio=costeEnvio;
    }
    public Double getCosteEnvio() {
        return costeEnvio;
    }
    public void setCosteEnvio(Double costeEnvio) {
        this.costeEnvio=costeEnvio;
    }
    @Override
    public Double calcularPrecioFinal(){
        return this.getPrecio()+this.costeEnvio;
    }
    @Override
    public String mostrarInformacion(){
        return "Nombre: "+getNombre()+" Precio: "+getPrecio()+" Coste de envio: "+getCosteEnvio();
    }
}
