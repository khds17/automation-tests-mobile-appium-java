package pages;

import core.BasePage;

public class AbasPage extends BasePage {
	
	public boolean existeAbaUm() {
		return existeElementoPorTexto("Este é o conteúdo da Aba 1");
	}
	
	public boolean existeAbaDois() {
		return existeElementoPorTexto("Este é o conteúdo da Aba 2");
	}
	
	public void acessarAbaDois() {
		clicarPorTexto("ABA 2");
	}
}
