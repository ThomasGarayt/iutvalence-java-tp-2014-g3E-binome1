
public class Application {

	public static void main(String[] args) {
		
		Snake s = new Snake();
		Out affichage = new Out();
		
		affichage.nettoyerEcran();
		s.ajouterFruit();
		affichage.afficherPlateau(s.getPlateau());
		
	
	}

}
