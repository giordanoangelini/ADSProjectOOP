package it.SpringBootAPI.ADSProjectOOP.util.filters;

import it.SpringBootAPI.ADSProjectOOP.exceptions.FilterException;
import it.SpringBootAPI.ADSProjectOOP.model.*;

/** <b>Classe FilterCharacterMore: </b><br><br>
 * Tale classe filtra i friends valutando se la loro descrizione 
 * ha un numero di caratteri maggiore di un minimo dato.
 * @author Cristian Di Silvetre
 */
public class FilterCharacterMore extends Filter {
	
	/** Tale metodo valuta se la descrizione di un singolo friend 
	 * ha un numero di caratteri maggiore di un minimo dato o meno.
	 * @return boolean: il valore sarà pari a vero se il friend risulta positivo al filtro.
	 * @param friend - da valutare;
	 * @param param1: viene parsato da Object a int;
	 * @param param2 non utilizzato.
	 * @see it.SpringBootAPI.ADSProjectOOP.model.User
	 * @throws NumberFormatException nel momento in cui si presenta 
	 * un errore nel tipo di parametro inserito.
	 */
	public boolean filter (User friend, Object param1, Object param2) {
		
		int min = 0;
		try {
		min = Integer.parseInt(param1.toString());
		}catch (NumberFormatException e) {
			throw new FilterException();
		}
		int param = friend.getCharacterNumber();
		if (param >= min) return true;
		else return false;		
	}
}