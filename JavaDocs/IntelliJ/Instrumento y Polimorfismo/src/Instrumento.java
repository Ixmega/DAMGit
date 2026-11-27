public class Instrumento {
    protected String nombre;

    public Instrumento(String instrumento) {
        nombre = instrumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String instrumento) {
        nombre = instrumento;
    }

    public void mostrarInformacion() {
        System.out.println("Instrumento: " + nombre);
    }

    public void tocar(){
        System.out.println("Suena el generico.");
    };

}
