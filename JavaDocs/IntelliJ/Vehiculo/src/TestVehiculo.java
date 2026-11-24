public class TestVehiculo {
    static void main(String[] args) {
        Vehiculo unVehiculo = new Vehiculo("Default", "Default", 2000);
        Coche miCoche = new Coche("Citroen", "C5", 2012, 5);
        Moto miMoto = new Moto("Yamaha", "Roja", 2025, 250);

        unVehiculo.mostrarInformacion();
        System.out.println();
        miCoche.mostrarInformacion();
        System.out.println();
        miMoto.mostrarInformacion();
    }
}
