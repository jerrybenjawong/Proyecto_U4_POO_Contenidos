package model;

public class Documental extends ContenidoAudiovisual {
    private String tema;

    public Documental(String titulo, int anio, String genero, String tema) {
        super(titulo, anio, genero);
        this.tema = tema;
    }

    public String getTema() { return tema; }

    @Override
    public String toCSV() {
        return "Documental," + titulo + "," + anio + "," + genero + "," + tema;
    }
}