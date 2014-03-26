/* TODO Package. */

/**
 * TODO.
 *
 * @author CHAUVEAU - GARAYT
 * @version 26-03-2014
 */
public class Coordonnees {
    /** L'abscisse d'une coordonnée */
    public final int x;
    /** L'ordonnée d'une coordonnée */
    public final int y;

    /** Créer un couple de coordonnées de la forme (x,y). */
    public Coordonnees(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
