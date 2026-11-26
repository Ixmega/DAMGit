public class EmpleadoPorHoras extends Empleado {
    private double salarioHoras, horasTrabajadas;

    public EmpleadoPorHoras(String nombre, double salarioHoras, double horasTrabajadas) {
        super(nombre);
        this.salarioHoras = salarioHoras;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSalarioHoras() {
        return salarioHoras;
    }

    public void setSalarioHoras(double salarioHoras) {
        this.salarioHoras = salarioHoras;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return salarioHoras * horasTrabajadas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("SalarioHoras: " + salarioHoras);
        System.out.println("HorasTrabajadas: " + horasTrabajadas);
    }

}
