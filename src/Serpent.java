import com.sun.org.apache.xalan.internal.xsltc.dom.CachedNodeListIterator;

/* TODO Package. */

/* TODO Attention, tout ça dépend de la taille du tableau. */
/**
 * TODO.
 *
 * @author CHAUVEAU - GARAYT
 * @version 26-03-2014
 */
public class Serpent {
    /** Taille initiale du serpent. */
    private static final int TAILLE_INITIALE = 5;
    
    /** Taille actuelle du serpent. */
    public int tailleSerpent = TAILLE_INITIALE;
    
    /** Tableau de coordonnées indiquant la position du serpent */
    public final Coordonnees[] positionSerpent;
    
    /** Sens actuel du serpent */
    public SensSerpent sens;

    /** Initialisation de la taille et de la position de chaque élément du serpent.  */
    public Serpent() {
        sens = SensSerpent.GAUCHE;
        positionSerpent = new Coordonnees[tailleSerpent];
        for (int i = 0; i < tailleSerpent; i++) {
            positionSerpent[i] = new Coordonnees(10 + i, 10);
        }
    }

    /** TODO. */
    public Coordonnees[] position() {
        return positionSerpent;
    }


    /** Vérifie le sens actuel et le nouveau sens */
    public void changerSens(SensSerpent nouveauSens) {
    	if (nouveauSens.deltaX() != -this.sens.deltaX())
    		this.sens = nouveauSens;

    	if (nouveauSens.deltaY() != -this.sens.deltaY())
    		this.sens = nouveauSens;
    }

}
