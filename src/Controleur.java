/* TODO Javadoc. */
/* TODO Package. */

public class Controleur {
    private Plateau plateau;
    private Serpent serpent;

    /** Initialise la matrice du plateau de jeu. */
    public Controleur(int x, int y) 
    {
        this.plateau = new Plateau(x, y);
        this.serpent = new Serpent(); 
    }

    /** Ajoute aléatoirement un fruit de coordonnées (x,y) sur le plateau. */
    public void ajouterFruit() {
        this.plateau.rajouterFruit();
    }

    /** Retourne le plateau de jeu. */
    public Plateau getPlateau() {
        return this.plateau;
    }
    
    
    public void mettreSerpentSurPlateau()
    {
        for (Coordonnees coord : serpent.getPositionSerpent()) {
            plateau.rajouterSerpent(coord);
        }
    }
    
    public void enleverSerpentSurPlateau()
    {
    	 for (Coordonnees coord : serpent.getPositionSerpent()) {
             plateau.enleverSerpent(coord);
         }
    }
    
    // A FINIR, NE MARCHE PAS
    public void avancerSerpent()
    {
     	if (caseValide(serpent.positionSerpent[0]))
    	{
    		System.out.println("Perdu !");
    		System.exit(0);
    	}
    	this.serpent.avancer();
  }

	public void changerSens(SensSerpent sens) {
		this.serpent.changerSens(sens);
	}
	
	/** Verifie si la nouvelle case est vide / ou juste avec un fruit */
	public boolean caseValide(Coordonnees nouvelleCase)
	{
		if(plateau.getCase(nouvelleCase) != CasePlateau.SERPENT)
			return false;
		
	return true;
	}
}
