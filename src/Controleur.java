import java.util.Arrays;

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
             plateau.viderCase(coord);
         }
    }
    

    
    /** Modifie le tableau de position du serpent pour le faire avancer d'une case en fonction de son sens */
    public void avancer() 
    {
    	try {
    		serpent.avancer();
    	}
    	catch (SerpentException e) {
    		/* XXX Serpent qui s'est mangé tout seul. */
    	}
    	
        switch(plateau.getTypeCase(serpent.tete()))
        {
        	case FRUIT:
        		break;
        	case MUR:
        		break;
        	case SERPENT:
        		/* ERREUR INTERNE */
        		break;
        	case VIDE:
        	default:
        		/* RIEN */
        		break;
         }
    }       
}
