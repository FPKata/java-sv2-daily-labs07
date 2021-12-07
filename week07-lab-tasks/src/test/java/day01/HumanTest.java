package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    Human human;
    @Test
    void testIsNameValid(){
        Human human = new Human("Kis Éva", 1999);
        boolean result = human.isNameValid(human.getName());
        assertTrue(result);
    }

    @Test
    void testIsNameValidWithNull(){
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new Human(null, 1999));
        assertEquals("Invalid name", iae.getMessage());
    }

    @Test
    void testIsNameValidWithWrongName(){
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new Human("KisÉva", 1999));
        assertEquals("Invalid name", iae.getMessage());
    }
}