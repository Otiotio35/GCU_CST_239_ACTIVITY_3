package app;

/**
 * The Gun class represents a specific type of weapon. It implements the WeaponInterface
 * and provides implementations for firing the weapon and activating it.
 * 
 * @version 08/26/2023 ID: 21024608
 * @author toafik
 * @see WeaponInterface
 */
public class Gun implements WeaponInterface {
	 /**
     * Default constructor for the Gun class.
     */
    public Gun() {
        // Intentionally left empty or add relevant initialization logic
    }

    @Override
    public void fireWeapon(int power) {
        System.out.println("In Gun. fireWeapon() with a power of " + power);
    }

    @Override
    public void fireWeapon() {
        System.out.println("In Gun. fireWeapon()");
    }

    @Override
    public void activate(boolean enable) {
        System.out.println("In Gun. activate() with an enable of " + enable);
    }
}

