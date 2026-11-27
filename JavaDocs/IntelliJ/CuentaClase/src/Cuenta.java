public class Cuenta {
    protected String numeroCuenta, titular;
    protected double saldo;

    public Cuenta(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void ingresar(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad ingresada no puede ser inferior a 0");
        }
        this.saldo += cantidad;
        System.out.println("Ingresado " + cantidad);
        System.out.println("Saldo actual: " + this.saldo);
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0 || cantidad > this.saldo) {
            throw new IllegalArgumentException("La cantidad retirada no puede ser inferior a 0 ni superior al saldo actual");
        }
        this.saldo -= cantidad;
        System.out.println("Retirado " + cantidad);
        System.out.println("Saldo actual: " + this.saldo);
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void mostrarInformacion() {
        System.out.println("NumeroCuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
