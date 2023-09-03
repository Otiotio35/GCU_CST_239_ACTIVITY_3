package base;

/**
 * A test class for the shapes.
 */
public class Test{
	/**
     * Default constructor.
     */
    public Test() {
        // Some code here
    }

    /**
     * The main method to execute the test.
     * @param args The command line arguments.
     */
    private static void displayArea(ShapeBase shape) {
        System.out.println("This is a shape named " + shape.getName() + 
                           " with an area of " + shape.calculateArea());
    }
    /**
     * The entry point for the application.
     *
     * @param args the command line arguments passed to the application.
     */
    public static void main(String[] args) {
        ShapeBase[] shapes = new ShapeBase[4];  // Adjust the size to accommodate the new shapes
        shapes[0] = new Rectangle("Rectangle", 10, 200);
        shapes[1] = new Triangle("Triangle", 10, 50);
        shapes[2] = new Circle("Circle", 10);  // assuming 10 is the diameter
        shapes[3] = new Trapezoid("Trapezoid", 10, 20, 5);  // sides are 10 and 20, height is 5
        
        for(int x = 0; x < shapes.length; x++) {
            displayArea(shapes[x]);
        }
    }
}
