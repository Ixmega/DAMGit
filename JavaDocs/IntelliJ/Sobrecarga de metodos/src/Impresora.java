public class Impresora {
    public void imprimir(int a){
        System.out.println("Entero: " + a);
    }

    public void imprimir(double a){
        System.out.println("Decimal: " + a);
    }

    public void imprimir(String texto){
        System.out.println("Texto: " + texto);
    }

    public void imprimir(String texto, int veces){
        for(int i=0; i<veces; i++){
            System.out.println("Texto " + i + " : " + texto);
        }
    }

    /* La "firma" de un metodo es nombre(parametros), en este caso imrpimir(int), que ya existe en la clase.
    public String imprimir(int numero){
        return "Numero: " + numero;
    }
    */
}
