public interface Volador {
    int ALTURA_MAXIMA_METROS = 12000;
    void volar();
    default void aterrizar(){
        System.out.println("Aterriza en el suelo levemente.");
    }
    default void despegar(){
        anunciar("Comienza el despegue.");
    }
    private void anunciar(String mensaje){
        System.out.println(mensaje);
    }
    public static String descripcion(){
        return "Un volador es aquel que puede viajar por el aire, sin contacto con el suelo.";
    }
}
