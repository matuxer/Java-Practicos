public class Factura {
    private Cliente cliente;
    private Carrito carrito;
    private double total;

    public Factura(Cliente cliente, Carrito carrito) {
        this.cliente = cliente;
        this.carrito = carrito;
        this.total = carrito.calcularTotal();
    }

    public void generarFactura() {
        System.out.println("Factura generada para " + cliente.getNombre());
        System.out.println("ID Cliente: " + cliente.getId());
        System.out.println("Productos comprados:");
        carrito.mostrarProductos();
        System.out.println("Total a pagar: $" + total);
    }
}
