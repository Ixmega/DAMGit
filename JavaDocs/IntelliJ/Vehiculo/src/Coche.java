public class Coche extends Vehiculo{
    private int numeroPuertas;

    public Coche(String marca, String modelo, int anio, int numeroPuertas) {
        super(marca, modelo, anio);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero de Puertas: " + this.numeroPuertas);
    }

    /*@Override
    public final String descripcionCorta(){ }
    'descripcionCorta()' cannot override 'descripcionCorta()' in 'Vehiculo'; overridden method is final
    No se puede sobrescribir descripcionCorta() porque el metodo es final, una constante, en Vehiculo.
    */
}
