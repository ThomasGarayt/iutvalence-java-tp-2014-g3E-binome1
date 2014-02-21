
public class Serpent {

	public int tailleSerpent = 4;
	
	public Coordonnees positionSerpent[];
	
	public Coordonnees[] getPositionSerpent() {
		return positionSerpent;
	}

	/* Initialisation de la taille et de la position de chaque élément du serpent
	 */
	public Serpent()
	{
		positionSerpent = new Coordonnees[] {
				new Coordonnees(10,10),
				new Coordonnees(11,10),
				new Coordonnees(12,10),
				new Coordonnees(13,10)};
	}
	
	
}
