
public class Snake {

	private MatricePlateau plateau;
	private Serpent serpent;
	
	/*Initialise la matrice du plateau de jeu
	 *  */
	public Snake()
	{
		this.plateau = new MatricePlateau(20, 20);
		/*Serpent serpent = new Serpent();
		Coordonnees tabSerpent[] = serpent.getPositionSerpent();
		
		for(int k = 0; k < tabSerpent.length; k++)
		{
		for (int j = 0; j < plateau.getYplateau() ; j++ )
		{
			for (int i = 0; i < plateau.getXplateau() ; i++ )
			{
				if ((j==plateau.getYplateau())&&(i==plateau.getXplateau()))
				{
					this.plateau[i][j] = CasePlateau.SERPENT;
				}
				
				
			}
		}	
		}*/
	}
	
	
	
	
	public void ajouterFruit()
	{
		Coordonnees coordonneeAlea = new Coordonnees();
		this.plateau.rajouterFruit(coordonneeAlea);
	}
	
	
	public MatricePlateau getPlateau()
	{
		return this.plateau;
	}
}
