/* TODO Package. */

/**
 * TODO.
 *
 * @author CHAUVEAU - GARAYT
 * @version 26-03-2014
 */
public enum SensSerpent {
	GAUCHE(-1,0),
	HAUT(0,-1),
	DROITE(1,0),
	BAS(0,1);

    /** TODO. */
	private int deltaX;
    /** TODO. */
    private int deltaY;

    SensSerpent(int dX, int dY) {
        this.deltaX = dX;
        this.deltaY = dY;
    }

    public int deltaX() {
        return this.deltaX;
    }

    public int deltaY() {
        return this.deltaY;
    }
}
