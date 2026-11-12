import java.util.Scanner;

public class TestPelicula {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Podemos usar los dos constructores infiferentemente, uno no sobreescribe al otro
          Ambas opciones, mostrarDatos y print son iguales, al utilizar toString con override
          los set y get funcionan*/
        Pelicula logan = new Pelicula("Logan", "James Mangold", 135);
        logan.mostrarDatos();
        System.out.println();

        Pelicula origen = new Pelicula();
        origen.setTitulo("Origen");
        origen.setDirector("Chritopher Nolan");
        origen.setDuracionMinutos(169);
        System.out.println("Titulo: " + origen.getTitulo());
        System.out.println(origen);

        // Vamos a probar el control de errores
        Pelicula errores = new Pelicula();

        try {
            errores.setTitulo(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            errores.setDirector(" ");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            errores.setDuracionMinutos(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(errores);

    }
}
