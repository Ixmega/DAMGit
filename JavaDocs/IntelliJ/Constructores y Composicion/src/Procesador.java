public class Procesador {
    private int nucleos;

    public Procesador(int nucleos) {
        setNucleos(nucleos);
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        if(nucleos < 1) throw new IllegalArgumentException("Un procesador debe tener nucleos.");
        this.nucleos = nucleos;
    }

    @Override
    public String toString() {
        return "Procesador{" +
                "nucleos=" + nucleos +
                '}';
    }
}
