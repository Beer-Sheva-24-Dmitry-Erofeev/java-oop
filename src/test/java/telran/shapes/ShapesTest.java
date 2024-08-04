package telran.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ShapesTest {

    @Test
    void RectangleTest() {
        Rectangle rectangle = new Rectangle(10, 20);
        assertEquals(60, rectangle.perimeter());
        assertEquals(200, rectangle.square());
    }

    @Test
    void SquareTest() {
        Square square = new Square(69);
        assertEquals(276, square.perimeter());
        assertEquals(4761, square.square());
    }

    @Test
    void CanvasTest() {

        Canvas canvas = new Canvas();
        Rectangle rect1 = new Rectangle(4, 4);   // p 16, a 16
        Rectangle rect2 = new Rectangle(6, 8);   // p 28, a 48
        Rectangle rect3 = new Rectangle(10, 20); // p 60, a 200
        canvas.addShape(rect1);
        canvas.addShape(rect2);
        canvas.addShape(rect3);
        Square sqr1 = new Square(3); // p 12, a 9
        Square sqr2 = new Square(6); // p 24, a 36
        Square sqr3 = new Square(9); // p 36, a 81
        canvas.addShape(sqr1);
        canvas.addShape(sqr2);
        canvas.addShape(sqr3);

        assertEquals(176, canvas.perimeter());
        assertEquals(390, canvas.square());
    }
}
