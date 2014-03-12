public class Plateau {

	private final int yPlateau;

	private final int xPlateau;

	private CasePlateau plateau[][];
	
	public int getXplateau() {
		return xPlateau;
	}

	public int getYplateau() {
		return yPlateau;
	}

	/* Création et initialisation à vide du plateau
	 * 
	 */
	public Plateau(int x, int y)
	{
		this.yPlateau = y;
		this.xPlateau = x;

		this.plateau = new CasePlateau[xPlateau][yPlateau];

		for (int i = 0; i < xPlateau ; i++ )
		{
			for (int j = 0; j < yPlateau ; j++ )
			{
				this.plateau[i][j] = CasePlateau.VIDE;	
			}
		}
	}
	
	/* Rajout d'une case FRUIT à une coordonnée donnée
	 * 
	 */
	public void rajouterFruit()
	{
		while(true)
		{
		int xFruit = (int) ((Math.random()*this.xPlateau)-1);
	    int yFruit = (int) ((Math.random()*this.yPlateau)-1);
	    
	   	if (this.plateau[xFruit][yFruit] != CasePlateau.SERPENT)
	   	{
	   			this.plateau[xFruit][yFruit]=CasePlateau.FRUIT;
	   			break;
	   	}
		}
	}
	
	/* Rajout d'une case SERPENT à une coordonnée donnée
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
		return this.plateau[c.getX()][c.getY()];
	}
	
	public CasePlateau getCase(int x, int y)
	{
		return this.plateau[x][y];
	}
	
	
	
}
