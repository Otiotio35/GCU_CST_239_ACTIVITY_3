package base;

/**
 * A Shapebase class for different shapes.
 */

public class ShapeBase implements ShapeInterface {
    protected int width;
    protected int height;
    protected String name;
    /**
     * Constructs a new ShapeBase with the given name, width, and height.
     *
     * @param name the name of the shape.
     * @param width the width of the shape.
     * @param height the height of the shape.
     */
    public ShapeBase(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }
    
    
    /**
     * Returns the name of the shape.
     * 
     * @return The name of the shape.
     */
    public String getName() {
        return this.name;
    }
    @Override
    public int calculateArea() {
        return -1;
    }
    
 
}
