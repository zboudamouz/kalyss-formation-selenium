package ch.kalyss.formation.selenium;

import com.thoughtworks.selenium.SeleneseTestCase;

public class SeleniumTest extends SeleneseTestCase {

	/** {@inheritDoc} */
	@Override
	public void setUp() throws Exception {
		setUp("http://www.netapsys.fr"); // délégation de la configuration à la classe parente
	}

	/** Ouvre la page et vérifie que le texte est bien présent. */
	public void test() {
		selenium.open("/"); // ouverture de la page
		assertTrue(selenium.isTextPresent("Netapsys"));
	}
	
}
