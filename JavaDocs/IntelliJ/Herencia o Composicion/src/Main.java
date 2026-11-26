public class Main {
    static void main(String[] args) {
        System.out.println("///BICICLETA///");
        Bicicleta miBici = new Bicicleta("BMW", 10, 3);
        System.out.println(miBici);

        try{
            Bicicleta biciMalaRueda = new Bicicleta("Arbol", 0, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try{
            miBici.setRuedaDelantera(null);
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Se ha pinchao la rueda trasera, tenemos que cambiarla.");
        Rueda nuevaRueda = new Rueda(10);
        miBici.setRuedaTrasera(nuevaRueda);
        System.out.println(miBici);

        System.out.println();
        System.out.println("///BIBLIOTECA///");
        Biblioteca miBiblio = new Biblioteca("Jericho");
        System.out.println(miBiblio);
        miBiblio.mostrarLibros();
        Libro elExtranjero = new Libro("El Extranjero", "Albert Camus");
        miBiblio.agregarLibro(elExtranjero);
        miBiblio.agregarLibro("La llamada de Cthulu", "Lovecraft");
        miBiblio.mostrarLibros();
        System.out.println();

        //Al libro que creamos en el Main podemos acceder también directamente, como si lo tuviesemos en mano.
        //Al libro que creamos desde la Biblioteca no, como si estuviese en su estante.
        System.out.println("Directo: " + elExtranjero.getTitulo());
        for (Libro libro : miBiblio.getInventarioLibros()) {
            if (libro != null) {
                System.out.println(libro.getTitulo());
            }
        }
        System.out.println();

        String mensajeLleno = "La biblioteca " + miBiblio.getNombre() + " está llena.";

        if(!miBiblio.agregarLibro("1984", "George Orwell")) System.out.println(mensajeLleno);
        else System.out.println("Libro 1984 añadido correctamente");

        if(!miBiblio.agregarLibro("Rebelión en la granja", "George Orwell")) System.out.println(mensajeLleno);
        else System.out.println("Libro Rebelión en la granja añadido correctamente");

        if(!miBiblio.agregarLibro("Dune", "Frank Herbert")) System.out.println(mensajeLleno);
        else System.out.println("Libro Dune añadido correctamente");

        if(!miBiblio.agregarLibro("Fahrenheit 451", "Ray Bradbury")) System.out.println(mensajeLleno);
        else System.out.println("Libro Fahrenheit 451 añadido correctamente");

        System.out.println();
        miBiblio.mostrarLibros();
        System.out.println();

        System.out.println("Vamos a eliminar un libro de la biblioteca."); //Tenemos dos formas:
        // Utilizando un libro del array de libros:
        Libro[] librosActualesBiblioteca = miBiblio.getInventarioLibros();
        if (!miBiblio.retirarLibro(librosActualesBiblioteca[2])) System.out.println("No se ha encontrado el libro.");
        else System.out.println("Libro retirado correctamente.");
        miBiblio.mostrarLibros();
        System.out.println();
        // Utilizando el nombre y el autor:
        if (!miBiblio.retirarLibro("Fahrenheit 451", "Ray Bradbury")) System.out.println("No se ha encontrado el libro.");
        else System.out.println("Libro retirado correctamente.");
        miBiblio.mostrarLibros();
        //Y fallos
        if (!miBiblio.retirarLibro("El Quijote", "Miguel de Cervantes")) System.out.println("No se ha encontrado el libro.");
        else System.out.println("Libro retirado correctamente.");
        if (!miBiblio.retirarLibro("Los juegos del hambre", "Suzanne Collins")) System.out.println("No se ha encontrado el libro.");
        else System.out.println("Libro retirado correctamente.");

    }
}
