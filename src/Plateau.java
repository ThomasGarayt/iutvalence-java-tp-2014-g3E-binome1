/* TODO Package. */

/**
 * TODO.
 *
 * @author CHAUVEAU - GARAYT
 * @version 26-03-2014
 */
public class Plateau {
    /** TODO. */
    private final int largeur;
    
    /** TODO. */
    private final int hauteur;
    
    /** TODO. */
    private final Case[][] plateau;

    /** Création et initialisation à vide du plateau. */
    public Plateau(int x, int y) {
        this.hauteur = y;
        this.largeur = x;

        this.plateau = new Case[largeur+2][hauteur+2];
        for (int indiceAbscisse = 0; indiceAbscisse < largeur; indiceAbscisse++) {
            for (int indiceOrdonnee = 0; indiceOrdonnee < hauteur; indiceOrdonnee++) {
                this.plateau[indiceAbscisse][indiceOrdonnee] = Case.VIDE;
            }
        }
    }

    /**
     * Rajout d'une case FRUIT à une coordonnée donnée.
     * TODO à améliorer dans des futures versions.
     */
    public void ajouterFruit() {
        while (true) {
            /* TODO Préférer SecureRandom à Math.random */
            int xFruit = 8; //(int) ((Math.random() * this.largeur) - 1);
            int yFruit = 10; //(int) ((Math.random() * this.hauteur) - 1);

            if (this.plateau[xFruit][yFruit] != Case.SERPENT) {
                this.plateau[xFruit][yFruit] = Case.FRUIT;
                break;
            }
        }
    }
    
    
    /** Rajout d'une case SERPENT à une coordonnée donnée. */
    public void ajouterSerpent(Coordonnees c) {
        this.plateau[c.getX()][c.getY()] = Case.SERPENT;
    }
    
    /** Suppression d'une case SERPENT à une coordonnée donnée. */
    public void viderCase(Coordonnees c) {
        this.plateau[c.getX()][c.getY()] = Case.VIDE;
    }
    
    @Override
    public String toString() {
        final StringBuilder plateau = new StringBuilder(hauteur*(largeur+2));

        plateau.append('/');
        for (int i = 0; i < largeur; i++) {
            plateau.append("--");
        }
        plateau.append("\\\n");

        for (int j = 0; j < hauteur; j++) {
            plateau.append('|');
            for (int i = 0; i < largeur; i++) {
                plateau.append(this.plateau[i][j]);
            }
            plateau.append("|\n");
        }

        plateau.append('\\');
        for (int i = 0; i < largeur; i++) {
            plateau.append("--");
        }
        plateau.append('/');

        return plateau.toString();
    }
    
    public Case getTypeCase(Coordonnees coordonnees)
    {
    	return this.plateau[coordonnees.getX()][coordonnees.getY()];
    }
}
