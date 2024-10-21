import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Producto> productos;

    public Carrito() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println(producto.getNombre() + " ha sido agregado al carrito.");
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El carrito esta vacío.");
        } else {
            System.out.println("Productos en el carrito:");
            for (Producto producto : productos) {
                System.out.println(producto.mostrarProducto());
            }
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }

        return total;
    }
}
