public class CuentaCorriente extends Cuenta{
    private double sobregiro;

    public CuentaCorriente(String numeroCuenta, String titular, double saldoInicial, double sobregiro) {
        super(numeroCuenta, titular, saldoInicial);
        this.sobregiro = sobregiro;
    }

    public double getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(double sobregiro) {
        this.sobregiro = sobregiro;
    }

    @Override
    public void retirar(double cantidad) {
        double nuevoSaldo = this.saldo - cantidad;
        if (cantidad <= 0 || nuevoSaldo < -sobregiro) {
            throw new IllegalArgumentException("La cantidad retirada no puede ser inferior a 0 ni superior al saldo actual");
        }
        this.saldo = nuevoSaldo;
        System.out.println("Retirado " + cantidad);
        System.out.println("Saldo actual: " + this.saldo);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Sobregiro: " + sobregiro);
    }

}
