public class Ave implements Volador{
    private String raza;

    public Ave(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void volar() {
        System.out.println("Abate las alas y empieza a volar.");
    }
}
