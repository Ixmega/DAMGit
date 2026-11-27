import java.time.LocalDate;

public class Electronico extends Producto{
    private int garantiaMeses;

    public Electronico(String nombre, double precio, int cantidad, int garantiaMeses) {
        super(nombre, precio, cantidad);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Garantia en Meses: " + garantiaMeses);
    }

    public LocalDate fechaGarantia(int mesCompra, int anoCompra){
        LocalDate fechaCompra = LocalDate.of(anoCompra, mesCompra, 1);
        return fechaCompra.plusMonths(garantiaMeses);
    }

}
