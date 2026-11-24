public class Vehiculo {
    protected String marca, modelo;
    protected int anio;




    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Año: " + this.anio);
    }

    public final String descripcionCorta(){
        return marca + "-" + modelo;
    }
}
