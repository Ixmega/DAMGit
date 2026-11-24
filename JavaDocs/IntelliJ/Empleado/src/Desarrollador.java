public class Desarrollador extends Empleado{
    private String lenguajeProgramacion;

    public Desarrollador(String nombre, String departamento, double salario, String lenguajeProgramacion) {
        super(nombre, departamento, salario);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Lenguaje de Programacion: " + lenguajeProgramacion);
    }

}
