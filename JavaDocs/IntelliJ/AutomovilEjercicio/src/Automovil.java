public class Automovil {
    private String marca, modelo;
    private int anyo;

    public static final int ANIO_PRIMER_AUTOMOVIL = 1886;

    public Automovil(String marca, String modelo, int anyo) {
        setMarca(marca);
        setModelo(modelo);
        setAnyo(anyo);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca == null || marca.trim().isEmpty()){
            throw new IllegalArgumentException("La marca no puede estar vacia ni ser nula");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("El modelo no puede estar vacio ni ser nulo");
        }
        this.modelo = modelo;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        if(anyo < ANIO_PRIMER_AUTOMOVIL){
            throw new IllegalArgumentException("En ese año no existian automoviles");
        }
        this.anyo = anyo;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anyo=" + anyo +
                '}';
    }

    public void mostrarInformacion(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anyo);
    }
}
