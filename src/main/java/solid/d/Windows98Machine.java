package solid.d;

import solid.d.bestWay.StandardKeyboard;

/**
 * By declaring the StandardKeyboard and Monitor with the new keyword,
 * we've tightly coupled these 3 classes together.
 */
public class Windows98Machine {
    private final StandardKeyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine() {
        monitor = new Monitor();
        keyboard = new StandardKeyboard();
    }
}
