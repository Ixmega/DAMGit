public abstract class Suscripcion {
    private String nombreUsuario;

    public Suscripcion(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public abstract double calcularCuotaMensual();

    public void mostrarInformacion() {
        System.out.println("NombreUsuario: " + nombreUsuario);
    }

}
