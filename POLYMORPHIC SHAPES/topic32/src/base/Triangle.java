package base;

/**
 * Represents a triangle shape.
 */
public class Triangle extends ShapeBase {
    /**
     * Constructs a Triangle with a specified name, width, and height.
     * @param name name of the triangle
     * @param width width of the triangle
     * @param height height of the triangle
     */
    public Triangle(String name, int width, int height) {
        super(name, width, height);
    }
    
    @Override
    public int calculateArea() {
        return (width * height) / 2;
    }
}

