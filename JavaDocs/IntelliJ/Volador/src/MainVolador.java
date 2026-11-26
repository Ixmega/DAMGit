public class MainVolador {
    static void main(String[] args) {
        Volador[] voladores = {
                new Ave("Pelicano"),
                new Avion("Rayanair")
        };

        for(Volador v : voladores){
            v.despegar();
            v.volar();
            v.aterrizar();
            System.out.println();
        }

        System.out.println(Volador.descripcion());
        System.out.println("Altura máxima: " + Volador.ALTURA_MAXIMA_METROS + " metros.");
    }
}
