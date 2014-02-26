
public class Out {

	
	public void afficherPlateau(MatricePlateau plateau)
	{
		for (int j = 0; j < plateau.getYplateau() ; j++ )
		{
			for (int i = 0; i < plateau.getXplateau() ; i++ )
			{
				CasePlateau c = plateau.getCase(new Coordonnees(i, j));
				
				switch (c) {
				case VIDE:
					System.out.print("v ");
					break;
				case SERPENT :
					System.out.print("s ");
					break;
				case FRUIT:
					System.out.print("x ");
					break;
				}	
			}
			System.out.println("");
		}
	}
	
	public void nettoyerEcran()
	{
		for(int k = 0; k<20 ; k++)
		{
			System.out.println("");
		}
	}
}
