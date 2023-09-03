package app;

/**
 * Represents an interface for a weapon with common functionalities.
 *
 * @version 08/26/2023 ID: 21024608
 * @author toafik otiotio
 */
public interface WeaponInterface {

	/**
	 * Fires the weapon with default power.
	 */
	void fireWeapon();

	/**
	 * Fires the weapon with the specified power.
	 *
	 * @param power The power with which the weapon is to be fired.
	 */
	void fireWeapon(int power);

	/**
	 * Activates or deactivates the weapon.
	 *
	 * @param enable If true, the weapon will be activated; if false, it will be
	 *               deactivated.
	 */
	void activate(boolean enable);
}
