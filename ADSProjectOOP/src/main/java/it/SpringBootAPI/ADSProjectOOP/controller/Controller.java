package it.SpringBootAPI.ADSProjectOOP.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.SpringBootAPI.ADSProjectOOP.database.*;
import it.SpringBootAPI.ADSProjectOOP.util.stats.*;
import it.SpringBootAPI.ADSProjectOOP.model.*;
import it.SpringBootAPI.ADSProjectOOP.util.filters.*;

import java.util.Vector;

/** <b>Classe Controller:</b><br><br>
 * Tramite delle rotte risponde alle richieste 
 * del client di accedere alle funzionalita' del server web. 
 * @author Cristian Di Silvestre
 */

@RestController
public class Controller {
	
	/** Risponde all richiesta GET /metadata.
	 * @return Database: vettore di User contente i metadata. 
	 * @see it.SpringBootAPI.ADSProjectOOP.database.Database
	 */
	@GetMapping("/metadata")
	public Database getMetadata() {
		return new Database();
	}
	
	/** Risponde all richiesta GET /friends.
	 * @return FrontDatabase: vettore di FrontUser contente 
	 * i dati di interesse del client.
	 * @see it.SpringBootAPI.ADSProjectOOP.database.FrontDatabase
	 */
	@GetMapping("/friends") 
	public FrontDatabase getFriends() {
		return new FrontDatabase();
	}
	
	/** Risponde all richiesta GET /stats.
	 * @return DescriptionStats: contenente 
	 * tutte le statistiche effettuate sui friends.
	 * @see it.SpringBootAPI.ADSProjectOOP.util.stats.DescriptionStats
	 */
	@GetMapping("/stats")
	public DescriptionStats getStats() {
		return new DescriptionStats();
	}
	
	/** Risponde all richiesta GET /filter/description.
	 * @return FrontDatabase: vettore contenente tutti i friends 
	 * che hanno una descrizione non vuota.
	 * @see it.SpringBootAPI.ADSProjectOOP.util.filters.FilterDescription
	 */
	@GetMapping("/filter/description")
	public Vector <FrontUser> getFilteredDescription() {
		Object param1 = "";
		Object param2 = "";
		FilterDescription obj = new FilterDescription();
		return obj.filterVector(param1, param2);
	}
	
	/** Risponde all richiesta GET /filter/notDescription.
	 * @return FrontDatabase: vettore contenente tutti i friends 
	 * che hanno una descrizione vuota.
	 * @see it.SpringBootAPI.ADSProjectOOP.util.filters.FilterNotDescription
	 */
	@GetMapping("/filter/notDescription")
	public Vector <FrontUser> getFilteredNotDescription() {
		Object param1 = "";
		Object param2 = "";
		FilterNotDescription obj = new FilterNotDescription();
		return obj.filterVector(param1, param2);
	}
	
	/** Risponde all richiesta GET /filter/link.
	 * @return FrontDatabase: vettore contenente tutti i friends 
	 * che presentano un link nella descrizione.
	 * @see it.SpringBootAPI.ADSProjectOOP.util.filters.FilterLink
	 */
	@GetMapping("/filter/link")
	public Vector <FrontUser> getFilteredLink() {
		Object param1 = "";
		Object param2 = "";
		FilterLink obj = new FilterLink();
		return obj.filterVector(param1, param2);
	}
	
	/** Risponde all richiesta GET /filter/hashtag.
	 * @return FrontDatabase: vettore contenente tutti i friends 
	 * che presentano un hashtag nella descrizione.
	 * @see it.SpringBootAPI.ADSProjectOOP.util.filters.FilterHashtag
	 */
	@GetMapping("/filter/hashtag")
	public Vector <FrontUser> getFilteredHashtag() {
		Object param1 = "";
		Object param2 = "";
		FilterHashtag obj = new FilterHashtag();
		return obj.filterVector(param1, param2);
	}
	
	/** Risponde all richiesta GET /filter/tag.
	 * @return FrontDatabase: vettore contenente tutti i friends 
	 * che presentano un tag nella descrizione.
	 * @see it.SpringBootAPI.ADSProjectOOP.util.filters.FilterTag
	 */
	@GetMapping("/filter/tag")
	public Vector <FrontUser> getFilteredTag() {
		Object param1 = "";
		Object param2 = "";
		FilterTag obj = new FilterTag();
		return obj.filterVector(param1, param2);
	}
	
	/** Risponde all richiesta GET /filter/word.
	 * @param word: parola da ricecrcare nelle descrizioni.
	 * @return FrontDatabase: vettore contenente tutti i friends 
	 * che presentano il parametro nella descrizione.
	 * @see it.SpringBootAPI.ADSProjectOOP.util.filters.FilterWord
	 */
	@GetMapping("/filter/word")
	public Vector <FrontUser> getFilteredWord
	(@RequestParam Object word) {
		Object param2 = "";
		FilterWord obj = new FilterWord();
		return obj.filterVector(word, param2);
	}
	
	/** Risponde all richiesta GET /filter/less.
	 * @param max: limite massimo di numero di caratteri delle descrizioni.
	 * @return FrontDatabase: vettore contenente tutti i friends 
	 * con una descrizione avente numero di caratteri inferiori al parametro.
	 * @see it.SpringBootAPI.ADSProjectOOP.util.filters.FilterCharacterLess
	 */
	@GetMapping("/filter/less")
	public Vector <FrontUser> getFilteredLess
	(@RequestParam Object max) {
		Object param2 = "";
		FilterCharacterLess obj = new FilterCharacterLess();
		return obj.filterVector(max, param2);
	}
	
	/** Risponde all richiesta GET /filter/more.
	 * @param min: limite minimo di numero di caratteri delle descrizioni.
	 * @return FrontDatabase: vettore contenente tutti i friends 
	 * con una descrizione avente numero di caratteri maggiori del parametro.
	 * @see it.SpringBootAPI.ADSProjectOOP.util.filters.FilterCharacterMore
	 */
	@GetMapping("/filter/more")
	public Vector <FrontUser> getFilteredMore
	(@RequestParam Object min) {
		Object param2 = "";
		FilterCharacterMore obj = new FilterCharacterMore();
		return obj.filterVector(min, param2);
	}
	
	/** Risponde all richiesta GET /filter/between.
	 * @param min: limite minimo di numero di caratteri delle descrizioni.
	 * @param max: limite massimo di numero di caratteri delle descrizioni.
	 * @return FrontDatabase: vettore contenente tutti i friends 
	 * con una descrizione avente numero di caratteri maggiori di min e minori di max.
	 * @see it.SpringBootAPI.ADSProjectOOP.util.filters.FilterCharacterGap
	 */
	@GetMapping("/filter/between")
	public Vector <FrontUser> getFilteredGap
	(@RequestParam Object min, @RequestParam Object max) {
		FilterCharacterGap obj = new FilterCharacterGap();
		return obj.filterVector(min, max);
	}
}
