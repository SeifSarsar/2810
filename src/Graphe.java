import java.util.HashMap;

/**
 * 
 */

/**
 * @author sesarb
 *
 */
public class Graphe {
	private HashMap<Integer,Sommet> sommets;
	
	public Graphe() {
		sommets = new HashMap<Integer,Sommet>();
	}
	public Graphe(HashMap<Integer,Sommet> sommets) {
		this.sommets = sommets;
	}
	public HashMap<Integer,Sommet> getSommets() {
		return sommets;
	}

	public void setSommets(HashMap<Integer,Sommet> sommets) {
		this.sommets = sommets;
	}
	
}
