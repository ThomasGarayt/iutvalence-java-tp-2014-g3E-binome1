public class Plateau {
    /* TODO Pourquoi static ? */
	private final int yPlateau;
    /* TODO Pourquoi static ? */
	private final int xPlateau;
    /* TODO Pourquoi static ? */
	private CasePlateau plateau[][];
	
	public int getXplateau() {
		return xPlateau;
	}


	public int getYplateau() {
		return yPlateau;
	}

	/* Cr�ation et initialisation � vide du plateau
	 */
	public Plateau(int x, int y)
	{
		setyPlateau(y); // � remplacer
		setxPlateau(x); // � remplacer
		this.plateau = new CasePlateau[xPlateau][yPlateau];

		for (int i = 0; i < xPlateau ; i++ )
		{
			for (int j = 0; j < yPlateau ; j++ )
			{
				this.plateau[i][j] = CasePlateau.VIDE;
				
			}
		}
	}
	
	/* Rajout d'une case FRUIT � des coordonn�es donn�es
	 * 
	 */
	public void rajouterFruit(Coordonnees c)
	{
		//if (c.get)
		this.plateau[c.getX()][c.getY()]=CasePlateau.FRUIT;
	}
	
	/* Rajout d'une case SERPENT � des coordonn�es donn�es
	 * 
	 */
	public void rajouterSerpent(Coordonnees c)
	{
		//if (c.get)
		this.plateau[c.getX()][c.getY()]=CasePlateau.SERPENT;
	}
	

	/* Retourne le type de la Case : FRUIT, SERPENT ou VIDE
	 * 
	 */
	public CasePlateau getCase(Coordonnees c)
	{
		//verif coord
		return this.plateau[c.getX()][c.getY()];
	}
	
}
