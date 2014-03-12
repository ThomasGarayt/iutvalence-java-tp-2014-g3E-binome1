
public class Snake {

	private Plateau plateau;
	private Serpent serpent;
	
	/*Initialise la matrice du plateau de jeu
	 *  
	 */
	public Snake(int x, int y)
	{
		this.plateau = new Plateau(x,y);
		this.serpent = new Serpent();
		for (Coordonnees coord : serpent.getPositionSerpent()) {
			plateau.rajouterSerpent(coord);
		}
	}
	
	
	/* Ajoute al�aoirement un fruit de coordonn�es (x,y) sur le plateau
	 * 	
	 */
	public void ajouterFruit()
	{
		this.plateau.rajouterFruit();
	}
	
	/* Retourne le plateau de jeu
	 * 
	 */
	public Plateau getPlateau()
	{
		return this.plateau;
	}
}
