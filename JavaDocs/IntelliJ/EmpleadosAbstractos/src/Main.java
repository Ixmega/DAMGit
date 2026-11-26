public class Main {
    static void main(String[] args) {
        Empleado[] plantillaEmpleados= {
                new EmpleadoPorHoras("Pepe", 60, 12),
                new EmpleadoAsalariado("Juanjo", 1870)
        };

        for(Empleado e : plantillaEmpleados){
            e.mostrarInformacion();
            System.out.println("Paga por trabajo: " + e.calcularSalario());
            System.out.println();
        }
    }
}
