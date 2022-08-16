package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import core.BaseTest;
import pages.MenuPage;
import pages.SwipeListPage;

public class SwipeListTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private SwipeListPage page = new SwipeListPage();
	
	@Test
	public void desafio() {
		esperar(2000);
		menu.acessarSwipeList();
		page.swipeElementRight("Opção 1");
		page.clicarPorTexto("(-)");
		assertTrue(page.existeElementoPorTexto("Opção 1 (-)"));
		page.swipeElementRight("Opção 4");
		page.clicarPorTexto("(-)");
		assertTrue(page.existeElementoPorTexto("Opção 4 (-)"));
	}

}
