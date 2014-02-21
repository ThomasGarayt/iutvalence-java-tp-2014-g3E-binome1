import java.util.Random;


public class Coordonnees {

	public final int x;
	public final int y;
	
	/* Crée un couple de coordonnées de la forme (x,y)
	 */
	public Coordonnees(int x1, int y1)
	{
		this.x = x1;
		this.y = y1;
	}
	
	public Coordonnees()
	{
	  this.x = (int) ((Math.random()*MatricePlateau.getXplateau())-1);
      this.y = (int) ((Math.random()*MatricePlateau.getYplateau())-1);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
}
