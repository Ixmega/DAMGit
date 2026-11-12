public class TestCuentaBancaria {
    static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria("Pedro Perez", 1230);
        System.out.println(miCuenta);

        try{
            miCuenta.setTitular(" ");
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        try{
            miCuenta.ingresar(-10);
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        try{
            miCuenta.retirar(9999);
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Saldo Actual: " + miCuenta.getSaldo());
        miCuenta.ingresar(1000);
        miCuenta.retirar(920);

    }
}
