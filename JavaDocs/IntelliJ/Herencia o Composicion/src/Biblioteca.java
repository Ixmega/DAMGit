public class Biblioteca {
    private String nombre;
    private Libro[] inventarioLibros = new Libro[5];

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Libro[] getInventarioLibros() {
        return inventarioLibros;
    }

    public void setInventarioLibros(Libro[] inventarioLibros) {
        this.inventarioLibros = inventarioLibros;
    }

    public boolean agregarLibro(Libro l){
        for (int i = 0; i < inventarioLibros.length; i++) {
            if (inventarioLibros[i] == null) {
                inventarioLibros[i] = l;
                return true;
            }
        }
        return false;
    }

    public boolean agregarLibro(String titulo, String autor){
        Libro l = new Libro(titulo, autor);
        return agregarLibro(l);
    }

    public boolean retirarLibro(Libro l){
        for (int i = 0; i < inventarioLibros.length; i++) {
            if (inventarioLibros[i] != null && inventarioLibros[i].equals(l)) {
                inventarioLibros[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean retirarLibro(String titulo, String autor){
        Libro l = new Libro(titulo, autor);
        return retirarLibro(l);
    }

    public void mostrarLibros(){
        System.out.println("Inventario de la Biblioteca " + nombre);
        boolean found = false;
        for(Libro l : inventarioLibros){
            if(l != null) {
                System.out.println(l);
                found = true;
            }
        }
        if(!found) System.out.println("Biblioteca vacía.");
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

}
