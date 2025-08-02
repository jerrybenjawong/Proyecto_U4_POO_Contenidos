package model;

public class Pelicula extends ContenidoAudiovisual {
    private String director;

    public Pelicula(String titulo, int anio, String genero, String director) {
        super(titulo, anio, genero);
        this.director = director;
    }

    public String getDirector() { return director; }

    @Override
    public String toCSV() {
        return "Pelicula," + titulo + "," + anio + "," + genero + "," + director;
    }
}