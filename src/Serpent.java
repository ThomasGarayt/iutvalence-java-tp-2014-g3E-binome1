
public class Serpent {

	public int tailleSerpent = 4;
	
	public SensSerpent sens;
	
	public Coordonnees positionSerpent[];
	
	public Coordonnees[] getPositionSerpent() {
		return positionSerpent;
	}

	/* Initialisation de la taille et de la position de chaque élément du serpent
	 * 
	 */
	public Serpent()
	{
		sens = sens.GAUCHE;
		positionSerpent = new Coordonnees[] {
				new Coordonnees(10,10),
				new Coordonnees(11,10),
				new Coordonnees(12,10),
				new Coordonnees(13,10)};
	}
	
	
	public void avancer()
	{
			// Gérer l'avancement du serpent
			// On modifie le tableau en le décalant à gauche, en faisant Coordonnees[0] + Delta 
	}
	
}
