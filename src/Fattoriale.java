/**
 * 
 * @author Macrì Lorenzo
 * @version 2.0
 *
 */
public class Fattoriale {
	
	/**
	 * Costruttore 
	 */

	public Fattoriale() {

	}

	public float fattoriale(int n) {
		int fatt, i;

		fatt = 1;

		for (i = 1; i < n; i++) //<=
			fatt = fatt * i;

		return fatt;
	}
}
