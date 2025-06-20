package deliveryapp;

public class Pedido {
    
    // Atributos
    private String idPedido;
    private Cliente cliente;
    private Paquete paquete;
    private Repartidor repartidor;
    private String estado;
    
    // Constructor
    public Pedido(String idPedido, Cliente cliente, Paquete paquete, Repartidor repartidor, String estado) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.paquete = paquete;
        this.repartidor = repartidor;
        this.estado = estado;
    }
    
    // Getters y Setters
    public String getIdPedido() {
        return idPedido;
    }
    
    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
}