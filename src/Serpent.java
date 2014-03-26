/* TODO Package. */

/* TODO Attention, tout ça dépend de la taille du tableau. */
/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Serpent {
    /** TODO. */
    public final Coordonnees positionSerpent[];
    /** TODO. */
    public int tailleSerpent = 4;
    /** TODO. */
    public SensSerpent sens;

    /** Initialisation de la taille et de la position de chaque élément du serpent.  */
    public Serpent() {
        sens = SensSerpent.GAUCHE;
        positionSerpent = new Coordonnees[]{new Coordonnees(10, 10),
                                            new Coordonnees(11, 10),
                                            new Coordonnees(12, 10),
                                            new Coordonnees(13, 10)};
    }

    public Coordonnees[] getPositionSerpent() {
        return positionSerpent;
    }


    /* Vérifie le sens actuel et le nouveau sens */
    public void changerSens(SensSerpent sens) {
    	switch (sens) {
    		case BAS:
    			this.sens = sens==SensSerpent.HAUT ? SensSerpent.HAUT : SensSerpent.BAS;
    		case HAUT:
    			this.sens = sens==SensSerpent.BAS ? SensSerpent.BAS : SensSerpent.HAUT;
    		case DROITE:
    			this.sens = sens==SensSerpent.GAUCHE ? SensSerpent.GAUCHE : SensSerpent.DROITE;
    		case GAUCHE:
    			this.sens = sens==SensSerpent.DROITE ? SensSerpent.DROITE : SensSerpent.GAUCHE;
    	}
    }
   
    // Faire test avec delta et -delta 
    
    public void avancer() 
    {
    	Coordonnees NewTeteSerpent = new Coordonnees(this.positionSerpent[0].x + this.sens.getDeltaX(), this.positionSerpent[0].y + this.sens.getDeltaY());

    	for(int i = tailleSerpent - 1; i > 0 ; i--)
{
    			positionSerpent[i] = positionSerpent[i-1];    		
    		} 
    	positionSerpent[0] = NewTeteSerpent;
    }

}
