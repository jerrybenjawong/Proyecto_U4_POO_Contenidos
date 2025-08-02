package model;

public abstract class ContenidoAudiovisual {
    protected String titulo;
    protected int anio;
    protected String genero;

    public ContenidoAudiovisual(String titulo, int anio, String genero) {
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
    }

    public String getTitulo() { return titulo; }
    public int getAnio() { return anio; }
    public String getGenero() { return genero; }

    public abstract String toCSV();
}