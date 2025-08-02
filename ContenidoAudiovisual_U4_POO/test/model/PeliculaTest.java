package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PeliculaTest {

    @Test
    public void testPeliculaCreacion() {
        Pelicula p = new Pelicula("Inception", 2010, "Ciencia Ficción", "Nolan");
        assertEquals("Inception", p.getTitulo());
        assertEquals(2010, p.getAnio());
        assertEquals("Ciencia Ficción", p.getGenero());
        assertEquals("Nolan", p.getDirector());
    }

    @Test
    public void testPeliculaToCSV() {
        Pelicula p = new Pelicula("Matrix", 1999, "Acción", "Wachowski");
        assertEquals("Pelicula,Matrix,1999,Acción,Wachowski", p.toCSV());
    }
}