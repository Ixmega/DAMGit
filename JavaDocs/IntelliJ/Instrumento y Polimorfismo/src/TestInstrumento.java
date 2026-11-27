import java.util.ArrayList;

public class TestInstrumento {
    static void main(String[] args) {
        Instrumento[] bandaMusical = {
                new Guitarra("Guitarra", "Española"),
                new Bateria("Bateria", 5, 2),
                new Instrumento("Flauta")
        };

        for(Instrumento i : bandaMusical){
            i.mostrarInformacion();
            i.tocar();
            /*Cannot resolve method 'golpearPlatillo' in 'Instrumento'
            No candidates found for method call i.golpearPlatillo().
            Porque i es una variable instrumento, e instrumento no tiene ese metodo.
            i.golpearPlatillo();*/
            if(i instanceof Bateria) ((Bateria) i).golpearPlatillo();
            System.out.println();
        }

        ArrayList<Instrumento> listaInsturmentos = new ArrayList<>();
        listaInsturmentos.add(new Guitarra("Guitarra", "Electrica"));
        listaInsturmentos.add(new Bateria("Bateria", 3, 5));
        listaInsturmentos.add(new Instrumento("Triangulo"));
        for(Instrumento i : listaInsturmentos){
            presentar(i);
            System.out.println();
        }

    }

    public static void presentar(Instrumento i) {
        System.out.println("Presentando instrumento: " + i.getNombre());
        i.tocar();
    }
}
