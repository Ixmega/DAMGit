public class Rueda {
    private double diametro;

    public Rueda(double diametro) {
        setDiametro(diametro);
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        if(diametro<1) throw new IllegalArgumentException("EL diametro de la rueda debe ser mayor a 0.");
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Rueda{" +
                "diametro=" + diametro +
                '}';
    }
}
