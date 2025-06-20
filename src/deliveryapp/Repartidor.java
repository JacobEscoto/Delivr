package deliveryapp;

import java.util.Scanner;
import java.util.Random;

public class Repartidor {
    
    // Atributos
    private String nombre;
    private String idRepartidor;
    private String vehiculo;
    private int velocidad;
    
    // Constructor
    public Repartidor (String nombre, String idRepartidor, String vehiculo) {
        this.nombre = nombre;
        this.idRepartidor = "R-" + idRepartidor;
        this.vehiculo = vehiculo;
        this.velocidad = velocidadPromedio(vehiculo);
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
    
    public int getVelocidad() {
        return velocidad;
    }
    
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    private int velocidadPromedio(String transporte) {
        Random rand = new Random();
        int velocidad = 10; // Velocidad por defecto
        
        if (transporte.equalsIgnoreCase("carro")) {
            velocidad = rand.nextInt(40, 60);
        } else if (transporte.equalsIgnoreCase("moto")) {
            velocidad = rand.nextInt(30, 51);
        } else if (transporte.equalsIgnoreCase("bicicleta")) {
            velocidad = rand.nextInt(10, 26);
        }
        
        return velocidad;
    }
    
    public void actualizarDatos() {
        Scanner read = new Scanner(System.in);
        System.out.println("1- Actualizar Nombre\n2- Actualizar Vehiculo");
        System.out.print("Ingrese su opcion: ");
        int accion = read.nextInt();
        read.nextLine();
        boolean actualizado = false;
        
        switch(accion) {
            case 1:
                System.out.print("Nuevo nombre: ");
                String nuevoNombre = read.nextLine();
                if (!nuevoNombre.equalsIgnoreCase(this.nombre)) {
                    this.nombre = nuevoNombre;
                    actualizado = true;
                    System.out.println("Repartidor actualizado con exito!");
                }
                break;
            case 2:
                System.out.print("Nuevo vehiculo: ");
                String nuevoVehiculo = read.next();
                if (!nuevoVehiculo.equalsIgnoreCase(this.vehiculo)){
                    this.vehiculo = nuevoVehiculo;
                    actualizado = true;
                    System.out.println("Repartidor actualizado con exito!");
                }
                break;
            default:
                System.out.println("Opcion invalida...");
                break;
        }
        
        if (!actualizado) {
            System.out.println("No se actualizaron los datos del repartidor debido a que has escrito el mismo dato ya establecido");
        }
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + " | ID: " + idRepartidor + " | Vehiculo: " + vehiculo;
    }
    
}