package tests;

import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;
import pages.MenuPage;
import pages.SplashPage;

public class SplashTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private SplashPage page = new SplashPage();
	
	@Test
	public void deveAguardarSplashSumir() {
		menu.acessarSplash();
		page.telaSplashVisivel();
		page.aguardarSplashSumir();
		Assert.assertTrue(page.existeElementoPorTexto("Formulário"));
	}

}
