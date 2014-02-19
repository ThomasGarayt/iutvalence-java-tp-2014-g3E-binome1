
public class MatricePlateau {

	public static int xPlateau = 20;
	public static int yPlateau = 20;
	
	
	/* Création et initialisation du plateau
	 */
	public MatricePlateau()
	{
		int matricePlateau[][] = new int[xPlateau][yPlateau];
		
		for (int i = 0; i < xPlateau ; i++ )
		{
			for (int j = 0; j < yPlateau ; j++ )
			{
			matricePlateau[i][j] = 0; 		
			}
		}
	
		
	}
}
