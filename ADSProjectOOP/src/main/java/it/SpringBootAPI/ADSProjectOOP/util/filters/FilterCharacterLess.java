package it.SpringBootAPI.ADSProjectOOP.util.filters;

import it.SpringBootAPI.ADSProjectOOP.exceptions.FilterException;
import it.SpringBootAPI.ADSProjectOOP.model.User;

/** <b>Class FilterCharacterLess: </b><br><br>
 * Tale classe filtra i friends valutando se la loro descrizione 
 * ha un numero di caratteri inferiore ad un massimo dato.
 * @author Cristian Di Silvetre
 */
public class FilterCharacterLess extends Filter {
	
	/** Tale metodo valuta se la descrizione di un singolo friend 
	 * ha un numero di caratteri inferiore ad un massimo dato o meno.
	 * La descrizione, inoltre, non deve essere nulla.
	 * @return boolean: il valore sarà pari a vero se il friend risulta positivo al filtro.
	 * @param friend - da valutare;
	 * @param param1: viene parsato da Object a int;
	 * @param param2 non utilizzato.
	 * @see it.SpringBootAPI.ADSProjectOOP.model.User
	 * @throws NumberFormatException nel momento in cui si presenta 
	 * un errore nel tipo di parametro inserito.
	 */
	public boolean filter (User friend, Object param1, Object param2) {
		int max = 0;
		try {
		max = Integer.parseInt(param1.toString());
		}catch (NumberFormatException e) {
			throw new FilterException();
		}
		int param = friend.getCharacterNumber();
		if (param <= max && param != 0) return true;
		else return false;		
	}
}
