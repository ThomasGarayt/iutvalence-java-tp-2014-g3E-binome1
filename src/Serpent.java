/* TODO Javadoc. */
/* TODO Package. */
/* TODO Attention, tout ça dépend de la taille du tableau. */
public class Serpent {
    /* TODO Taille initiale ? */
    public int tailleSerpent = 4;

    public SensSerpent sens;

    public Coordonnees positionSerpent[];

    public Coordonnees[] getPositionSerpent() {
        return positionSerpent;
    }

    /* Initialisation de la taille et de la position de chaque élément du serpent.  */
    public Serpent() {
        sens = SensSerpent.GAUCHE;
        positionSerpent = new Coordonnees[]{new Coordonnees(10, 10), new Coordonnees(11, 10), new Coordonnees(12, 10), new Coordonnees(13, 10)};
    }

    public void avancer(SensSerpent nouveauSens) 
    {
    	if(nouveauSens.toString() != sens.getSensInverse())
    	{
    	this.sens = nouveauSens;
    	Coordonnees NewTeteSerpent = new Coordonnees(this.positionSerpent[0].x + this.sens.getDeltaX(), this.positionSerpent[0].y + this.sens.getDeltaY());

    	for(int i = tailleSerpent - 1; i > 0 ; i--)
    		{
    			positionSerpent[i] = positionSerpent[i-1];    		
    		} 
    	positionSerpent[0] = NewTeteSerpent;
    	
    	
    	}
    }
}
