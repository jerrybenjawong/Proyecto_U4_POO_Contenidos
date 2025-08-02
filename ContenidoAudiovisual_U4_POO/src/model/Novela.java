package model;

public class Novela extends ContenidoAudiovisual {
    private String autor;

    public Novela(String titulo, int anio, String genero, String autor) {
        super(titulo, anio, genero);
        this.autor = autor;
    }

    public String getAutor() { return autor; }

    @Override
    public String toCSV() {
        return "Novela," + titulo + "," + anio + "," + genero + "," + autor;
    }
}