package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import core.BaseTest;
import pages.AlertaPage;
import pages.MenuPage;

public class AlertTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private AlertaPage page = new AlertaPage();
	
	@Before
	public void setup() {
		menu.acessarAlertas();
	}
	
	@Test
	public void deveConfirmarAlerta() {
		page.clicarAlertarConfirm();
		assertEquals("Info", page.obterTituloAlerta());
		assertEquals("Confirma a operação?", page.obterMensagemAlerta());
		page.confirmar();
		assertEquals("Confirmado", page.obterMensagemAlerta());
		page.sair();
	}
	
	@Test
	public void deveClicarForaAlerta() {
		page.clicarAlertarSimples();
		esperar(1000);
		page.clicarForaCaixa();
		Assert.assertFalse(page.existeElementoPorTexto("Pode clicar no OK ou fora da caixa para sair"));
	}
}
