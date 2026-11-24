public class Main {
    static void main(String[] args) {
        /*Monitor malMonitor = new Monitor();
          java: constructor Monitor in class Monitor cannot be applied to given types;
          required: int
          found:    no arguments
          reason: actual and formal argument lists differ in length
        */

        Ordenador miPC = new Ordenador("Lenovo", "Primium", 12);
        Ordenador tuPC = new Ordenador("HP", "deClase");
        Ordenador nosePC = new Ordenador();

        System.out.println(miPC);
        System.out.println(tuPC);
        System.out.println(nosePC);
    }
}
