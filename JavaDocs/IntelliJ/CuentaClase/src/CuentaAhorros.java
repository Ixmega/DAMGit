public class CuentaAhorros extends Cuenta{
    private double interes;

    public CuentaAhorros(String numeroCuenta, String titular, double saldoInicial, double interes) {
        super(numeroCuenta, titular, saldoInicial);
        this.interes = interes;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void aplicarInteres(){
        saldo += saldo * (interes / 100);
        System.out.println("INTERESES APLICADOS");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Interes: " + interes);
    }

}
