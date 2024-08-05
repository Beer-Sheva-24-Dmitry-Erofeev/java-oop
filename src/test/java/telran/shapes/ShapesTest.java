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

    @Test
    void countTest() {
        Canvas canvas = new Canvas();
        Rectangle rect1 = new Rectangle(4, 4);   // p 16, a 16
        Rectangle rect2 = new Rectangle(6, 8);   // p 28, a 48
        Rectangle rect3 = new Rectangle(10, 20); // p 60, a 200
        Square sqr1 = new Square(3); // p 12, a 9
        Square sqr2 = new Square(6); // p 24, a 36
        Square sqr3 = new Square(9); // p 36, a 81
        canvas.addShape(rect1);
        canvas.addShape(rect2);
        canvas.addShape(rect3);
        canvas.addShape(sqr1);
        canvas.addShape(sqr2);
        canvas.addShape(sqr3);
        // canvas contains 6 "shapes"
        assertEquals(6, canvas.count());

        Canvas canvas2 = new Canvas();
        canvas2.addShape(rect1);
        canvas2.addShape(rect2);
        canvas2.addShape(rect3);
        canvas2.addShape(sqr1);
        canvas2.addShape(sqr2);
        canvas2.addShape(sqr3);
        canvas2.addShape(canvas);
        // canvas2 contains 6 shapes + canvas (6 shapes)
        // 13 in total, as canvas itself is a shape
        assertEquals(13, canvas2.count());

        Canvas canvas3 = new Canvas();
        canvas3.addShape(canvas);
        canvas3.addShape(canvas2);
        // canvas3 contains canvas (6 + itself) + canvas2 (13 + itself), 21 in total
        assertEquals(21, canvas3.count());
    }
}
