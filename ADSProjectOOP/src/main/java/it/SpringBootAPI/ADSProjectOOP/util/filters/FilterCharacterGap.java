package it.SpringBootAPI.ADSProjectOOP.util.filters;

import it.SpringBootAPI.ADSProjectOOP.model.User;

/** <b>Classe FilterCharacterMore: </b><br><br>
 * Tale classe filtra i friends valutando se la loro descrizione 
 * ha un numero di caratteri maggiore di un minimo e minore di un massimo dati.
 * @author Cristian Di Silvetre
 */
public class FilterCharacterGap extends Filter {
	
	/** Tale metodo valuta se la descrizione di un singolo friend 
	 * ha un numero di caratteri maggiore di un minimo e minore di massimo dati o meno.
	 * @return boolean: il valore sarà pari a vero se il friend risulta positivo al filtro.
	 * @param friend - da valutare;
	 * @param param1: viene parsato da Object a int;
	 * @param param2: viene parsato da Object a int.
	 * @see it.SpringBootAPI.ADSProjectOOP.model.User
	 * @see it.SpringBootAPI.ADSProjectOOP.util.filters.FilterCharacterMore
	 * @see it.SpringBootAPI.ADSProjectOOP.util.filters.FilterCharacterLess
	 */
	public boolean filter (User friend, Object param1, Object param2) {		
		FilterCharacterMore obj1 = new FilterCharacterMore();
		FilterCharacterLess obj2 = new FilterCharacterLess();
		if ((obj1.filter(friend, param1, param2)) && (obj2.filter(friend, param2, param1))) 
			return true;
		else return false;
	}
}
