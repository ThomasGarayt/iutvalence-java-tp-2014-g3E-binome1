<<<<<<< HEAD
/* TODO Javadoc. */
/* TODO Pourquoi pas simplement Plateau ? */
public class MatricePlateau {
    /* TODO Pourquoi static ? */
	private static int yPlateau;
    /* TODO Pourquoi static ? */
	private static int xPlateau;
    /* TODO Pourquoi static ? */
	private static CasePlateau plateau[][];
	
	public static void setxPlateau(int xPlateau) {
		MatricePlateau.xPlateau = xPlateau;
	}
	
	public static void setyPlateau(int yPlateau) {
		MatricePlateau.yPlateau = yPlateau;
	}


	public static int getXplateau() {
		return xPlateau;
	}


	public static int getYplateau() {
		return yPlateau;
	}

	/* Création et initialisation du plateau
	 */
	public MatricePlateau(int x, int y)
	{
		setyPlateau(y);
		setxPlateau(x);
		this.plateau = new CasePlateau[xPlateau][yPlateau];

		for (int i = 0; i < xPlateau ; i++ )
		{
			for (int j = 0; j < yPlateau ; j++ )
			{
				this.plateau[i][j] = CasePlateau.VIDE;
				
			}
		}
	}
	
	public void rajouterFruit(Coordonnees c)
	{
		//if (c.get)
		this.plateau[c.getX()][c.getY()]=CasePlateau.FRUIT;
	}
	
	public CasePlateau getCase(Coordonnees c)
	{
		//verif coord
		return this.plateau[c.getX()][c.getY()];
	}
	
}
