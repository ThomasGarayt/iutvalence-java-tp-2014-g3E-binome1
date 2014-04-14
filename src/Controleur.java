import java.util.Arrays;

/* TODO Package. */

/**
 * @author CHAUVEAU - GARAYT
 * @version 14-04-2014
 */

public class Controleur {
	
    /** Plateau de jeu contenant les différentes cases */
    private Plateau plateau;
    
    /** Serpent qui va être placé sur le plateau */
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

    /** Retourne le plateau de jeu. 
     * @return Plateau */
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
   

    /** Place et affiche les cases Serpent sur le Plateau */
    private void afficherSerpent()
    {
        for (final Coordonnees coord : serpent.position()) {
            plateau.ajouterSerpent(coord);
        }
    }

    /** Enleve les cases Serpent du Plateau */
    private void effacerSerpent()
    {
    	 for (final Coordonnees coord : serpent.position()) {
             plateau.viderCase(coord);
         }
    }
    

    
    /** Modifie la collection de position du serpent pour le faire avancer d'une case en fonction de son sens */
    public void avancer() 
    {
    	try {
    		serpent.avancer();
    	}
    	catch (SerpentException e) { 
    		/* Le serpent s'est mangé lui même */
    		    System.out.println("Tu t'es mangé toi même !");
    		    System.exit(0);
    	}
    	
        switch(plateau.getTypeCase(serpent.tete()))
        {
        	case FRUIT:
        		serpent.agrandirSerpent();
        		ajouterFruit();
        		break;
        	case MUR:
    		    System.out.println("Bim un mur !");
    		    System.exit(0);
        		break;
        	case SERPENT:
        		/* ERREUR INTERNE */
        		/* CAS IMPOSSIBLE */
        		break;
        	case VIDE:
        	default:
        		/* RIEN */
        		break;
         }
    }       
}
