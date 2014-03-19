/* TODO Javadoc. */
/* TODO Package. */

public class Application {

    public static void main(String[] args) throws InterruptedException {

        Controleur s = new Controleur(20, 20);
        Out affichage = new Out(s.getPlateau());
        s.ajouterFruit();
        for(int i = 0; i<10;i++)
        {
        affichage.nettoyerEcran();
        s.mettreSerpentSurPlateau();
        affichage.afficherPlateau();
        Thread.sleep(2000);
        s.enleverSerpentSurPlateau();
        s.avancerSerpent(SensSerpent.GAUCHE);
        }
    }

}
