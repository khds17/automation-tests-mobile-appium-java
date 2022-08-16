package tests;

import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;
import pages.AccordionPage;
import pages.MenuPage;

public class AccordionTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private AccordionPage page = new AccordionPage();
	
	@Test
	public void deveInteragirComAccordion() {
		menu.acessarAccordion();
		page.selecionarOp1();
		esperar(1000);
		Assert.assertEquals("Esta é a descrição da opção 1", page.obterValorOp1());
	}

}
