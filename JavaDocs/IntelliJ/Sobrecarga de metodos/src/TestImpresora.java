public class TestImpresora {
    static void main(String[] args) {
        String texto = "Hola mundo!";
        int numero = 6, veces = 7;
        double decimal = 6.9;
        Impresora printer = new Impresora();

        printer.imprimir(numero);
        printer.imprimir(decimal);
        printer.imprimir(texto);
        printer.imprimir(texto, veces);

    }
}
