
public class Out {
	
	public Plateau plateau;
	
	public Out(Plateau plateau)
	{
		this.plateau = plateau;
	}
	public void afficherPlateau()
	{
		for (int j = 0; j < plateau.getYplateau() ; j++ )
		{
			for (int i = 0; i < plateau.getXplateau() ; i++ )
			{	
				System.out.println(plateau.getCase(i,j)); // getter à mettre
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
