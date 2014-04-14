/* TODO Package. */

/**
 * @author CHAUVEAU - GARAYT
 * @version 14-04-2014
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
