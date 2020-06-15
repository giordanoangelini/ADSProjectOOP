package it.SpringBootAPI.ADSProjectOOP.util.filters;

import it.SpringBootAPI.ADSProjectOOP.model.User;

/** <b>Classe FilterHashtag: </b><br><br>
 * tale classe filtra i friends valutando se la loro descrizione contiene un hashtag.
 * @author Cristian Di Silvetre
 */
public class FilterHashtag extends Filter {
	
	/** Tale metodo valuta se la descrizione di un singolo friend contiene un hashtag o meno.
	 * @return boolean: il valore sarà pari a vero se il friend risulta positivo al filtro.
	 * @param friend - da valutare;
	 * @param param1 non utilizzato;
	 * @param param2 non utilizzato.
	 * @see it.SpringBootAPI.ADSProjectOOP.model.User
	 */
	public boolean filter (User friend, Object param1, Object param2) {
		
		int param = friend.getDescriptionProperties();
		if (param == 3 || param == 4 || param == 7 || param == 8) return true;
		else return false;
	}
}
