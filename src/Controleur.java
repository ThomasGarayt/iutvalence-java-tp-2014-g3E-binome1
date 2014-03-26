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

    /** TODO. */
    public void tournerVers(final SensSerpent sens) {
        this.serpent.changerSens(sens);
    }

    /** TODO. */
    public void rafraichirSerpent() {
        effacerSerpent();
        serpent.avancer();
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
             plateau.enleverSerpent(coord);
         }
    }
}
