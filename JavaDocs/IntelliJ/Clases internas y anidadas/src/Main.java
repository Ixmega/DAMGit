public class Main {
    static void main(String[] args) {
        Casa miCasa = new Casa("C/Falsa 27");
        Casa.Habitacion miSalon = miCasa.new Habitacion("Salon");
        Casa.Constructora laConstructora = new Casa.Constructora("Obras Sur");

        System.out.println(miCasa);
        System.out.println(miSalon);
        System.out.println(laConstructora);

        /*Habitacion puede acceder a la direccion porque es una clase interna de Casa,
        aunque el atributo sea privado, ya que pertenece a una instancia concreta de Casa.
        Constructora es estatica, por eso no necesita una instancia de Casa para crearse.*/
    }
}
