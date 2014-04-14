/* TODO Package. */

/**
 * @author CHAUVEAU - GARAYT
 * @version 14-04-2014
 */

public enum SensSerpent {
	GAUCHE(-1,0),
	HAUT(0,-1),
	DROITE(1,0),
	BAS(0,1);

    /** Différence en abscisse entre la position actuelle et la future selon le sens du Serpent */
	private int deltaX;

    /** Différence en ordonnee entre la position actuelle et la future selon le sens du Serpent */
    private int deltaY;

    
    SensSerpent(int dX, int dY) {
        this.deltaX = dX;
        this.deltaY = dY;
    }

    /** Permet d"obtenir le DeltaX d'un sens
     * @return DeltaX */
    public int deltaX() {
        return this.deltaX;
    }

    
    /** Permet d"obtenir le DeltaY d'un sens
     * @return DeltaX */
    public int deltaY() {
        return this.deltaY;
    }
}
