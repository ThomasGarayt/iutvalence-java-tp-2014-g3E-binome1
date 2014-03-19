/* TODO Javadoc. */
/* TODO Package. */
public enum SensSerpent {
	GAUCHE(-1,0,"DROITE"),
	HAUT(0,-1,"BAS"),
	DROITE(1,0,"GAUCHE"),
	BAS(0,1,"HAUT");
	
	private int DeltaX;
	private int DeltaY;
	private String SensInverse;
	
	/* Constructeur */
	private SensSerpent(int DeltaX, int DeltaY, String SensInverse)
	{
		this.DeltaX = DeltaX;
		this.DeltaY = DeltaY;
		this.SensInverse  = SensInverse;
	}
	
	/* Permet d'obtenir le Delta en X des differents sens */
    public int getDeltaX() {
        return this.DeltaX;
    }
    
    /* Permet d'obtenir le Delta en Y des differents sens */
    public int getDeltaY() {
        return this.DeltaY;
    }
    
    /* Permet d'obtenir le sens inverse */
    public String getSensInverse() {
        return this.SensInverse;
    }
    

}
