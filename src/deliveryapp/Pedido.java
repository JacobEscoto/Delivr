package deliveryapp;

public class Pedido {
    
    // Atributos
    private String idPedido;
    private Paquete paquete;
    private Repartidor repartidor;
    private double total;
    private String estado;
    
    // Constructor
    public Pedido(String idPedido, Paquete paquete, Repartidor repartidor, double total) {
        this.idPedido = idPedido;
        this.paquete = paquete;
        this.repartidor = repartidor;
        this.total = total;
        this.estado = "Pendiente";
    }
    
    // Getters y Setters
    public String getIdPedido() {
        return idPedido;
    }
    
    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }
    
    public Paquete getPaquete() {
        return paquete;
    }
    
    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }
    
    public Repartidor getRepartidor() {
        return repartidor;
    }
    
    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }
    
    public double getTotal() {
        return total;
    }
    
    public void setTotal(double total) {
        this.total = total;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    // Metodos
    public void entregarPedido() {
        this.estado = "En camino";
    }
    
    @Override
    public String toString() {
        return "Paquete: " + paquete.getIdPaquete() + " | Repartidor: " + repartidor.getNombre() + "| Estado:" + estado + " | Costo: " + total;
    }
}