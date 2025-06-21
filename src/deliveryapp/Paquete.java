package deliveryapp;

public class Paquete {

    // Atributos
    private String idPaquete;
    private String categoria;
    private double peso;
    private String descripcion;
    private boolean incluirSeguro;
    private Cliente cliente;
    private double costoTotal;

    // Constructor
    public Paquete(String idPaquete, String categoria, double peso, String descripcion, boolean incluirSeguro, Cliente cliente) {
        this.idPaquete = "PK-" + idPaquete;
        this.categoria = categoria;
        this.peso = peso;
        this.descripcion = descripcion;
        this.incluirSeguro = incluirSeguro;
        this.cliente = cliente;
        this.costoTotal = calcularCosto(peso, incluirSeguro);
    }

    // Getters y Setters
    public String getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(String idPaquete) {
        this.idPaquete = idPaquete;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getIncluirSeguro() {
        return incluirSeguro;
    }

    public void setIncluirSeguro(boolean incluirSeguro) {
        this.incluirSeguro = incluirSeguro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    private double calcularCosto(double peso, boolean incluirSeguro) {
        if(incluirSeguro) {
            return (2 * peso) + ((peso * 0.15) + (peso * 0.50));
        } else {
            
        }
        return (2 * peso) + (peso * 0.15);
    }

    @Override
    public String toString() {
        return "ID: " + idPaquete + " | Categoria: " + categoria + " | Peso: " + peso + "kg | Seguro: " + incluirSeguro + "Cliente: " + cliente.getNombre() + "" + cliente.getApellido();
    }
}
