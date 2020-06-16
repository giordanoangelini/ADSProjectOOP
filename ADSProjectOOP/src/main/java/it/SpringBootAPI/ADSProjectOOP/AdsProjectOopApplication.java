package it.SpringBootAPI.ADSProjectOOP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** <b>Main App: </b><br><br>
 * All'avvio effettua il download del dataset e avvia l'applicazione Spring.
 * @author Giordano Angelini
 * @author Cristian Di Silvestre
*/
@SpringBootApplication
public class AdsProjectOopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdsProjectOopApplication.class, args);
	}
}