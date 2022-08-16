package tests;

import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;
import pages.MenuPage;

public class OpcaoEscondidaTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	
	@Test
	public void deveEncontrarOpcaoEscondida() {
		menu.scrollDown();
		menu.clicarPorTexto("Opção bem escondida");
		Assert.assertEquals("Você achou essa opção", menu.obterMensagemAlerta());
		menu.clicarPorTexto("OK");
	}

}
