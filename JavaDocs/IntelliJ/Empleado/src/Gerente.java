public class Gerente extends Empleado{
    private double bono;

    public Gerente(String nombre, String departamento, double salario, double bono) {
        super(nombre, departamento, salario);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public double calcularSalarioTotal(){
        return bono + getSalario();
        //Si fuese protected: return bono + salario;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Bono: " + bono);
    }

}
