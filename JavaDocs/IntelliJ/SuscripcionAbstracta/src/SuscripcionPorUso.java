public class SuscripcionPorUso extends Suscripcion{
    private double gigasConsumidos, precioXGiga;

    public SuscripcionPorUso(String nombreUsuario, double gigasConsumidos, double precioXGiga) {
        super(nombreUsuario);
        this.gigasConsumidos = gigasConsumidos;
        this.precioXGiga = precioXGiga;
    }

    public double getGigasConsumidos() {
        return gigasConsumidos;
    }

    public void setGigasConsumidos(double gigasConsumidos) {
        if(gigasConsumidos<0) throw new IllegalArgumentException("Los gigas consumidos no pueden ser negativos.");
        this.gigasConsumidos = gigasConsumidos;
    }

    public double getPrecioXGiga() {
        return precioXGiga;
    }

    public void setPrecioXGiga(double precioXGiga) {
        if(precioXGiga<0) throw new IllegalArgumentException("La cuota no puede ser negativa.");
        this.precioXGiga = precioXGiga;
    }

    @Override
    public double calcularCuotaMensual() {
        return gigasConsumidos * precioXGiga;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("GigasConsumidos: " + gigasConsumidos);
        System.out.println("PrecioXGiga: " + precioXGiga);
    }

}
