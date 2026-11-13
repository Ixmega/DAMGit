public class TestAutomovil {
    static void main(String[] args) {
        Automovil miCoche = new Automovil("Citroen", "C4", 1992);
        System.out.println(miCoche);
        miCoche.mostrarInformacion();
        System.out.println();

        try {
            miCoche.setModelo("");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            miCoche.setAnyo(1200);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        System.out.println(Automovil.ANIO_PRIMER_AUTOMOVIL);
        System.out.println();

        try{
            Automovil cocheErroneo = new Automovil(null, "", 1200);
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("No se ha creado el objeto.");
        }
        try{
            Automovil cocheErroneo = new Automovil("Volkswagen", "", 1200);
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("No se ha creado el objeto.");
        }
        try{
            Automovil cocheErroneo = new Automovil("Volkswagen", "Golf", 1200);
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("No se ha creado el objeto.");
        }

    }
}
