import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void testComputeArea() {
        Square square = new Square(5);
        assertEquals("computeArea must compute area right!", 25, square.computeArea());
    }

    @Test
    public void testGetLength() {
        Square square = new Square(5);
        assertEquals("getLength must give the actual length!", 5, square.getLength());
    }

    @Test
    public void testSetLength() {
        Square square = new Square(5);
        square.setLength(9);
        assertEquals("setLength must set the actual length!", 9, square.getLength());
    }

}
