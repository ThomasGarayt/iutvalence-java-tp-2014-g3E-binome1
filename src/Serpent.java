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

    public void avancer() {
        // G�rer l'avancement du serpent
        /* TODO Discutable. */
        // On modifie le tableau en le d�calant � gauche, en faisant Coordonnees[0] + Delta
    }

}
