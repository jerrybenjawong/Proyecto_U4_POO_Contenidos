package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SerieTVTest {

    @Test
    public void testSerieTVCreacion() {
        SerieTV serie = new SerieTV("Breaking Bad", 2008, "Drama", 5);
        assertEquals("Breaking Bad", serie.getTitulo());
        assertEquals(2008, serie.getAnio());
        assertEquals("Drama", serie.getGenero());
        assertEquals(5, serie.getTemporadas());
    }

    @Test
    public void testSerieTVToCSV() {
        SerieTV serie = new SerieTV("Friends", 1994, "Comedia", 10);
        assertEquals("SerieTV,Friends,1994,Comedia,10", serie.toCSV());
    }
}