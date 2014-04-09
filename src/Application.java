/* TODO Package. */

/** TODO.
 *
 * @author CHAUVEAU - GARAYT
 * @version 26-03-2014
 */
public class Application {

    public static void main(String[] args) throws InterruptedException {

        Controleur controleur = new Controleur(20, 20);
        Affichage affichage = new Affichage(controleur.plateau());
        /* Placer le premier fruit. */

        controleur.ajouterFruit();

                
        affichage.nettoyer();
        controleur.rafraichir();
        affichage.afficher();
        Thread.sleep(1500);
        controleur.tournerVers(SensSerpent.GAUCHE);
        
        affichage.nettoyer();
        controleur.rafraichir();
        affichage.afficher();
        Thread.sleep(1500);
        controleur.tournerVers(SensSerpent.GAUCHE);
        
        affichage.nettoyer();
        controleur.rafraichir();
        affichage.afficher();
        Thread.sleep(1500);
        controleur.tournerVers(SensSerpent.GAUCHE);

        affichage.nettoyer();
        controleur.rafraichir();
        affichage.afficher();
        Thread.sleep(1500);
        controleur.tournerVers(SensSerpent.GAUCHE);
        
        affichage.nettoyer();
        controleur.rafraichir();
        affichage.afficher();
        Thread.sleep(1500);
        controleur.tournerVers(SensSerpent.GAUCHE);
        }
    }
