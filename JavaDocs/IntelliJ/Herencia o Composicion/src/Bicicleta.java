public class Bicicleta {
    private String marca;
    private Rueda ruedaDelantera, ruedaTrasera;

    public Bicicleta(String marca, double diametroDelantero, double diametroTrasero) {
        this.marca = marca;
        this.ruedaDelantera = new Rueda(diametroDelantero);
        this.ruedaTrasera = new Rueda(diametroTrasero);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Rueda getRuedaDelantera() {
        return ruedaDelantera;
    }

    public void setRuedaDelantera(Rueda ruedaDelantera) {
        if (ruedaDelantera == null) throw new IllegalArgumentException("La rueda no puede ser null");
        this.ruedaDelantera = ruedaDelantera;
    }

    public Rueda getRuedaTrasera() {
        return ruedaTrasera;
    }

    public void setRuedaTrasera(Rueda ruedaTrasera) {
        if (ruedaDelantera == null) throw new IllegalArgumentException("La rueda no puede ser null");
        this.ruedaTrasera = ruedaTrasera;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "Marca='" + marca + '\'' +
                ", Rueda Delantera: " + ruedaDelantera +
                ", Rueda Trasera: " + ruedaTrasera +
                '}';
    }
}
