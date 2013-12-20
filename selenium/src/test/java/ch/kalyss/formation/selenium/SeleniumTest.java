package ch.kalyss.formation.selenium;

import com.thoughtworks.selenium.SeleneseTestCase;

public class SeleniumTest extends SeleneseTestCase {

	/** {@inheritDoc} */
	@Override
	public void setUp() throws Exception {
		setUp("http://www.netapsys.fr"); // d�l�gation de la configuration � la classe parente
	}

	/** Ouvre la page et v�rifie que le texte est bien pr�sent. */
	public void test() {
		selenium.open("/"); // ouverture de la page
		assertTrue(selenium.isTextPresent("Netapsys"));
	}
	
}
