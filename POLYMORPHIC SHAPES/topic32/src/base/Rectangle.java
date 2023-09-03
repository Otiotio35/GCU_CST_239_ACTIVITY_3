package base;
/**
 * A base class for different shapes.
 */
public class Rectangle extends ShapeBase {
    /**
     * Constructs a new Rectangle with the given name, width, and height.
     *
     * @param name the name of the rectangle.
     * @param width the width of the rectangle.
     * @param height the height of the rectangle.
     */

	public Rectangle(String name, int width, int height) {
		super(name, width, height);
	}

	@Override
	public int calculateArea() {
		return width * height;
	}
}
