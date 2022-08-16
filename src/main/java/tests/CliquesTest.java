package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import core.BaseTest;
import pages.CliquesPage;
import pages.MenuPage;

public class CliquesTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private CliquesPage page = new CliquesPage();
	
	@Before
	public void setup() {
		menu.acessarCliques();
	}
	
	@Test
	public void deveRealizarCliqueLongo() {
		page.cliqueLongo();
		Assert.assertEquals("Clique Longo", page.obterTextoCampo());
	}
	
	@Test 
	public void deveRealizarCliqueDuplo() {
		page.clicarPorTexto("Clique duplo");
		page.clicarPorTexto("Clique duplo");
		
		Assert.assertEquals("Duplo Clique", page.obterTextoCampo());
	}

}
