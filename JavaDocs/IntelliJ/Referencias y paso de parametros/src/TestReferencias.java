
public class TestReferencias {

    static void main(String[] args) {
        Caja miCaja = new Caja("inicial");
        int numero = 5;

        // Al pasar una Caja se copia su referencia, por lo que modificamos el mismo objeto.
        System.out.println("Contenido original: " + miCaja.getContenido());
        modificar(miCaja);
        System.out.println("Contenido modificado: " + miCaja.getContenido());
        // Reasignar la referencia local no afecta a la variable original.
        reasignar(miCaja);
        System.out.println("Contenido reasignado: " + miCaja.getContenido());
        // Los tipos primitivos como int pasan una copia de su valor, por lo que el original no cambia.
        System.out.println("Numero inicial: " + numero);
        incrementar(numero);
        System.out.println("Numero incrementado: " + numero);

        // Ambas variables  tienen la misma referencia que apunta al mismo objeto, por lo que los cambios se reflejan en las dos.
        System.out.println();
        Caja a = new Caja("videogames");
        Caja b = a;
        System.out.println("Contenido a inicial: " + a.getContenido());
        b.setContenido("cacahuete");
        System.out.println("Contenido a: " + a.getContenido());
        a.setContenido("berenjena");
        System.out.println("Contenido b: " + b.getContenido());

        // Al intentar acceder a un metodo mediante una referencia null se produce NullPointerException.
        System.out.println();
        Caja c = null;
        try {
            System.out.println(c.getContenido());
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void modificar(Caja c){
        c.setContenido("modificao");
    }

    public static void reasignar(Caja c){
        c = new Caja("nueva");
    }

    public static void incrementar(int n){
        n += 10;
    }

}