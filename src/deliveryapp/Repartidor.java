package deliveryapp;

public class Repartidor {
    
    // Atributos
    private String nombre;
    private String idRepartidor;
    private String vehiculo;
    
    // Constructor
    public Repartidor (String nombre, String idRepartidor, String vehiculo) {
        this.nombre = nombre;
        this.idRepartidor = "R-" + idRepartidor;
        this.vehiculo = vehiculo;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getIdRepartidor() {
        return idRepartidor;
    }
    
    public void setIdRepartidor(String idRepartidor) {
        this.idRepartidor = idRepartidor;
    }
    
    public String getVehiculo() {
        return vehiculo;
    }
    
    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + " | ID: " + idRepartidor + " | Vehiculo: " + vehiculo;
    }
    
}