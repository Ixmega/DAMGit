import java.time.LocalDate;

public class Alimento extends Producto{
    LocalDate fechaCaducidad;

    public Alimento(String nombre, double precio, int cantidad, int anyo, int mes, int dia) {
        super(nombre, precio, cantidad);
        this.fechaCaducidad = LocalDate.of(anyo, mes, dia);
    }

    public Alimento(String nombre, double precio, int cantidad, LocalDate fechaCaducidad) {
        super(nombre, precio, cantidad);
        this.fechaCaducidad = fechaCaducidad;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Fecha Caducidad: " + fechaCaducidad);
    }


}
