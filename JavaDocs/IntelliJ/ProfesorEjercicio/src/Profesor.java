public class Profesor {
    private String nombre, departamento;
    private double salario;

    public Profesor(String nombre, String departamento, double salario) {
        setNombre(nombre);
        setDepartamento(departamento);
        setSalario(salario);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("El nombre no puede estar vacio ni ser nulo");
        }
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        if(departamento == null || departamento.trim().isEmpty()){
            throw new IllegalArgumentException("El departamento no puede estar vacio ni ser nulo");
        }
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario < 0){
            throw new IllegalArgumentException("El salario no puede ser negativo");
        }
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                '}';
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario: " + salario);
    }
}
