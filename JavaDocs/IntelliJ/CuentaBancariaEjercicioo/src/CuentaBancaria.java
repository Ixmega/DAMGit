public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;

        if(saldoInicial<=0){
            throw new IllegalArgumentException("El saldo inicial debe ser superior a 0.");
        }
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        if(titular == null || titular.trim().isEmpty()){
            throw new IllegalArgumentException("El titular no puede estar vacio ni ser nulo");
        }
        this.titular = titular;
    }

    public void ingresar(double cantidad){
        if(cantidad <= 0){
            throw new IllegalArgumentException("La cantidad ingresada no puede ser inferior a 0");
        }
        this.saldo += cantidad;
        System.out.println("Ingresado " + cantidad);
        System.out.println("Saldo actual: " + this.saldo);
    }

    public void retirar(double cantidad){
        if(cantidad <= 0 || cantidad > this.saldo){
            throw new IllegalArgumentException("La cantidad retirada no puede ser inferior a 0 ni superior al saldo actual");
        }
        this.saldo -= cantidad;
        System.out.println("Retirado " + cantidad);
        System.out.println("Saldo actual: " + this.saldo);
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}