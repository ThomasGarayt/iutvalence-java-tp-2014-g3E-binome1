/* TODO Javadoc. */
/* TODO Package. */

public class Application {

    public static void main(String[] args) {

        Snake s = new Snake(20, 20);
        Out affichage = new Out(s.getPlateau());

        affichage.nettoyerEcran();
        s.ajouterFruit();
        affichage.afficherPlateau();
    }

}
