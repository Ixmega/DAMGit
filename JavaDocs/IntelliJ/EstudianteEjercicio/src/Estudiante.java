public class Estudiante {
    private String nombre;
    private int edad;
    private double nota;

    private static int totalEstudiantes = 0;

    public Estudiante(String nombre, int edad, double nota) {
        setEdad(edad);
        setNombre(nombre);
        setNota(nota);
        totalEstudiantes++;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad<3){
            throw new IllegalArgumentException("El estudiante debe tener al menos 3 años");
        }
        this.edad = edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if(nota<0 || nota>10){
            throw new IllegalArgumentException("La nota debe estar entre 0 y 10");
        }
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nota=" + nota +
                '}';
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nota: " + nota);
    }

    public static int getTotalEstudiantes(){
        return totalEstudiantes;
    }

}
