package app;

/**
 * Represents the behaviors expected of a Person.
 */
public interface PersonInterface {

    /**
     * Describes the walking behavior of a person.
     */
    public void walk();

    /**
     * Describes the running behavior of a person.
     */
    public void run();

    /**
     * Checks if a person is currently running.
     *
     * @return true if the person is running, false otherwise.
     */
    public boolean isRunning();

}
