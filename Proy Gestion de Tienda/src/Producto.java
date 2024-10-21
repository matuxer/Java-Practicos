public class Producto {
    private String nombre;
    private double precio;
    private int id;

    public Producto(String nombre, double precio, int id) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getId() {
        return id;
    }

    public String mostrarProducto() {
        return nombre + " - $" + precio + ", ID: " + id;
    }
}
