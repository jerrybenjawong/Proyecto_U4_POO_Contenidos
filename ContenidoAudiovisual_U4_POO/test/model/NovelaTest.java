package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NovelaTest {

    @Test
    public void testNovelaCreacion() {
        Novela novela = new Novela("Cien Años de Soledad", 1967, "Realismo Mágico", "García Márquez");
        assertEquals("Cien Años de Soledad", novela.getTitulo());
        assertEquals(1967, novela.getAnio());
        assertEquals("Realismo Mágico", novela.getGenero());
        assertEquals("García Márquez", novela.getAutor());
    }

    @Test
    public void testNovelaToCSV() {
        Novela novela = new Novela("El Quijote", 1605, "Aventura", "Cervantes");
        assertEquals("Novela,El Quijote,1605,Aventura,Cervantes", novela.toCSV());
    }
}