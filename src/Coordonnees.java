public class Coordonnees {

	public final int x;
	public final int y;
	
	/* Cr�e un couple de coordonn�es de la forme (x,y)
	 */
	public Coordonnees(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Coordonnees()
	{
		// r�ussir � faire sans les static ici
	  this.x = (int) ((Math.random()*Plateau.getXplateau())-1);
      this.y = (int) ((Math.random()*Plateau.getYplateau())-1);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
}
