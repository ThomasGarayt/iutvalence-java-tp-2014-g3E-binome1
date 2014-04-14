/* TODO Package. */

/**
 * @author CHAUVEAU - GARAYT
 * @version 26-03-2014
 */

public class Affichage {
	
    /** Plateau de jeu contenant les différentes cases */
    public Plateau plateau;
    
    /** Constructeur
     * @param Un Plateau */
    public Affichage(Plateau plateau) {
        this.plateau = plateau;
    }

    /** Affiche le plateau avec les différentes cases */
    public void afficher() {
        System.out.println(plateau);
    }


    /** Ajout de 20 lignes vides pour "nettoyer" l'écran */
    /* TODO Utiliser les codes ANSI */
    public void nettoyer() {
        for (int k = 0; k < 20; k++) {
            System.out.println("");
        }
    }
}
