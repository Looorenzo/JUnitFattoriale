/**
 * 
 * @author Macrì Lorenzo
 * @version 3.0
 *
 */
public class Fattoriale {
	
	/**
	 * Costruttore 
	 */

	public Fattoriale() {

	}
	
	/**
	 * Metodo che calcola il fattoriale
	 * 
	 * @param n
	 * @return
	 */

	public float fattoriale(int n) {
		int fatt, i;

		fatt = 1;

		for (i = 1; i < n; i++) //<=
			fatt = fatt * i;

		return fatt;
	}
}
