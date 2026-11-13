public class TestEstudiante {
    static void main(String[] args) {
        System.out.println("Total actual: " + Estudiante.getTotalEstudiantes());

        Estudiante estudiante1 = new Estudiante("Raul", 18, 0);
        System.out.println("Total actual: " + Estudiante.getTotalEstudiantes());
        Estudiante estudiante2 = new Estudiante("Pedro", 12, 10);
        System.out.println("Total actual: " + Estudiante.getTotalEstudiantes());
        try {
            Estudiante estudiante3 = new Estudiante("Muñon", 19, 10.5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Total actual: " + Estudiante.getTotalEstudiantes());
        Estudiante estudiante4 = new Estudiante("Juanjo", 19, 8);
        System.out.println("Total actual: " + Estudiante.getTotalEstudiantes());
        try {
            Estudiante estudiante5 = new Estudiante("Manue", 10, -1);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Total actual: " + Estudiante.getTotalEstudiantes());

        System.out.println(estudiante1);
        estudiante2.mostrarInformacion();

        try {
            estudiante1.setNombre("");
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
        try {
            estudiante2.setEdad(1);
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }


    }
}
