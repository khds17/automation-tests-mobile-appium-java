package tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Test;

import core.BaseTest;
import pages.MenuPage;
import pages.WebViewPage;

public class WebViewTest extends BaseTest{
	
	private MenuPage menu = new MenuPage();
	private WebViewPage page = new WebViewPage();
	
	@Test
	public void deveFazerLogin() {
		menu.acessarSeuBarrigaHibrido();
		esperar(3000);
		page.entrarContextoWeb();
		page.setEmail("khds2013@gmail.com");
		page.setSenha("102030");
		page.entrar();
		assertEquals("Bem vindo, Kauan", page.getMessagem());		
	}
	
	@After
	public void tearDown() {
		page.sairContextoWeb();
	}

}
