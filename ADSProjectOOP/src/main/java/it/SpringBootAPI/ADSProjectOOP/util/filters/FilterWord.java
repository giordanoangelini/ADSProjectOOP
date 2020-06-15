package it.SpringBootAPI.ADSProjectOOP.util.filters;

import it.SpringBootAPI.ADSProjectOOP.model.*;

/** <b>Classe FilterWord: </b><br><br>
 * Tale classe filtra i friends valutando se la loro descrizione contiene una parola data.
 * @author Cristian Di Silvetre
 */
public class FilterWord extends Filter{
	
	/** Tale metodo valuta se la descrizione di un singolo friend contiene una parola data o meno
	 * Il metodo non è case sensitive.
	 * @return boolean: il valore sarà pari a vero se il friend risulta positivo al filtro.
	 * @param friend - da valutare;
	 * @param param1: viene parsato da Object a String così da poter applicare il metodo contains;
	 * @param param2 non utilizzato.
	 * @see it.SpringBootAPI.ADSProjectOOP.model.User
	 * @throws NumberFormatException nel momento in cui si presenta 
	 * un errore nel tipo di parametro inserito.
	 */
	public boolean filter (User friend, Object param1, Object param2) {
		String word = param1.toString();
		String text = friend.getDescription().toLowerCase();
		if (text.contains(word.toLowerCase())) return true;
			return false;
	}
}


