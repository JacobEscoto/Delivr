package deliveryapp;

import java.util.Random;

public class Metodos {
    
    public boolean verificacionDatos(String nombre, String edad, String telefono, String correo, String direccion) {
        boolean validado = true;
        
        if (nombre.isEmpty() || nombre.isBlank()) {
            validado = false;
        }
        if (nombre.indexOf(" ") == -1) {
            validado = false;
        }
        
        if (edad.isEmpty() || edad.isBlank()) {
            validado = false;
        } else {
            for (int i = 0; i < edad.length(); i++) {
                char c = edad.charAt(i);
                if (c < '0' || c > '9') {
                    validado = false;
                    break;
                }
            }
            if (validado) {
                int edadEsMayor = Integer.parseInt(edad);
                if (edadEsMayor < 18) {
                    validado = false;
                }
            }
        }
        if (telefono.isEmpty() || telefono.isBlank()) {
            validado = false;
        } else {
            for (int i = 0; i < telefono.length(); i++) {
                char c = telefono.charAt(i);
                if (c < '0' || c > '9') {
                    validado = false;
                    break;
                }
            }
        }
        
        if (telefono.length() != 8) {
            validado = false;
        }
        
        if (correo.isEmpty() || correo.isBlank()) {
            validado = false;
        } else if (correo.indexOf("@gmail.com") == -1 && correo.indexOf("@hotmail.com") == -1) {
            validado = false;
        }
        
        if(direccion.isEmpty() || direccion.isBlank()) {
            validado = false;
        }
        
        
        return validado;
    }
    
    public String generarId(String nombre) {
        Random rand = new Random();
        String caracteres = "1234567890!@_=" + nombre;
        String id = "";
        int size = rand.nextInt(6, 11);

        for (int i = 0; i < size; i++) {
            int x = rand.nextInt(caracteres.length());
            char c = caracteres.charAt(x);
            id += c;
            // Impresion en consola como se va generando aleatoriamente el ID:
            System.out.printf("%s%n", id);
        }

        return id;
    }
    
    // Sobrecarga del metodo generarId
    public String generarId() {
        return generarId("");
    }
    
    public boolean esDouble(String numero) {
        boolean valido = true;
        if (numero.isEmpty()) {
            valido = false;
        }
        
        for (int i = 0; i < numero.length(); i++) {
            char c = numero.charAt(i);
            
            if (c == '.') {
                valido = true;
            }else if (c < '0' || c > '9') {
                valido = false;
                break;
            }
        }
        return valido;
    }
    
    public double subTotal(double peso) {
        if (peso <= 15) {
            return 100 + (peso * 5);
        } else {
            return 150 + (peso - 15) * 15;
        }
    }
    
    // Metodo recursivo - Calcular costo total
    public double costoTotal(double precio, double peso, int edad, boolean incluirSeguro) {
        double total = precio;
        
        if (edad < 65 && peso < 40 && precio < 500 && incluirSeguro) {
            total += 65;
        }
        
        if (edad >= 65) {
            total = costoTotal(precio * 0.40, peso, 0, incluirSeguro);
        } else if (peso >= 40) {
            total = costoTotal(precio * 0.90, 0, edad, incluirSeguro);
            
        } else if (precio >= 500) {
            total = costoTotal(precio * 0.85, peso, edad, incluirSeguro);
        }
        
        System.out.printf("%.2f Lps:", total);
        return total;
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
            ancho = rand.nextInt(10, 31);
            alto = rand.nextInt(10, 31);
        }
        
        // Calcular peso volumetrico
        System.out.println(largo);
        System.out.println(ancho);
        System.out.println(alto);
        System.out.println("Peso Volumetrico: " + (largo * ancho * alto)/6000);
        return (largo * ancho * alto) / 6000;
    }
    
}
