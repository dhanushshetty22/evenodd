package evenodd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class evenoddtest {

    evenodd obj = new evenodd();

    @Test
    public void testEvenNumber() {
        assertEquals("Even", obj.checkEvenOdd(10));
    }

    @Test
    public void testOddNumber() {
        assertEquals("Odd", obj.checkEvenOdd(7));
    }

    @Test
    public void testZero() {
        assertEquals("Even", obj.checkEvenOdd(0));
    }

    @Test
    public void testNegativeNumber() {
        assertEquals("Odd", obj.checkEvenOdd(-5));
    }
}