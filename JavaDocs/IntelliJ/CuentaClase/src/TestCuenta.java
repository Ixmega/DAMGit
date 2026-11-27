public class TestCuenta {
    static void main(String[] args) {
        CuentaAhorros miCuentaAhorro = new CuentaAhorros("167546378E", "Pedrito", 1000, 3);
        CuentaCorriente miCuentaBanca = new CuentaCorriente("756398675Z", "Ixmega", 1000, 500);
        Cuenta unaCuenta = new Cuenta("764968763D", "Mutaciones", 100);

        miCuentaAhorro.mostrarInformacion();
        miCuentaAhorro.aplicarInteres();
        miCuentaAhorro.mostrarInformacion();
        System.out.println();
        miCuentaBanca.mostrarInformacion();
        miCuentaBanca.retirar(1200);
        System.out.println();
        unaCuenta.mostrarInformacion();
        try{
            unaCuenta.retirar(150);
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
