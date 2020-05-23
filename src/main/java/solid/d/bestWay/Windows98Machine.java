package solid.d.bestWay;

import solid.d.Monitor;

/**
 * Here, we're using the dependency injection pattern here to facilitate adding the
 * Keyboard dependency into the Windows98Machine class.
 */
public class Windows98Machine {
    private final Keyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}
