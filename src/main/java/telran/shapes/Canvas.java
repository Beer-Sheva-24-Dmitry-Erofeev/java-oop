package telran.shapes;

import telran.util.Arrays;

public class Canvas implements Shape {

    public Canvas() {
        shapes = new Shape[0];
    }

    Shape[] shapes;

    public void addShape(Shape shape) {
        // Adding the "shape" object to the array of "shapes"
        // Using our own library, instead of the standart one
        shapes = Arrays.insert(shapes, shapes.length, shape);
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

}
