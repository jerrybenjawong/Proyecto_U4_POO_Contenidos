package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ActorTest {

    @Test
    public void testActorCreacion() {
        Actor actor = new Actor("Robert Downey Jr.", 58);
        assertEquals("Robert Downey Jr.", actor.getNombre());
        assertEquals(58, actor.getEdad());
    }

    @Test
    public void testActorToCSV() {
        Actor actor = new Actor("Emma Watson", 33);
        assertEquals("Actor,Emma Watson,33", actor.toCSV());
    }
}