public class Casa {
    private String direccion;

    public Casa(String direccion) {
        this.direccion = direccion;
    }

    public class Habitacion{
        private String nombre;

        public Habitacion(String nombre) {
            this.nombre = nombre;
        }

        public void imprimir(){
            System.out.println(nombre + " de " + direccion);
        }

        @Override
        public String toString() {
            return "Habitacion{" +
                    "nombre='" + nombre + "\' " +
                    "direccion='" + direccion + '\'' +
                    '}';
        }
    }

    public static class Constructora{
        private String nombre;

        public Constructora(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public String toString() {
            return "Constructora{" +
                    "nombre='" + nombre + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                '}';
    }
}
