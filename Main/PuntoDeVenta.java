package Main;
import Menu.Menu;
import Product.Producto;
import ProductService.ProductService;
import java.util.List;
import java.util.Scanner;

public class PuntoDeVenta {

    private static Menu menu = new Menu();
    private static ProductService productService = new ProductService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg){

        int opcion;

        /*1. Producto
            1.agregar Producto
            2.Editar Producto
            3.Eliminar Producto
            4.Obtener informacion Producto
            0.salir
        * 2. Cliente
            1.agregar Cliente
            2.Editar Cliente
            3.Eliminar Cliente
            4.Obtener informacion Cliente
        * 3. proveedor
            1.agregar Proveedor
            2.Editar Proveedor
            3.Eliminar Proveedor
            4.Obtener informacion Proveedor
        * 4. Empleado
            1.agregar Empleado
            2.Editar Empleado
            3.Eliminar Empleado
            4.Obtener informacion Empleado

        *   0. salir

        * */

        do {
            System.out.println("" + "Menu\n" +
                    "1. Nueva Venta\n" +
                    "2. Productos\n" +
                    "3. Clientes\n" +
                    "4. Proveedores\n" +
                    "5. Empleados\n" +
                    "6. Ventas\n" +
                    "0. Salir\n");

            System.out.println("Ingrese una opcion");
            opcion = scanner.nextInt();

            Menu.menu(opcion);

        }while (opcion != 0);

    }
}






































































/*import java.util.ArrayList;
import java.util.Scanner;

class Producto {
    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}

class Proveedor {
    String nombre;

    public Proveedor(String nombre) {
        this.nombre = nombre;
    }
}

class Cliente {
    String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
}

class Empleado {
    String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
}

class Venta {
    Producto producto;
    Cliente cliente;
    Empleado empleado;

    public Venta(Producto producto, Cliente cliente, Empleado empleado) {
        this.producto = producto;
        this.cliente = cliente;
        this.empleado = empleado;
    }
}

public class PuntoDeVenta {

    private ArrayList<Producto> productos = new ArrayList<>();
    private ArrayList<Proveedor> proveedores = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Empleado> empleados = new ArrayList<>();
    private ArrayList<Venta> ventas = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PuntoDeVenta puntoDeVenta = new PuntoDeVenta();
        puntoDeVenta.ejecutar();
    }

    private void ejecutar() {
        int opcion;
        do {
            mostrarMenu();
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarNuevoProducto();
                    break;
                case 2:
                    agregarNuevoProveedor();
                    break;
                case 3:
                    agregarNuevoCliente();
                    break;
                case 4:
                    agregarNuevoEmpleado();
                    break;
                case 5:
                    // Implementar método para editar
                    break;
                case 6:
                    // Implementar método para eliminar
                    break;
                case 7:
                    // Implementar método para mostrar información
                    break;
                case 8:
                    realizarVenta();
                    break;
                case 9:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 9);
    }

    private void mostrarMenu() {
        System.out.println("1. Agregar nuevo producto");
        System.out.println("2. Agregar nuevo proveedor");
        System.out.println("3. Agregar nuevo cliente");
        System.out.println("4. Agregar nuevo empleado");
        System.out.println("5. Editar producto, proveedor, cliente, empleado");
        System.out.println("6. Eliminar producto, proveedor, cliente, empleado");
        System.out.println("7. Mostrar información de producto, proveedor, cliente, empleado");
        System.out.println("8. Realizar venta");
        System.out.println("9. Salir");
    }

    private void agregarNuevoProducto() {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        Producto producto = new Producto(nombre, precio);
        productos.add(producto);
        System.out.println("Producto agregado correctamente.");
    }

    private void agregarNuevoProveedor() {
        System.out.print("Ingrese el nombre del proveedor: ");
        String nombre = scanner.next();
        Proveedor proveedor = new Proveedor(nombre);
        proveedores.add(proveedor);
        System.out.println("Proveedor agregado correctamente.");
    }

    private void agregarNuevoCliente() {
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.next();
        Cliente cliente = new Cliente(nombre);
        clientes.add(cliente);
        System.out.println("Cliente agregado correctamente.");
    }

    private void agregarNuevoEmpleado() {
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.next();
        Empleado empleado = new Empleado(nombre);
        empleados.add(empleado);
        System.out.println("Empleado agregado correctamente.");
    }

    private void realizarVenta() {
        if (productos.isEmpty() || clientes.isEmpty() || empleados.isEmpty()) {
            System.out.println("No hay productos, clientes o empleados para realizar la venta.");
            return;
        }

        System.out.println("Seleccione el producto para la venta:");
        mostrarProductos();
        int productoIndex = scanner.nextInt();

        System.out.println("Seleccione el cliente para la venta:");
        mostrarClientes();
        int clienteIndex = scanner.nextInt();

        System.out.println("Seleccione el empleado para la venta:");
        mostrarEmpleados();
        int empleadoIndex = scanner.nextInt();

        Producto productoSeleccionado = productos.get(productoIndex);
        Cliente clienteSeleccionado = clientes.get(clienteIndex);
        Empleado empleadoSeleccionado = empleados.get(empleadoIndex);

        Venta venta = new Venta(productoSeleccionado, clienteSeleccionado, empleadoSeleccionado);
        ventas.add(venta);

        System.out.println("Venta realizada correctamente.");
    }

    private void mostrarProductos() {
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(i + ". " + productos.get(i).nombre + " - Precio: $" + productos.get(i).precio);
        }
    }

    private void mostrarClientes() {
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(i + ". " + clientes.get(i).nombre);
        }
    }

    private void mostrarEmpleados() {
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println(i + ". " + empleados.get(i).nombre);
        }
    }

    private void mostrarProveedores() {
        for (int i = 0; i < proveedores.size(); i++) {
            System.out.println(i + ". " + proveedores.get(i).nombre);
        }
    }
}*/


