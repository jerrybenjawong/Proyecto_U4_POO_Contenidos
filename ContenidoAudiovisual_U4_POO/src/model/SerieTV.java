package model;

public class SerieTV extends ContenidoAudiovisual {
    private int temporadas;

    public SerieTV(String titulo, int anio, String genero, int temporadas) {
        super(titulo, anio, genero);
        this.temporadas = temporadas;
    }

    public int getTemporadas() { return temporadas; }

    @Override
    public String toCSV() {
        return "SerieTV," + titulo + "," + anio + "," + genero + "," + temporadas;
    }
}