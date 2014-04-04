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
        this.plateau.ajouterFruit();
    }

    /** Retourne le plateau de jeu. */
    public Plateau plateau() {
        return this.plateau;
    }

    /** Permet l'appel à la fonction changeant le sens du serpent (avec vérifications) */
    public void tournerVers(final SensSerpent sens) {
        this.serpent.changerSens(sens);
    }

    /** Met en place les nouvelles positions du serpent, en effacant les anciennes */
    public void rafraichir() {
        effacerSerpent();
        this.avancer();
        afficherSerpent();
    }
   

    /** TODO. */
    private void afficherSerpent()
    {
        for (final Coordonnees coord : serpent.position()) {
            plateau.ajouterSerpent(coord);
        }
    }

    /** TODO. */
    private void effacerSerpent()
    {
    	 for (final Coordonnees coord : serpent.position()) {
             plateau.enleverSerpent(coord);
         }
    }
    
    
    /** Utile pour savoir si une case est disponible à accueillir la tête du Serpent, NE FONCTIONNE PAS */
    public boolean testCaseDisponible(Coordonnees caseATester)
    {
    	// Faire un getter dans Plateau
    }
    
    
    /** Modifie le tableau de position du serpent pour le faire avancer d'une case en fonction de son sens */
    public void avancer() 
    {
        System.arraycopy(serpent.positionSerpent, 0, serpent.positionSerpent, 1, serpent.tailleSerpent - 1);
        Coordonnees nouvellePositionTete = new Coordonnees(serpent.positionSerpent[0].x + serpent.sens.deltaX(), serpent.positionSerpent[0].y + serpent.sens.deltaY());
        
        /*
    	if(plateau.testCaseDisponible(nouvellePositionTete))
    	{
            serpent.positionSerpent[0] = nouvellePositionTete;
    	}
    	else
    	{
    		System.out.println("PERDU !");
    	}
        */
    	
        for (int indiceTableauPosSerpent = 0;indiceTableauPosSerpent < serpent.tailleSerpent;indiceTableauPosSerpent++)
        {
        	if (nouvellePositionTete.getX() == serpent.positionSerpent[indiceTableauPosSerpent].getX()
        			&& nouvellePositionTete.getY() == serpent.positionSerpent[indiceTableauPosSerpent].getY()) {
        			System.out.println("PERDU !");
        			System.exit(0);
        		}
        }
      
        serpent.positionSerpent[0] = nouvellePositionTete;
        

    }
       
}
