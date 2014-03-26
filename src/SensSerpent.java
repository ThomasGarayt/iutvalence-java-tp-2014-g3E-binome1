/* TODO Package. */

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public enum SensSerpent {
	GAUCHE(-1,0),
	HAUT(0,-1),
	DROITE(1,0),
	BAS(0,1);
	
	private int DeltaX;
	private int DeltaY;

	/* Constructeur */
	private SensSerpent(int DeltaX, int DeltaY)
	{
		this.DeltaX = DeltaX;
		this.DeltaY = DeltaY;
	}
	

    // Gérer les DeltaX et DeltaY
    public int getDeltaX() {
        return this.DeltaX;
    }
    
    /* Permet d'obtenir le Delta en Y des differents sens */
    public int getDeltaY() {
        return this.DeltaY;
    }
}
