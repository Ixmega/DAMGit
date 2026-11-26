public class EmpleadoAsalariado extends Empleado{
    private double salarioBase;

    public EmpleadoAsalariado(String nombre, double salarioBase) {
        super(nombre);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("SalarioBase: " + salarioBase);
    }

}
