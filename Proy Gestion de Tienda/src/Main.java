import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Laptop", 1500.00, 1);
        Producto p2 = new Producto("Celular", 800.00, 2);
        Producto p3 = new Producto("Tablet", 300.00, 3);

        Carrito carrito = new Carrito();

        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = input.nextLine();
        System.out.print("Ingrese el ID del cliente: ");
        int idCliente = input.nextInt();
        Cliente cliente = new Cliente(nombreCliente, idCliente);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nProductos disponibles:");
            System.out.println("1. " + p1.getNombre() + " - $" + p1.getPrecio());
            System.out.println("2. " + p2.getNombre() + " - $" + p2.getPrecio());
            System.out.println("3. " + p3.getNombre() + " - $" + p3.getPrecio());
            System.out.println("4. Finalizar compra");

            System.out.print("Seleccione un producto para agregar al carrito (1-3) o 4 para finalizar: ");
            int opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    carrito.agregarProducto(p1);
                    break;
                case 2:
                    carrito.agregarProducto(p2);
                    break;
                case 3:
                    carrito.agregarProducto(p3);
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }

        Factura factura = new Factura(cliente, carrito);
        factura.generarFactura();

        input.close();
    }
}