package Menu;
import Main.PuntoDeVenta;
import Product.Producto;
import ProductService.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Menu {
    private static ProductService productService = new ProductService();
    private static Scanner scanner = new Scanner(System.in);
    public static void menu(int opcion) {

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

                    switch (opcionesAccion) {
                        case 1:
                            Producto producto1 = new Producto();
                            System.out.println("Ingrese el nombre del producto");
                            producto1.setNombre(scanner.next());
                            System.out.println("Ingrese el precio del producto");
                            producto1.setPrecio(scanner.nextDouble());
                            System.out.println("Ingrese la cantidad");
                            producto1.setCantidad(scanner.nextInt());

                            ProductService.insertarProducto(producto1);
                            break;
                        case 2:
                            Producto producto2 = new Producto();

                            ProductService.obtenerListaDeProductos();

                            System.out.println("Ingrese el ID del producto que desea editar");
                            producto2.setId(scanner.nextInt());
                            System.out.println("Ingrese el nuevo nombre del producto");
                            producto2.setNombre(scanner.next());
                            System.out.println("Ingrese el nuevo precio del producto");
                            producto2.setPrecio(scanner.nextDouble());
                            System.out.println("Ingrese la nueva cantidad");
                            producto2.setCantidad(scanner.nextInt());
                            ProductService.editarProducto(producto2);
                            break;
                        case 3:
                            Producto producto3 = new Producto();

                            ProductService.obtenerListaDeProductos();
                            System.out.println("Ingrese el ID del producto que desea eliminar");
                            producto3.setId(scanner.nextInt());

                            boolean eliminado = ProductService.eliminarProducto(producto3);

                            if (eliminado){
                                System.out.println("Lista con el producto eliminado");
                                ProductService.obtenerListaDeProductos();
                            }else{
                                System.out.println("Producto no eliminado");
                            }

                            break;
                        case 4:

                            //List<Producto> listaDeProductos = ProductService.obtenerListaDeProductos();

                            ProductService.obtenerListaDeProductos();

                            break;
                        case 0:
                            opcionesAccion = 0;
                            System.out.println("Saliendo del menu de acciones");
                            break;
                        default:
                            System.out.println("Ingrese una opcion valida");
                    }
                } while (opcionesAccion != 0);
                break;
            case 3:



                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 0:
                System.out.println("SALIENDO DEL PROGRAMA");
                break;
            default:
                System.out.println("Ingrese una opcion valida!!!!");
        }
    }
}