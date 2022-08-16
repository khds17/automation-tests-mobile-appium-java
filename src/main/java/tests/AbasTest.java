package tests;

import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;
import pages.AbasPage;
import pages.MenuPage;

public class AbasTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private AbasPage page = new AbasPage();

	@Test
	public void deveInteragirComAbas() {
		menu.acessarAbas();
		Assert.assertTrue(page.existeAbaUm());
		page.acessarAbaDois();
		Assert.assertTrue(page.existeAbaDois());
	}
}
