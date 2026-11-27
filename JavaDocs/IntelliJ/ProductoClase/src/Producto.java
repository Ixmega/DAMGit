public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        setPrecio(precio);
        setCantidad(cantidad);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio<0) throw new IllegalArgumentException("El precio no puede ser negativo.");
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if(cantidad<0) throw new IllegalArgumentException("La cantidad no puede ser negativa.");
        this.cantidad = cantidad;
    }

    public double calcularValorTotal(){
        return precio * cantidad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
    }

}
