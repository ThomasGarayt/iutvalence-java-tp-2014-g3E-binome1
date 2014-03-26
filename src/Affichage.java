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
    public void afficher() {
        System.out.println(plateau);
    }

    /* TODO Je vous invite à regarder les codes ANSI pour terminal. */
    /** Ajout de 20 lignes vides pour "nettoyer" l'écran */
    public void nettoyer() {
        for (int k = 0; k < 20; k++) {
            System.out.println("");
        }
    }
}
