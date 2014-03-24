/* TODO Package. */

/* TODO Renommer cette classe. */
/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Out {
    /** TODO. */
    public Plateau plateau;
    /** TODO. */
    public Out(Plateau plateau) {
        this.plateau = plateau;
    }

    /* TODO Pourquoi cette méthode ici ? */
    /** TODO. */
    public void afficherPlateau() {
        for (int j = 0; j < plateau.getYplateau(); j++) {
            for (int i = 0; i < plateau.getXplateau(); i++) {
                System.out.print(plateau.getCase(i, j));
            }
            System.out.println("");
        }
    }

    /* TODO Je vous invite à regarder les codes ANSI pour terminal. */
    /** TODO. */
    public void nettoyerEcran() {
        for (int k = 0; k < 20; k++) {
            System.out.println("");
        }
    }
}
