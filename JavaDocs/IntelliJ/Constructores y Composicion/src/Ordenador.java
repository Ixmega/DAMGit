public class Ordenador {
    private String marca, modelo;
    private Procesador procesador;

    public Ordenador(String marca, String modelo, int nucleos) {
        this.procesador = new Procesador(nucleos);
        this.marca = marca;
        this.modelo = modelo;
    }

    public Ordenador(String marca, String modelo){
        this(marca, modelo, 4);
    }

    public Ordenador(){
        this("Desconocido", "Desconocido");
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", " + procesador +
                '}';
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Procesador: " + procesador);
    }

}
