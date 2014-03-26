/* TODO Package. */

/** TODO.
 *
 * @author CHAUVEAU - GARAYT
 * @version 26-03-2014
 */
public class Application {

    public static void main(String[] args) throws InterruptedException {

        Controleur s = new Controleur(20, 20);
        Affichage affichage = new Affichage(s.getPlateau());
        s.ajouterFruit();

        affichage.nettoyerEcran();
        s.mettreSerpentSurPlateau();
        affichage.afficherPlateau();
        Thread.sleep(1500);
        s.enleverSerpentSurPlateau();
        s.changerSens(SensSerpent.BAS);
        s.avancerSerpent();

        affichage.nettoyerEcran();
        s.mettreSerpentSurPlateau();
        affichage.afficherPlateau();
        Thread.sleep(1500);
        s.enleverSerpentSurPlateau();
        s.changerSens(SensSerpent.DROITE);
        s.avancerSerpent();
        
        affichage.nettoyerEcran();
        s.mettreSerpentSurPlateau();
        affichage.afficherPlateau();
        Thread.sleep(1500);
        s.enleverSerpentSurPlateau();
        s.changerSens(SensSerpent.HAUT);
        s.avancerSerpent();
        
        affichage.nettoyerEcran();
        s.mettreSerpentSurPlateau();
        affichage.afficherPlateau();
        Thread.sleep(1500);
        s.enleverSerpentSurPlateau();
        s.changerSens(SensSerpent.GAUCHE);
        s.avancerSerpent();

        }
    }
