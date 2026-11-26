public class Main {
    static void main(String[] args) {
        //java: Suscripcion is abstract; cannot be instantiated
        //Suscripcion suscrisio = new Suscripcion("Pepe");

        Suscripcion[] pagosAServicios = {
                new SuscripcionFija("Mutaciones", 12),
                new SuscripcionPorUso("Yoxmega", 32, 1.6)
        };

        double sumaCuotas = 0;
        for(Suscripcion s : pagosAServicios){
            s.mostrarInformacion();
            double cuota = s.calcularCuotaMensual();
            System.out.println("Cuota: " + cuota);
            System.out.println();
            sumaCuotas += cuota;
        }
        System.out.println("SumaCuotas: " + sumaCuotas);
    }
}
