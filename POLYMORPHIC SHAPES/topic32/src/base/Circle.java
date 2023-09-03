package base;
/**
 * Represents a Circle shape.
 */
public class Circle extends ShapeBase {
	 /**
     * Constructs a new Circle with the specified name and diameter.
     *
     * @param name the name of the circle
     * @param diameter the diameter of the circle
     */
    public Circle(String name, int diameter) {
        super(name, diameter, 0);  // height is not relevant for circle, so we set it to 0
    }
    
    @Override
    public int calculateArea() {
        double radius = width / 2.0;
        return (int) (Math.PI * radius * radius);
    }
}
