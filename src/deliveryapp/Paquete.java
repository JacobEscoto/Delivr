package deliveryapp;

import java.util.Random;

public class Paquete {

    // Atributos
    private String idPaquete;
    private String categoria;
    private double peso;
    private String descripcion;
    private boolean incluirSeguro;
    private Cliente cliente;

    // Constructor
    public Paquete(String idPaquete, String categoria, double peso, String descripcion, boolean incluirSeguro, Cliente cliente) {
        this.idPaquete = "PK-" + idPaquete;
        this.categoria = categoria;
        this.peso = peso;
        this.descripcion = descripcion;
        this.incluirSeguro = incluirSeguro;
        this.cliente = cliente;
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

    public double pesoCaja(String categoria) {
        Random rand = new Random();
        int largo = 0, ancho = 0, alto = 0;
        if (categoria.equalsIgnoreCase("ropa")) {
            largo = rand.nextInt(20, 51);
            ancho = rand.nextInt(20, 51);
            alto = rand.nextInt(20, 51);
        } else if (categoria.equalsIgnoreCase("comida")) {
            largo = rand.nextInt(20, 41);
            ancho = rand.nextInt(20, 41);
            alto = rand.nextInt(20, 41);
        } else if (categoria.equalsIgnoreCase("Medicina")) {
            largo = rand.nextInt(10, 16);
            ancho = rand.nextInt(10, 16);
            alto = rand.nextInt(10, 16);
        } else if (categoria.equalsIgnoreCase("Tecnologia")) {
            largo =  rand.nextInt(30, 81);
            ancho =  rand.nextInt(30, 81);
            alto =  rand.nextInt(30, 81);
        } else if (categoria.equalsIgnoreCase("fragil")) {
            largo = rand.nextInt(10, 31);
            ancho = rand.nextInt(10, 3);
            alto = rand.nextInt(10, 31);
        }
        
        // Calcular peso volumetrico
        System.out.println(largo);
        System.out.println(ancho);
        System.out.println(alto);
        System.out.println("Peso Volumetrico: " + (largo * ancho * alto)/6000);
        return (largo * ancho * alto) / 6000;
    }
    
    @Override
    public String toString() {
        return "ID: " + idPaquete + " | Categoria: " + categoria + " | Peso: " + peso + "kg | Seguro: " + incluirSeguro + "Cliente: " + cliente.getNombre() + "" + cliente.getApellido();
    }
}
