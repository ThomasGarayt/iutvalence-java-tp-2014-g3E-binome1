/* TODO Package. */

/* TODO Attention, tout ça dépend de la taille du tableau. */
/**
 * TODO.
 *
 * @author CHAUVEAU - GARAYT
 * @version 26-03-2014
 */
public class Serpent {
	
    /** Tableau de coordonnées indiquant la position du serpent */
    public final Coordonnees positionSerpent[];
    
    /** Taille actuelle du serpent, initialisée à 5 */
    public int tailleSerpent = 5;
    
    /** Sens actuel du serpent */
    public SensSerpent sens;

    /** Initialisation de la taille et de la position de chaque élément du serpent.  */
    public Serpent() {
        sens = SensSerpent.GAUCHE;
        positionSerpent = new Coordonnees[]{new Coordonnees(10, 10),
                                            new Coordonnees(11, 10),
                                            new Coordonnees(12, 10),
                                            new Coordonnees(13, 10),
        									new Coordonnees(14, 10)};
    }

    /** TODO. */
    public Coordonnees[] position() {
        return positionSerpent;
    }


    /** Vérifie le sens actuel et le nouveau sens */
    public void changerSens(SensSerpent nouveauSens) {
    	if (nouveauSens.getDeltaX() != -this.sens.getDeltaX())
    		this.sens = nouveauSens;

    	if (nouveauSens.getDeltaY() != -this.sens.getDeltaY())
    		this.sens = nouveauSens;
    }

    /** Modifie le tableau de position du serpent pour le faire avancer d'une case en fonction de son sens */
    public void avancer() 
    {
        Coordonnees nouvelleTete = new Coordonnees(this.positionSerpent[0].x + this.sens.getDeltaX(), this.positionSerpent[0].y + this.sens.getDeltaY());
        System.arraycopy(positionSerpent, 0, positionSerpent, 1, tailleSerpent - 1);
        positionSerpent[0] = nouvelleTete;
    }
}
