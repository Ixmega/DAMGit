public class Bateria extends Instrumento{
    private int numeroTambores, numeroPlatillos;

    public Bateria(String instrumento, int numeroTambores, int numeroPlatillos) {
        super(instrumento);
        this.numeroTambores = numeroTambores;
        this.numeroPlatillos = numeroPlatillos;
    }

    public int getNumeroTambores() {
        return numeroTambores;
    }

    public void setNumeroTambores(int numeroTambores) {
        this.numeroTambores = numeroTambores;
    }

    public int getNumeroPlatillos() {
        return numeroPlatillos;
    }

    public void setNumeroPlatillos(int numeroPlatillos) {
        this.numeroPlatillos = numeroPlatillos;
    }

    @Override
    public void tocar() {
        System.out.println("Suena la batería bum bum");
    }

    public void golpearPlatillo(){
        System.out.println("Suena la batería chas chas");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("NumeroTambores: " + numeroTambores);
        System.out.println("NumeroPlatillos: " + numeroPlatillos);
    }

}
