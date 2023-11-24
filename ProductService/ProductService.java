package ProductService;
import Product.Producto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ProductService {
    private static Scanner scanner = new Scanner(System.in);

    private static List<Producto> productoList = new ArrayList<>();

    public static void insertarProducto(Producto producto){
        producto.setId(productoList.size());
        productoList.add(producto);

        System.out.println("¡¡Producto agregado exitosamente!!\n");

    }

    public static List<Producto> obtenerListaDeProductos() {
        List<Producto> listaDeProductos = ProductService.productoList;
        int i = 1;
        // Imprimir información de cada producto
        for (Producto p : listaDeProductos) {

            System.out.println("Producto #" + i + ": ID: " + p.getId() +
                    ": Nombre: "  + p.getNombre() +
                    ", Precio: " + p.getPrecio() +
                    ", Cantidad: " + p.getCantidad());
            i++;
        }

        return listaDeProductos;
    }

    public static void editarProducto(Producto productoNuevosValores){
        for (Producto producto : productoList) {
            if (producto.getId() == productoNuevosValores.getId()){
                producto.setNombre(productoNuevosValores.getNombre());
                producto.setPrecio(productoNuevosValores.getPrecio());
                producto.setCantidad(productoNuevosValores.getCantidad());
                System.out.println("¡¡Producto editado correctamente!!");
            }
        }
    }


    public static boolean eliminarProducto(Producto productoEliminar){
        for (Producto producto : productoList){

            if (producto.getId() == productoEliminar.getId()){
                productoList.remove(producto);
                System.out.println("¡¡Producto eliminado Correctamente!!");
                return true;
            }
        }
        return false;
    }



















    /*public static List<Producto> buscarProducto() {
        List<Producto> productosBuscados = new ArrayList<>();
        for (Producto producto : productoList) {
            productosBuscados.add(producto);
        }
        return productosBuscados;
    }*/
}

