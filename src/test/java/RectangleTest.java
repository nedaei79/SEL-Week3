import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void testComputeArea() {
        Rectangle rectangle1 = new Rectangle(3, 4);
        assertEquals("computeArea must compute area right!", 12, rectangle1.computeArea());
    }

}
