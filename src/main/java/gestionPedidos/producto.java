package gestionPedidos;

abstract class producto {
    private String nombre;
    private Double precio;
    public producto(String nombre, Double precio) {
        this.nombre=nombre;
        this.precio=precio;
    }
    public Double calcularPrecioFinal() {
        return precio;
    }
    @Override
    public String toString() {
        return mostrarInformacion();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio=precio;
    
    }    
    public String mostrarInformacion(){
    
        return "Nombre: "+this.nombre+", Precio: "+this.precio;
    }
    public boolean precioValido(){
    if(precio>=0){
        return true;
    }
    return false;
}
}
