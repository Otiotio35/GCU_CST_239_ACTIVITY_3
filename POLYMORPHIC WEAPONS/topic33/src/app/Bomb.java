package app;


/**
 * The Bomb class represents a specific type of weapon. It implements the WeaponInterface
 * and provides implementations for firing the weapon and activating it.
 * 
 * @version 09/03/2023 ID: 21024608
 * @author toafik
 * @see WeaponInterface
 */
public class Bomb implements WeaponInterface {

    /**
     * Default constructor for the Bomb class.
     */
    public Bomb() {
        // Intentionally left empty.
    }

    /**
     * Fires the bomb with the given power. This method prints out the class name, 
     * method name, and the specified power.
     * 
     * @param power the intensity or magnitude with which the bomb is triggered
     */
    @Override
    public void fireWeapon(int power) {
        System.out.println("In Bomb. fireWeapon() with a power of " + power);
    }

    /**
     * Fires the bomb with a default power value. This method prints out the class name 
     * and method name.
     */
    @Override
    public void fireWeapon() {
        System.out.println("In Bomb. fireWeapon()");
    }

    /**
     * Activates or deactivates the bomb. This method prints out the class name, 
     * method name, and the activation status.
     * 
     * @param enable a boolean indicating whether to activate (true) or deactivate (false) the bomb
     */
    @Override
    public void activate(boolean enable) {
        System.out.println("In Bomb. activate() with an enable of " + enable);
    }
}

