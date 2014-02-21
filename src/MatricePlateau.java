/* TODO Javadoc. */
public class MatricePlateau {
    /* TODO Pourquoi static ? */
    public static int xPlateau = 20;
    /* TODO Pourquoi static ? */
    public static int yPlateau = 20;

    /** Création et initialisation du plateau */
    public MatricePlateau() {
        /* TODO Pourquoi n'est-ce qu'une variable et non un attribut ? */
        int[][] matricePlateau = new int[xPlateau][yPlateau];

        for (int i = 0; i < xPlateau; i++) {
            for (int j = 0; j < yPlateau; j++) {
                matricePlateau[i][j] = 0;
            }
        }
    }
}
