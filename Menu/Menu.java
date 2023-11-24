package Menu;
import Product.Producto;
import ProductService.ProductService;
import java.util.List;
import java.util.Scanner;
import Client.Client;
import ClientService.ClientService;

public class Menu {

    private static Scanner scanner = new Scanner(System.in);

    public static void menu(int opcion){

        int opcionesAccion;
        switch (opcion) {

            case 1:

                break;

            case 2:
                do {
                    System.out.println("\n" + "ACCIONES DE PRODUCTO\n" +
                            "1. Insertar Producto\n" +
                            "2. Editar Producto\n" +
                            "3. Eliminar Producto\n" +
                            "4. Obtener Informacion de producto\n" +
                            "0. Salir\n");

                    System.out.println("Eliga una opcion");
                    opcionesAccion = scanner.nextInt();

                    switch (opcionesAccion){

                        case 1:

                            Producto producto = new Producto();
                            System.out.println("Ingrese el nombre del producto\n");
                            producto.setNombre(scanner.next());


                            System.out.println("Ingrese el precio del producto\n");
                            producto.setPrecio(scanner.nextDouble());


                            System.out.println("Ingrese la cantidad del producto\n");
                            producto.setCantidad(scanner.nextInt());
                            ProductService.insertarProducto(producto);

                            break;

                        case 2:
                            Producto producto1 = new Producto();
                            System.out.println("Ingrese el ID del producto que desea editar");
                            producto1.setId(scanner.nextInt());
                            System.out.println("Ingrese el nuevo nombre del producto");
                            producto1.setNombre(scanner.next());
                            System.out.println("Ingrese el nuevo precio del producto");
                            producto1.setPrecio(scanner.nextDouble());
                            System.out.println("Ingrese la nueva cantidad");
                            producto1.setCantidad(scanner.nextInt());
                            ProductService.editarProducto(producto1);


                            break;
                        case 3:
                            Producto producto3 = new Producto();

                            ProductService.obtenerListaDeProductos();
                            System.out.println("Ingrese el ID del producto que desea eliminar");
                            producto3.setId(scanner.nextInt());

                            boolean eliminado = ProductService.eliminarProducto(producto3);

                            if (eliminado){
                                System.out.println("Lista con elproducto eliminado");
                                ProductService.obtenerListaDeProductos();
                            }else{
                                System.out.println("Producto no eliminado");
                            }



                            break;
                        case 4:
                            // Obtener la lista de productos desde el servicio
                            ProductService.obtenerListaDeProductos();

                            break;

                        case 0:
                            System.out.println("Saliendo del menu de acciones...");
                            break;

                        default:
                            System.out.println("ERROR Ingresa una opcion valida");

                    }

                }while (opcionesAccion!=0);

                break;

            case 3:
                do {
                    System.out.println("\n" + "ACCIONES DE CLIENTE\n" +
                            "1. Agregar Cliente\n" +
                            "2. Editar Cliente\n" +
                            "3. Eliminar Cliente\n" +
                            "4. Ver Informacion de Clientes\n" +
                            "0. Salir\n");

                    System.out.println("Eliga una opcion");
                    opcionesAccion = scanner.nextInt();

                    switch (opcionesAccion){

                        case 1:

                            Client client1 = new Client();
                            System.out.println("Ingrese el id del cliente\n");
                            client1.setId(scanner.nextInt());


                            System.out.println("Ingrese el nombre del cliente\n");
                            client1.setNombre(scanner.next());


                            System.out.println("Ingrese la edad del cliente\n");
                            client1.setEdad(scanner.nextInt());

                            ClientService.insertarCliente(client1);

                            break;

                        case 2:
                            Client client2 = new Client();

                            System.out.println("Ingrese el ID del cliente que desea editar");
                            client2.setId(scanner.nextInt());
                            System.out.println("Ingrese el nuevo nombre del cliente");
                            client2.setNombre(scanner.next());
                            System.out.println("Ingrese la nueva edad del cliente");
                            client2.setEdad(scanner.nextInt());

                            ClientService.editarCliente(client2);


                            break;
                        case 3:
                            Client cliente3 = new Client();

                            ClientService.obtenerListaDeClientes();
                            System.out.println("Ingrese el ID del cliente que desea eliminar");
                            cliente3.setId(scanner.nextInt());

                            boolean eliminado = ClientService.eliminarCliente(cliente3);

                            if (eliminado){
                                System.out.println("Lista con el cliente eliminado");
                                ProductService.obtenerListaDeProductos();
                            }else{
                                System.out.println("cliente no eliminado");
                            }



                            break;
                        case 4:
                            // Obtener la lista de clientes desde el servicio
                            ClientService.obtenerListaDeClientes();

                            break;

                        case 0:
                            System.out.println("Saliendo del menu de acciones...");
                            break;

                        default:
                            System.out.println("ERROR Ingresa una opcion valida");

                    }

                }while (opcionesAccion!=0);

                break;

            case 4:

                break;

            case 5:

                break;

            case 6:

                break;

            case 0:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("ERROR opcion no valida.");
        }

    }
}
