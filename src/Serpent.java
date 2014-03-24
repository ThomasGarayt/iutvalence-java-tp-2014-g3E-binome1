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

    public void avancer() {
        // G�rer l'avancement du serpent
        // On modifie le tableau en le d�calant � gauche, en faisant Coordonnees[0] + Delta
    }
}
