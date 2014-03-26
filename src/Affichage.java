/* TODO Package. */

/**
 * TODO.
 *
 * @author CHAUVEAU - GARAYT
 * @version 26-03-2014
 */
public class Affichage {
	
    /** TODO. */
    public Plateau plateau;
    
    /** TODO. */
    public Affichage(Plateau plateau) {
        this.plateau = plateau;
    }

    /* TODO Pourquoi cette méthode ici ? */
    /** Affiche le plateau avec les différentes cases */
    public void afficherPlateau() {
        for (int j = 0; j < plateau.hauteur(); j++) {
            for (int i = 0; i < plateau.largeur(); i++) {
                System.out.print(plateau.getCase(i, j));
            }
            System.out.println("");
        }
    }

    /* TODO Je vous invite à regarder les codes ANSI pour terminal. */
    /** Ajout de 20 lignes vides pour "nettoyer" l'écran */
    public void nettoyerEcran() {
        for (int k = 0; k < 20; k++) {
            System.out.println("");
        }
    }
}
