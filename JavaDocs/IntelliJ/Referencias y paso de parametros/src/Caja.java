public class Caja {
    private String contenido;

    public Caja(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void mostrarInformacion() {
        System.out.println("Contenido: " + contenido);
    }
}