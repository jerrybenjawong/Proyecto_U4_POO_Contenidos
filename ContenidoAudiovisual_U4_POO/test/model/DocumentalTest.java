package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DocumentalTest {

    @Test
    public void testDocumentalCreacion() {
        Documental doc = new Documental("Planeta Azul", 2018, "Naturaleza", "Océanos");
        assertEquals("Planeta Azul", doc.getTitulo());
        assertEquals(2018, doc.getAnio());
        assertEquals("Naturaleza", doc.getGenero());
        assertEquals("Océanos", doc.getTema());
    }

    @Test
    public void testDocumentalToCSV() {
        Documental doc = new Documental("Vida", 2009, "Ciencia", "Evolución");
        assertEquals("Documental,Vida,2009,Ciencia,Evolución", doc.toCSV());
    }
}