/* TODO Package. */

/**
 * TODO
 *
 * @author TODO
 * @version TODO
 */
public class Controleur {
    /** TODO. */
    private Plateau plateau;
    /** TODO. */
    private Serpent serpent;

    /** Initialise la matrice du plateau de jeu. */
    public Controleur(int x, int y) {
        this.plateau = new Plateau(x, y);
        this.serpent = new Serpent(); 
    }

    /** Ajoute aléatoirement un fruit de coordonnées (x,y) sur le plateau. */
    public void ajouterFruit() {
        this.plateau.rajouterFruit();
    }

    /* TODO Evitez le franglais ! */
    /** Retourne le plateau de jeu. */
    public Plateau getPlateau() {
        return this.plateau;
    }
    
    /** TODO. */
    public void mettreSerpentSurPlateau()
    {
        for (Coordonnees coord : serpent.position()) {
            plateau.rajouterSerpent(coord);
        }
    }

    /** TODO. */
    public void enleverSerpentSurPlateau()
    {
    	 for (Coordonnees coord : serpent.position()) {
             plateau.enleverSerpent(coord);
         }
    }
    
    /* TODO A FINIR, NE MARCHE PAS. */
    /** TODO. */
    public void avancerSerpent()
    {
     	if (caseValide(serpent.positionSerpent[0]))
    	{
    		System.out.println("Perdu !");
    		System.exit(0);
    	}
    	this.serpent.avancer();
  }

    /** TODO. */
	public void changerSens(SensSerpent sens) {
		this.serpent.changerSens(sens);
	}

    /* TODO Ca n'a rien à faire ici. */
	/** Verifie si la nouvelle case est vide / ou juste avec un fruit */
    public boolean caseValide(Coordonnees nouvelleCase) {
        return plateau.getCase(nouvelleCase) == CasePlateau.SERPENT;
    }
}
