public class TestEmpleado {
    static void main(String[] args) {
        Empleado normie = new Empleado("Juan", "Finanzas", 1321.23);
        Gerente elGerente = new Gerente("Rigoberto", "Finanzas", 1720.27, 100);
        Desarrollador elProgramado = new Desarrollador("Rodrigo", "Informatica", 1889.77, "C#");
        System.out.println("SMI: " + Empleado.getSMI());
        System.out.println();

        try{
            elProgramado.setSalario(800);
        } catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        normie.mostrarInformacion();
        System.out.println();
        elGerente.mostrarInformacion();
        System.out.println("Salario final: " + elGerente.calcularSalarioTotal());
        System.out.println();
        elProgramado.mostrarInformacion();
    }
}
