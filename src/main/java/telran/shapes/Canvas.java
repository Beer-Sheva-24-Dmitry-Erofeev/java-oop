package telran.shapes;

import telran.util.Arrays;

public class Canvas implements Shape {

    Shape[] shapes;

    public Canvas() {
        shapes = new Shape[0];
    }

    @Override
    public int perimeter() {
        // The sum of all perimeters of shapes in the Canvas
        int res = 0;
        for (Shape shape : shapes) {
            res += shape.perimeter();
        }
        return res;
    }

    @Override
    public int square() {
        // The sum of all areas ("squares") of shapes in the Canvas
        int res = 0;
        for (Shape shape : shapes) {
            res += shape.square();
        }
        return res;
    }

    public void addShape(Shape shape) {
        // Adding the "shape" object to the array of "shapes"
        // Using our own library, instead of the standart one
        shapes = Arrays.insert(shapes, shapes.length, shape);
    }

    public int count() {
        // We are counting the number of all "shapes" in a given "Canvas" array.
        // "Canvas" class itself is an instance of "Shape"
        int res = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Canvas canvas) { // before quick fix in was: if (shape instanceof Canvas)
                res += canvas.count(); // before quick fix it was: res += ((Canvas)shape).count();
            }
            res++;
        }
        return res;
    }

}
