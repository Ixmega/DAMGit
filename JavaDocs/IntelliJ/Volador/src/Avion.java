public class Avion implements Volador{
    private String compania;

    public Avion(String compania) {
        this.compania = compania;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public void volar() {
        System.out.println("Activa motores, arranca, coje velocidad en la pista y despega.");
    }

    @Override
    public void aterrizar() {
        System.out.println("Desciende hasta la pista, aterriza y reduce velocidad hasta detener motores.");
    }
}
