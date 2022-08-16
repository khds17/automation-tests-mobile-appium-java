package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import core.BaseTest;
import pageSB.SBContasPage;
import pageSB.SBHomePage;
import pageSB.SBLoginPage;
import pageSB.SBMenuPage;
import pageSB.SBMovimentacaoPage;
import pageSB.SBResumoPage;
import pages.MenuPage;

public class SBTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private SBLoginPage login = new SBLoginPage();
	private SBMenuPage menuSB = new SBMenuPage();
	private SBContasPage contas = new SBContasPage();
	private SBMovimentacaoPage mov = new SBMovimentacaoPage();
	private SBHomePage home = new SBHomePage();
	private SBResumoPage resumo = new SBResumoPage();
	
	@Before
	public void setup() {
		menu.acessarSBNativo();
		login.setEmail("khds2013@gmail.com");
		login.setSenha("102030");
		login.entrar();		
	}
	
	@Test
	public void deveInserirConta() {
		menuSB.acessarContas();
		contas.setConta("Conta de teste");
		contas.salvar();
		
		assertTrue(contas.existeElementoPorTexto("Conta adicionada com sucesso"));
	}
	
	@Test
	public void deveExcluirConta() {
		menuSB.acessarContas();
		contas.clicarLongo();
		contas.excluir();
		
		assertTrue(contas.existeElementoPorTexto("Conta excluída com sucesso"));
	}
	
	@Test
	public void deveValidarInclusaoMov() {
		menuSB.acessarMovimentacoes();
		
		mov.salvar();
		assertTrue(mov.existeElementoPorTexto("Descrição é um campo obrigatório"));
		
		mov.setDescricao("Descrição");
		mov.salvar();
		assertTrue(mov.existeElementoPorTexto("Interessado é um campo obrigatório"));
		
		mov.setInteressado("Interessado");
		mov.salvar();
		assertTrue(mov.existeElementoPorTexto("Valor é um campo obrigatório"));
		
		mov.setValor("17");
		mov.salvar();
		assertTrue(mov.existeElementoPorTexto("Conta é um campo obrigatório"));
		
		mov.setConta("Conta com movimentacao");
		mov.salvar();
		assertTrue(mov.existeElementoPorTexto("Movimentação cadastrada com sucesso"));
				
	}
	
	@Test
	public void deveAtualizarSaldoAoExcluirMovimentacao() {
		assertEquals("534.00", home.obterSaldoConta("Conta para saldo"));
		menuSB.acessarResumo();
		resumo.excluirMovimentacao("Movimentacao 3, calculo saldo");
		assertTrue(resumo.existeElementoPorTexto("Movimentação removida com sucesso!"));
		menuSB.acessarHome();
		esperar(1000);
		home.scroll(0.2, 0.9);
		assertEquals("-1000.00", home.obterSaldoConta("Conta para saldo"));		
	}

}
