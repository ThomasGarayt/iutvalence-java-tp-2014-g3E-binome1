/* TODO Package. */

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Plateau {
    /* TODO À renommer. */
    /** TODO. */
    private final int yPlateau;
    /* TODO À renommer. */
    /** TODO. */
    private final int xPlateau;
    /** TODO. */
    private final CasePlateau[][] plateau;

    /** TODO. */
    public int getXplateau() {
        return xPlateau;
    }

    /** TODO. */
    public int getYplateau() {
        return yPlateau;
    }

    /** Création et initialisation à vide du plateau. */
    public Plateau(int x, int y) {
        this.yPlateau = y;
        this.xPlateau = x;

        this.plateau = new CasePlateau[xPlateau][yPlateau];
        for (int i = 0; i < xPlateau; i++) {
            for (int j = 0; j < yPlateau; j++) {
                this.plateau[i][j] = CasePlateau.VIDE;
            }
        }
    }

    /**
     * Rajout d'une case FRUIT à une coordonnée donnée.
     * TODO à améliorer dans des futures versions.
     */
    public void rajouterFruit() {
        int xFruit;
        int yFruit;
        do {
            xFruit = (int) ((Math.random() * this.xPlateau) - 1);
            yFruit = (int) ((Math.random() * this.yPlateau) - 1);
        }
        while (this.plateau[xFruit][yFruit] == CasePlateau.SERPENT);
        this.plateau[xFruit][yFruit] = CasePlateau.FRUIT;
    }

    /** Rajout d'une case SERPENT à une coordonnée donnée. */
    public void rajouterSerpent(Coordonnees c) {
        this.plateau[c.getX()][c.getY()] = CasePlateau.SERPENT;
    }

    public CasePlateau getCase(int x, int y) {
        return this.plateau[x][y];
    }
}
