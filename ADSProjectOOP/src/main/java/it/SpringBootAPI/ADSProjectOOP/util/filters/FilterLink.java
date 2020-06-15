package it.SpringBootAPI.ADSProjectOOP.util.filters;

import it.SpringBootAPI.ADSProjectOOP.model.*;

/** <b>Classe FilterLink: </b><br><br>
 * Tale classe filtra i friends valutando se la loro descrizione contiene un link.
 * @author Cristian Di Silvetre
 */
public class FilterLink extends Filter {
	
	/** Tale metodo valuta se la descrizione di un singolo friend contiene un link o meno.
	 * @return boolean: il valore sarà pari a vero se il friend risulta positivo al filtro.
	 * @param friend - da valutare;
	 * @param param1 non utilizzato;
	 * @param param2 non utilizzato.
	 * @see it.SpringBootAPI.ADSProjectOOP.model.User
	 */
	public boolean filter (User friend, Object param1, Object param2) {
		
		int param = friend.getDescriptionProperties();
		if (param == 5 || param == 6 || param == 7 || param == 8) return true;
		else return false;
	}
}