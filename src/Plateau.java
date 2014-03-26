/* TODO Package. */

/**
 * TODO.
 *
 * @author CHAUVEAU - GARAYT
 * @version 26-03-2014
 */
public class Plateau {
    /** TODO. */
    private final int             largeur;
    /** TODO. */
    private final int             hauteur;
    /** TODO. */
    private final CasePlateau[][] plateau;

    /** Création et initialisation à vide du plateau. */
    public Plateau(int x, int y) {
        this.hauteur = y;
        this.largeur = x;

        this.plateau = new CasePlateau[largeur][hauteur];
        for (int indiceAbscisse = 0; indiceAbscisse < largeur; indiceAbscisse++) {
            for (int indiceOrdonnee = 0; indiceOrdonnee < hauteur; indiceOrdonnee++) {
                this.plateau[indiceAbscisse][indiceOrdonnee] = CasePlateau.VIDE;
            }
        }
    }

    /** Permet d'obtenir la limite en X du plateau */
    public int largeur() {
        return largeur;
    }

    /** Permet d'obtenir la limite en Y du plateau */
    public int hauteur() {
        return hauteur;
    }

    /**
     * Rajout d'une case FRUIT à une coordonnée donnée.
     * TODO à améliorer dans des futures versions.
     */
    public void ajouterFruit() {
        while (true) {
            /* TODO Préférer SecureRandom à Math.random */
            int xFruit = (int) ((Math.random() * this.largeur) - 1);
            int yFruit = (int) ((Math.random() * this.hauteur) - 1);

            if (this.plateau[xFruit][yFruit] != CasePlateau.SERPENT) {
                this.plateau[xFruit][yFruit] = CasePlateau.FRUIT;
                break;
            }
        }
    }

    /** Rajout d'une case SERPENT à une coordonnée donnée. */
    public void ajouterSerpent(Coordonnees c) {
        this.plateau[c.getX()][c.getY()] = CasePlateau.SERPENT;
    }
    
    /** Suppression d'une case SERPENT à une coordonnée donnée. */
    public void enleverSerpent(Coordonnees c) {
        this.plateau[c.getX()][c.getY()] = CasePlateau.VIDE;
    }
    
    /** Retourne le type de la Case : FRUIT, SERPENT ou VIDE. */
    public CasePlateau getCase(Coordonnees c) {
        return this.plateau[c.getX()][c.getY()];

    }

    /** TODO. */
    public CasePlateau getCase(int x, int y) {
        return this.plateau[x][y];
    }
}
