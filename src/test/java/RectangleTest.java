import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void testComputeArea() {
        Rectangle rectangle1 = new Rectangle(3, 4);
        assertEquals("computeArea must compute area right!", 12, rectangle1.computeArea());
    }

    @Test
    public void testGetHeight() {
        Rectangle rectangle = new Rectangle(3, 4);
        assertEquals("getHeight must give the actual height!", 3, rectangle.getHeight());
    }

    @Test
    public void testGetWidth() {
        Rectangle rectangle = new Rectangle(3, 4);
        assertEquals("getWidth must give the actual width!", 4, rectangle.getHeight());
    }

    @Test
    public void testSetHeight() {
        Rectangle rectangle = new Rectangle(3, 4);
        rectangle.setHeight(5);
        assertEquals("setHeight must set the height as expected!", 5, rectangle.getHeight());
    }

    @Test
    public void testSetWidth() {
        Rectangle rectangle = new Rectangle(3, 4);
        rectangle.setWidth(6);
        assertEquals("setWidth must set the width as expected!", 6, rectangle.getHeight());
    }

}
