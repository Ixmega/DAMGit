import java.util.Objects;

public class Libro {
    private String titulo, autor;
    private int anio;

    public Libro(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anio=" + anio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return anio == libro.anio && Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor);
    }

    /*hashCode() genera un número que ayuda a Java a localizar los objetos.
      Hay que sobrescribir equals() y hashCode() para que HashSet y HashMap
      reconozcan como iguales objetos distintos que tienen los mismos datos.*/
    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, anio);
    }
    // Sin hashCode(), Java puede tratar los libros como elementos diferentes aunque equals() diga que son iguales.
}
