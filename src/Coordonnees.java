/* TODO Package. */

/**
 * @author CHAUVEAU - GARAYT
 * @version 14-04-2014
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
    
    @Override
    public String toString() {
    	return "["+x+","+y+"]";
    }

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Coordonnees)) {
			return false;
		}
		Coordonnees o = (Coordonnees) obj;
		return x==o.x && y==o.y;
	}
}
