package it.SpringBootAPI.ADSProjectOOP;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import it.SpringBootAPI.ADSProjectOOP.exceptions.*;
import it.SpringBootAPI.ADSProjectOOP.controller.*;

/**<b>Test: </b><br><br>
 * Questa classe effettua i test su alcune eccezioni personalizzate 
 * scaturite da un errore nell'inserimento del tipo di parametri in alcuni filter.
 * @author Giordano Angelini
 * @author Di Silvestre Cristian
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AdsProjectOopApplicationTests {
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	public void contextLoads() {

		Controller controller = new Controller();
		assertThrows(FilterException.class, ()-> controller.getFilteredMore("text") );
		assertThrows(FilterException.class, ()-> controller.getFilteredLess("text") );
		assertThrows(FilterException.class, ()-> controller.getFilteredGap("text", "text") );
	}

}