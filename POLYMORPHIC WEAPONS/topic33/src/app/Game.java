package app;

/**
 * Represents the main game class responsible for initializing and managing the game's flow.
 *
 * @version 09/03/2023 ID: 21024608
 * @author taofik otiotio
 */
public class Game {
    /**
     * Default constructor for the Game class.
     */
    public Game() {

    }

    private static void fireWeapon(WeaponInterface weapon) {
        if (weapon instanceof Bomb) {
            System.out.println("------------------- I am a Bomb");
        }
        weapon.activate(true);
        weapon.fireWeapon(5);
    }

    /**
     * The main entry point for the Game application.
     *
     * @param args Command-line arguments passed to the application.
     */
    public static void main(String[] args) {
        WeaponInterface[] weapons = new WeaponInterface[2];
        weapons[0] = new Bomb();
        weapons[1] = new Gun();

        for (int i = 0; i < weapons.length; i++) {
            fireWeapon(weapons[i]);
        }
    }
}
