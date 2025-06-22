package deliveryapp;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import javax.swing.JFrame;

public class Main {
    public static ArrayList<Cliente> clientes = new ArrayList();
    public static void main() {
        
        Scanner read = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList();
        ArrayList<Repartidor> repartidores = new ArrayList();
        ArrayList<Paquete> paquetes = new ArrayList();
        ArrayList<Pedido> pedidos = new ArrayList();
        char[][] mapa = new char[15][15];
        int opcion, accion;

        // Menu Principal
        do {
            mainMenu();
            opcion = read.nextInt();
            switch (opcion) {
                // Submenu de Clientes
                case 1:
                    System.out.println("\n------ GESTION DE CLIENTES ------");
                    System.out.println("1- Agregar cliente");
                    System.out.println("2- Actualizar cliente");
                    System.out.println("3- Buscar cliente");
                    System.out.println("4- Lista de clientes");
                    System.out.println("5- Borrar cliente");
                    System.out.print("Opcion a realizar: ");
                    accion = read.nextInt();
                    read.nextLine();
                    if (accion == 1) {
                        System.out.println("\n------ AGREGAR CLIENTE ------");
                        System.out.print("Nombre: ");
                        String nombreCliente = read.nextLine();
                        String idCliente = "";
                        System.out.print("Edad: ");
                        int edad = read.nextInt();
                        while (edad < 18) {
                            System.out.print("Edad Invalida...\nIntenta de nuevo: ");
                            edad = read.nextInt();
                        }
                        read.nextLine();
                        System.out.print("Telefono: +504 ");
                        String telefono = read.next();
                        boolean valido = true;
                        for (int i = 0; i < telefono.length(); i++) {
                            char num = telefono.charAt(i);
                            if (num < '0' || num > '9') {
                                valido = false;
                                break;
                            }
                        }
                        while (!valido || telefono.length() != 8) {
                            System.out.print("Numero con formato incorrecto\nIntenta de nuevo: ");
                            telefono = read.next();
                        }

                        System.out.print("Correo: ");
                        String correo = read.next();
                        while (correo.indexOf("@gmail.com") == -1 && correo.indexOf("@hotmail.com") == -1) {
                            System.out.print("Formato invalido para correo\nIntenta de nuevo: ");
                            correo = read.next();
                        }
                        read.nextLine();
                        System.out.print("Direccion (Coordenadas): ");
                        String direccion = read.nextLine();
                        direccion = formatoDireccion(direccion);
                        /*Cliente newCliente = new Cliente(nombreCliente, idCliente, edad, telefono, correo, direccion);
                        boolean idIdenticas;
                        do {
                            idIdenticas = newCliente.verificarId(clientes, newCliente.getIdCliente());
                            if (idIdenticas) {
                                idCliente = "";
                                newCliente.setIdCliente(idCliente);
                            }

                        } while (idIdenticas);
                        clientes.add(newCliente);
                        System.out.println("Cliente agregado con exito!");
                    } else if (accion == 2) {
                        // Seccion a completar
                    } else if (accion == 3) {
                        if (clientes.isEmpty()) {
                            System.out.println("Todavia no hay clientes registrados");
                            break;
                        }*/
                        System.out.printf("%n------ BUSCAR CLIENTE ------ %n ID / Nombre del Cliente a buscar: ");
                        String searchClient = read.nextLine();
                        Cliente buscarCliente = searchCliente(clientes, searchClient, true);
                    } else if (accion == 4) {
                        if (clientes.isEmpty()) {
                            System.out.println("Todavia no hay clientes registrados");
                            break;
                        }
                        for (int i = 0; i < clientes.size(); i++) {
                            System.out.printf("%nCliente %d%s%n", (i + 1), clientes.get(i).toString());
                        }
                    } else if (accion == 5) {
                        System.out.println("\n------ BORRAR CLIENTE ------");
                        System.out.print("Escribe Nombre / ID del cliente a borrar: ");
                        String borrarCliente = read.nextLine();
                        Cliente deleteClient = searchCliente(clientes, borrarCliente, false);
                        clientes.remove(deleteClient);
                        System.out.println("Cliente borrado exitosamente!");
                    }
                    break;
                // Submenu de Repartidores
                case 2:
                    System.out.println("\n------ GESTION DE REPARTIDORES ------");
                    System.out.println("1- Agregar repartidor");
                    System.out.println("2- Actualizar repartidor");
                    System.out.println("3- Buscar repartidor");
                    System.out.println("4- Lista de repartidores");
                    System.out.println("5- Borrar repartidor");
                    System.out.print("Opcion a realizar: ");
                    accion = read.nextInt();
                    read.nextLine();
                    if (accion == 1) {
                        System.out.println("------ AGREGAR REPARTIDOR ------");
                        System.out.print("Nombre: ");
                        String nombreRepartidor = read.nextLine();
                        String idRepartidor = "";
                        System.out.print("Vehiculo: ");
                        String vehiculo = read.next();
                        Repartidor repartidor = new Repartidor(nombreRepartidor, idRepartidor, vehiculo);
                        repartidores.add(repartidor);
                    } else if (accion == 2) {
                        for (int i = 0; i < repartidores.size(); i++) {
                            System.out.printf("%d. %s%n%n", (i + 1), repartidores.get(i).toString());
                        }
                        System.out.print("Ingrese posicion del Repartidor: ");
                        int pos = read.nextInt();
                        while (pos < 1 || pos > repartidores.size()) {
                            System.out.print("Posicion Invalida...\nIntenta de nuevo: ");
                            pos = read.nextInt();
                        }
                        pos -= 1;
                        repartidores.get(pos).actualizarDatos();
                    } else if (accion == 3) {
                        System.out.print("------ BUSCAR REPARTIDOR ------\nIngrese Nombre / ID del repartidor: ");
                        String buscarRepartidor = read.nextLine();
                        boolean encontrado = false;
                        for (int i = 0; i < repartidores.size(); i++) {
                            if (repartidores.get(i).getNombre().equalsIgnoreCase(buscarRepartidor) || repartidores.get(i).getIdRepartidor().equals(buscarRepartidor)) {
                                encontrado = true;
                                System.out.println("\nRepartidor " + (i + 1) + ".\n" + repartidores.get(i).toString());
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("No se encontro ningun repartidor con su Nombre / ID proporcionado");
                        }

                    } else if (accion == 4) {
                        System.out.println("\n------ REPARTIDORES ------");
                        for (int i = 0; i < repartidores.size(); i++) {
                            System.out.printf("%nRepartidor %d%n%s%n", (i + 1), repartidores.get(i).toString());
                        }
                    } else if (accion == 5) {
                        System.out.println("\n------ BORRAR REPARTIDOR ------");
                        System.out.print("Escribe Nombre / ID del repartidor a borrar: ");
                        String borrarRepartidor = read.nextLine();
                        boolean borrado = false;

                        for (int i = 0; i < repartidores.size(); i++) {
                            if (repartidores.get(i).getNombre().equalsIgnoreCase(borrarRepartidor) || repartidores.get(i).getIdRepartidor().equals(borrarRepartidor)) {
                                repartidores.remove(i);
                                borrado = true;
                                System.out.println("Repartidor borrado exitosamente!");
                                break;
                            }
                        }

                        if (!borrado) {
                            System.out.println("No se encontro un repartidor con el Nombre / ID proporcionado");
                        }
                    }
                    break;
                // Gestion de Paquetes
                case 3:
                    System.out.println("------ GESTION DE PAQUETES ------");
                    System.out.println("1- Agregar paquete");
                    System.out.println("2- Buscar paquete por ID");
                    System.out.println("3- Lista de paquetes");
                    System.out.println("4- Borrar paquete");
                    System.out.print("Opcion a realizar: ");
                    accion = read.nextInt();
                    read.nextLine();

                    if (accion == 1) {
                        String idPaquete = "";
                        System.out.print("Categoria: ");
                        String categoria = read.next();
                        System.out.print("Peso (kg): ");
                        double peso = read.nextDouble();
                        read.nextLine();
                        System.out.print("Descripcion: ");
                        String descripcion = read.nextLine();
                        System.out.print("Deseas incluir seguro? [s / n]: ");
                        char resp = read.next().charAt(0);
                        read.nextLine();
                        boolean incluirSeguro = (resp == 's' || resp == 'S');
                        System.out.print("Cliente asociado al paquete (Escribir nombre o ID): ");
                        String verificarCliente = read.nextLine();
                        Cliente clienteAsociado = searchCliente(clientes, verificarCliente, false);
                        Paquete paquete = new Paquete(idPaquete, categoria, peso, descripcion, incluirSeguro, clienteAsociado);
                        paquetes.add(paquete);
                        System.out.println("Paquete agregado exitosamente!");
                    } else if (accion == 2) {
                        System.out.println("------ BUSCAR PAQUETE ------");
                        System.out.print("Escriba ID: ");
                        String buscarPaquete = read.nextLine();

                        boolean encontrado = false;
                        for (int i = 0; i < paquetes.size(); i++) {
                            if (paquetes.get(i).getIdPaquete().equalsIgnoreCase(buscarPaquete)) {
                                Paquete paqueteFound = paquetes.get(i);
                                System.out.println(paqueteFound);
                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("Paquete no encontrado!");
                        }
                    } else if (accion == 4) {
                        System.out.println("\n------ PAQUETES EN STOCK ------");
                        int listadoNum = 1;
                        for (Paquete paquete : paquetes) {
                            System.out.printf("%n%d. %s", listadoNum, paquete);
                            listadoNum++;
                        }
                    }
                    break;
                case 4:
                    System.out.println("------ GESTION DE PEDIDOS ------");
                    System.out.println("1- Crear pedido");
                    System.out.println("2- Enviar pedido");
                    System.out.println("3- Buscar pedido");
                    System.out.println("4- Lista de pedidos");
                    System.out.println("5- Cancelar pedido");
                    System.out.print("Opcion a realizar: ");
                    accion = read.nextInt();
                    read.nextLine();
                    if (accion == 1) {

                    } else if (accion == 2) {
                        
                    } else if (accion == 5) {
                        System.out.println("------ CANCELACION DE PEDIDO ------");
                        System.out.print("ID de Pedido a Cancelar: ");
                        String cancelarPedido = read.next();
                        boolean cancelado = false;
                        for (Pedido pedido : pedidos) {
                            if(pedido.getIdPedido().equals(cancelarPedido)) {
                                pedido.setEstado("Cancelado");
                                cancelado = true;
                                System.out.println("Pedido cancelado con exito");
                                break;
                            }
                        }
                        
                        if (!cancelado) {
                            System.out.println("No se puedo cancelar el pedido...");
                            break;
                        }
                    }

                    break;
                case 5:
                    System.out.println("Saliendo del Delivery...");
                    break;
                default:
                    System.out.println("Opcion Invalida... Intenta nuevamente");
                    break;
            }

        } while (opcion != 5);

    }

    public static void mainMenu() {
        System.out.println("\n------ DELIVERY APP ------");
        System.out.println("1- Gestion de Clientes");
        System.out.println("2- Gestion de Repartidores");
        System.out.println("3- Gestion de Paquetes");
        System.out.println("4- Gestion de Pedidos");
        System.out.println("5- Salir");
        System.out.print("Ingrese una opcion: ");
    }

    public static String formatoDireccion(String direccion) {
        boolean noContieneEspacio = direccion.indexOf(" ") == -1;
        if (!noContieneEspacio) {
            direccion = direccion.replace(" ", "");
        }

        return direccion;
    }

    public static Cliente searchCliente(ArrayList<Cliente> clientes, String entrada, boolean mostrar) {   
        Scanner read = new Scanner(System.in);
        boolean encontrado = false;
        Cliente cliente = null;
        
        while (!encontrado) {
            for (int i = 0; i < clientes.size(); i++) {
                if (clientes.get(i).getNombre().equalsIgnoreCase(entrada) || clientes.get(i).getIdCliente().equals(entrada)) {
                    cliente = clientes.get(i);
                    encontrado = true;
                    if (mostrar) {
                        System.out.print(cliente);
                    }
                    break;
                }
            }
            
            if (!encontrado) {
                System.out.print("No se encontro ningun cliente con Nombre/ID Proporcionado...\nIntenta de nuevo: ");
                entrada = read.nextLine().toLowerCase();
            }
        }
        return cliente;
    }
}
