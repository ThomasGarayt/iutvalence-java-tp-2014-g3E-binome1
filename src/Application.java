import java.util.Scanner;

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
        
        /* Place le premier fruit. */
        controleur.ajouterFruit();
    	controleur.rafraichir();
    	affichage.afficher();


    	System.out.println("Choix de la direction : ");
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {

        	String touche = sc.nextLine();
        	if (touche.equals("z")) {
        		controleur.tournerVers(SensSerpent.HAUT);
        	}
        	if (touche.equals("s")) {
        		controleur.tournerVers(SensSerpent.BAS);
        	}
        	if (touche.equals("d")) {
        		controleur.tournerVers(SensSerpent.DROITE);
        	}
        	if (touche.equals("q")) {
        		controleur.tournerVers(SensSerpent.GAUCHE);
        	}
        	affichage.nettoyer();
        	controleur.rafraichir();
        	affichage.afficher();
        	System.out.println("Choix de la direction : ");

        }
    	
    }
}
