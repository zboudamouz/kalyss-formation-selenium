package ch.kalyss.formation.selenium;

import junit.framework.TestCase;

import com.thoughtworks.selenium.DefaultSelenium;

public class SeleniumTest extends TestCase {

	protected DefaultSelenium createSeleniumClient(String url) throws Exception {
        return new DefaultSelenium("localhost", 4444, "*firefox", url);
    }
    
    public void testBaseForm() throws Exception {
        DefaultSelenium selenium = createSeleniumClient("http://www.kalyss.com/site/");
        selenium.start();
        
        selenium.open("/");
        selenium.setSpeed("2000");
        assertTrue(selenium.isTextPresent("Accueil"));
        assertTrue(selenium.isTextPresent("Emploi"));

        selenium.stop();
    }
	
}
