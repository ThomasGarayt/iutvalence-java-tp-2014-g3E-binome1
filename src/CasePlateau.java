/* TODO Package. */

/**
 * TODO.
 *
 * @author CHAUVEAU - GARAYT
 * @version 26-03-2014
 */
public enum CasePlateau {
    VIDE("  "),
    SERPENT("s "),
    FRUIT("f ");

    private final String display;

    CasePlateau(String disp) {
        display = disp;
    }

    @Override
    public String toString() {
        return display;
    }
}
