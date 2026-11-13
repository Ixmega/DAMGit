public class TestProfesor {
    static void main(String[] args) {
        Profesor teacher = new Profesor("Rodrigo", "Informatica", 1923.23);
        teacher.mostrarInformacion();

        teacher.setSalario(0);
        System.out.println(teacher);
        try{
            teacher.setSalario(-1000);
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
