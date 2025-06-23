package deliveryapp;

import java.util.Random;
import javax.swing.JOptionPane;

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
    public char[][] entregarPedido(char[][] mapa, int coordX, int coordY) {
        Random rand = new Random();
        this.estado = "En camino";
        
        boolean entregado = false;
        int x = rand.nextInt(0, 15);
        int y = rand.nextInt(0, 15);
        mapa[x][y] = 'R';
        while (x != coordX || y != coordY) {
            mapa[x][y] = '=';
            if(x<coordX) {
                x++;
            } else if (x > coordX) {
                x--;
            } else if (y < coordY) {
                y++;
            } else if (y > coordY) {
                y--; 
            }
            if (x == coordX && y == coordY) {
                entregado = true;
                break;
            }
            String movimiento = "";
            for (int i = 0; i < mapa.length; i++) {
                for (int j = 0; j < mapa[i].length; j++) {
                    if (i == x && j == y) {
                        movimiento += "[R]";
                    } else if (i == coordX && j == coordX) {
                        movimiento += "[C]";
                    } else {
                        movimiento += "[ " + mapa[i][j] + " ]";
                    }
                }
                movimiento += "\n";
            }
            
            JOptionPane.showMessageDialog(null, movimiento);
        }
        
        mapa[x][y] = 'R';
        if (entregado) {
            JOptionPane.showMessageDialog(null, "Pedido entregado!");
            this.estado = "Entregado";
        }
        
        return mapa;
    }
    
    @Override
    public String toString() {
        return "Paquete: " + paquete.getIdPaquete() + " | Repartidor: " + repartidor.getNombre() + "| Estado:" + estado + " | Costo: " + total;
    }
}