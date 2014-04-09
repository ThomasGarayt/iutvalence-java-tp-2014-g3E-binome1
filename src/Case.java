/* TODO Package. */

/**
 * TODO.
 *
 * @author CHAUVEAU - GARAYT
 * @version 26-03-2014
 */
public enum Case {
    VIDE("  "),
    SERPENT("s "),
    FRUIT("f "),
    MUR("##");

    private final String display;

    Case(String disp) {
        display = disp;
    }

    @Override
    public String toString() {
        return display;
    }
}
