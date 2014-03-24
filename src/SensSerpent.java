/* TODO Package. */

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public enum SensSerpent {
	GAUCHE(-1,0),
	HAUT(0,1),
	DROITE(1,0),
	BAS(0,-1);

    /** TODO. */
    private final int deltaX;
    /** TODO. */
    private final int deltaY;

    SensSerpent(int dX, int dY) {
        this.deltaX = dX;
        this.deltaY = dY;
    }

    // Gérer les DeltaX et DeltaY
    public int getDeltaX() {
        return 0 /* TODO */;
    }

}
