public class Pelicula {
    private String titulo, director;
    private int duracionMinutos;

    public Pelicula(){}

    public Pelicula(String titulo, String director, int duracionMinutos) {
        this.titulo = titulo;
        this.director = director;
        this.duracionMinutos = duracionMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo == null || titulo.trim().isEmpty()){
            throw new IllegalArgumentException("El titulo no puede estar vacio ni ser nulo");
        }
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        if(director == null || director.trim().isEmpty()){
            throw new IllegalArgumentException("El director no puede estar vacio ni ser nulo");
        }
        this.director = director;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        if(duracionMinutos <= 0){
            throw new IllegalArgumentException("La duracion debe ser mayor a 0 minutos.");
        }
        this.duracionMinutos = duracionMinutos;
    }

    public void mostrarDatos(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", duracionMinutos=" + duracionMinutos +
                '}';
    }


}
