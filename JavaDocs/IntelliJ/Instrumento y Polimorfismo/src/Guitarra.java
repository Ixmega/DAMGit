public class Guitarra extends Instrumento{
    private String modelo;

    public Guitarra(String instrumento, String modelo) {
        super(instrumento);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void tocar() {
        System.out.println("Suena acorde de la guitarra");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Modelo: " + modelo);
    }

}
