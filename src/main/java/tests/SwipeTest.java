package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import core.BaseTest;
import pages.MenuPage;

public class SwipeTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();

	@Test
	public void deveRealizarSwipe() {
		menu.acessarSwipe();
		assertTrue(menu.existeElementoPorTexto("a esquerda"));
		menu.swipeRight();
		assertTrue(menu.existeElementoPorTexto("E veja se"));
		menu.swipeRight();
		assertTrue(menu.existeElementoPorTexto("Chegar até o fim!"));
		menu.swipeLeft();
		menu.swipeLeft();
		assertTrue(menu.existeElementoPorTexto("a esquerda"));
	}
}
