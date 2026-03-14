package gestionPedidos;

public class productoDigital extends producto {
    private Double tamanyoDescarga;
    private String licencia;
    public productoDigital(String nombre, Double precio, Double tamanyoDescarga, String licencia) {
        super(nombre,precio);
        this.tamanyoDescarga=tamanyoDescarga;
        this.licencia=licencia;
    }
    public Double getTamanyoDescarga() {
        return tamanyoDescarga;
    }
    public void setTamanyoDescarga(Double tamanyoDescarga) {
        this.tamanyoDescarga=tamanyoDescarga;
    }
    public String getLicencia() {
        return licencia;
    }
    public void setLicencia(String licencia) {
        this.licencia=licencia;
    }
    @Override
    public Double calcularPrecioFinal() {
        return this.getPrecio();
    }
    public double calculoIva(){
        return this.getPrecio()*0.21;
    }
    public String mostrarInformacion(){
        return "Nombre: "+getNombre()+" Precio: "+getPrecio()+" Tamaño de descarga: "+getTamanyoDescarga()+" Licencia: "+getLicencia();
    }
}
