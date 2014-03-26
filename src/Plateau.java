/* TODO Package. */

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Plateau {
    private final int tailleAbscissePlateau;
    private final int tailleOrdonneePlateau;
    
    private CasePlateau plateau[][];

    /* Permet d'obtenir la limite en X du plateau */

    public int getXplateau() {
        return tailleAbscissePlateau;
    }


    /* Permet d'obtenir la limite en Y du plateau */
    public int getYplateau() {
        return tailleOrdonneePlateau;
    }

    /** Création et initialisation à vide du plateau. */
    public Plateau(int x, int y) {
        this.tailleOrdonneePlateau = y;
        this.tailleAbscissePlateau = x;

        this.plateau = new CasePlateau[tailleAbscissePlateau][tailleOrdonneePlateau];
        for (int i = 0; i < tailleAbscissePlateau; i++) {
            for (int j = 0; j < tailleOrdonneePlateau; j++) {
                this.plateau[i][j] = CasePlateau.VIDE;
            }
        }
    }

    /**
     * Rajout d'une case FRUIT à une coordonnée donnée.
     * TODO à améliorer dans des futures versions.
     */
    public void rajouterFruit() {
        while (true) {
            /* TODO Préférer SecureRandom à Math.random */
            int xFruit = (int) ((Math.random() * this.tailleAbscissePlateau) - 1);
            int yFruit = (int) ((Math.random() * this.tailleOrdonneePlateau) - 1);

            if (this.plateau[xFruit][yFruit] != CasePlateau.SERPENT) {
                this.plateau[xFruit][yFruit] = CasePlateau.FRUIT;
                break;
            }
        }
        while (this.plateau[xFruit][yFruit] == CasePlateau.SERPENT);
        this.plateau[xFruit][yFruit] = CasePlateau.FRUIT;
    }

    /** Rajout d'une case SERPENT à une coordonnée donnée. */
    public void rajouterSerpent(Coordonnees c) {
        this.plateau[c.getX()][c.getY()] = CasePlateau.SERPENT;
    }
    
    /* Suppression d'une case SERPENT à une coordonnée donnée. */
    public void enleverSerpent(Coordonnees c) {
        this.plateau[c.getX()][c.getY()] = CasePlateau.VIDE;
    }
    
    /* Retourne le type de la Case : FRUIT, SERPENT ou VIDE. */
    public CasePlateau getCase(Coordonnees c) {
        return this.plateau[c.getX()][c.getY()];

    }

    public CasePlateau getCase(int x, int y) {
        return this.plateau[x][y];
    }
}
