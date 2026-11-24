import java.util.HashSet;
import java.util.HashMap;

public class TestLibro {
    public static void main(String[] args) {
        Libro libroUno = new Libro("El Extranjero", "Albert Camus", 1942);
        Libro libroDos = new Libro("El Extranjero", "Albert Camus", 1942);

        // == comprueba si dos variables apuntan al mismo objeto.
        System.out.println(libroUno == libroDos);
        // equals() comprueba si dos objetos tienen el mismo contenido.
        System.out.println(libroUno.equals(libroDos));

        System.out.println(libroUno.equals(null));
        System.out.println(libroUno.equals("libro1"));
        System.out.println(libroUno.equals(libroUno));

        HashSet<Libro> conjuntoLibros = new HashSet<>();
        conjuntoLibros.add(libroUno);
        conjuntoLibros.add(libroDos);
        System.out.println("Tamaño del conjunto: " + conjuntoLibros.size());

        HashMap<Libro, Integer> inventario = new HashMap<>();
        inventario.put(libroUno, 5);
        System.out.println("Ejemplares disponibles: " + inventario.get(libroDos));


    }
}
