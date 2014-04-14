import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.sun.org.apache.xalan.internal.xsltc.dom.CachedNodeListIterator;

/* TODO Package. */

/**
 * @author CHAUVEAU - GARAYT
 * @version 14-04-2014
 */

public class Serpent {
	
    /** Taille initiale du serpent. */
    private static final int TAILLE_INITIALE = 5;
    
    /** Tableau de coordonnées indiquant la position du serpent */
    public final Deque<Coordonnees> positionSerpent;
    
    /** Sens actuel du serpent */
    public SensSerpent sens;

    /** Initialisation de la taille et de la position de chaque élément du serpent.  */
    public Serpent() {
        sens = SensSerpent.GAUCHE;
        positionSerpent = new LinkedList<Coordonnees>();
        for (int i = 0; i < TAILLE_INITIALE; i++) {
            positionSerpent.add(new Coordonnees(10 + i, 10));
        }
    }
 
    /** Enlève le dernier élement de la collection positionSerpent, et rajoute une nouvelle Coordonnee en tête de la collection
     * @exception Le serpent avance sur une case Serpent */
    public void avancer() throws SerpentException {
    	positionSerpent.pollLast();
    	Coordonnees ancienneTete = positionSerpent.peekFirst();
        Coordonnees nouvellePositionTete = new Coordonnees(ancienneTete.x + sens.deltaX(), ancienneTete.y + sens.deltaY());
        if (positionSerpent.contains(nouvellePositionTete))
        {
        	throw new SerpentException();
        }
        positionSerpent.addFirst(nouvellePositionTete);
    }

    /** Retourne la coordonnee de la tête du Serpent */
    public Coordonnees tete() {
    	return positionSerpent.peekFirst();
    }
    
    /** Retourne le tableau de Coordonnees correspondant à la collection positionSerpent */
    public Coordonnees[] position() {
    	return positionSerpent.toArray(new Coordonnees[positionSerpent.size()]);
    }


    /** Vérifie le sens actuel et le nouveau sens */
    public void changerSens(SensSerpent nouveauSens) {
    	if (nouveauSens.deltaX() != -this.sens.deltaX())
    		this.sens = nouveauSens;

    	if (nouveauSens.deltaY() != -this.sens.deltaY())
    		this.sens = nouveauSens;
    }
    
    
    /** Rajoute la prochaine case parcourue à la collection positionSerpent */
    public void agrandirSerpent()
    {
    	Coordonnees ancienneTete = positionSerpent.peekFirst();
        Coordonnees nouvellePositionTete = new Coordonnees(ancienneTete.x + sens.deltaX(), ancienneTete.y + sens.deltaY());
        positionSerpent.addFirst(nouvellePositionTete);
    }

}
