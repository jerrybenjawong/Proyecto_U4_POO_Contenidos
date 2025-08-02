package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InvestigadorTest {

    @Test
    public void testInvestigadorCreacion() {
        Investigador inv = new Investigador("Jane Goodall", "Primatología");
        assertEquals("Jane Goodall", inv.getNombre());
        assertEquals("Primatología", inv.getCampo());
    }

    @Test
    public void testInvestigadorToCSV() {
        Investigador inv = new Investigador("Carl Sagan", "Astronomía");
        assertEquals("Investigador,Carl Sagan,Astronomía", inv.toCSV());
    }
}