public class SuscripcionFija extends Suscripcion{
    private double cuotaMensual;

    public SuscripcionFija(String nombreUsuario, double cuotaMensual) {
        super(nombreUsuario);
        this.cuotaMensual = cuotaMensual;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        if(cuotaMensual<0) throw new IllegalArgumentException("La cuota no puede ser negativa.");
        this.cuotaMensual = cuotaMensual;
    }

    @Override
    public double calcularCuotaMensual() {
        return cuotaMensual;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("CuotaMensual: " + cuotaMensual);
    }

}
