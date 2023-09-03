package base;
/**
 * Represents a trapezoid shape.
 */
public class Trapezoid extends ShapeBase {

	private int trapezoidHeight; // height of the trapezoid
	
	  /**
     * Constructs a Trapezoid with specified name, sides, and height.
     * @param name name of the trapezoid
     * @param sideA length of one side
     * @param sideB length of the other side
     * @param height height of the trapezoid
     */

	public Trapezoid(String name, int sideA, int sideB, int height) {
		super(name, sideA, sideB); // using width for sideA and height for sideB
		this.trapezoidHeight = height;
	}

	@Override
	public int calculateArea() {
		return (int) ((width + height) * trapezoidHeight / 2.0);
	}
}
