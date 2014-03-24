/* TODO Package. */

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
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
