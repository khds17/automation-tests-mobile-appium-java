package pages;

import core.BasePage;

public class AlertaPage extends BasePage {
	
	public void clicarAlertarConfirm() {
		clicarPorTexto("ALERTA CONFIRM");
	}
	
	public void clicarAlertarSimples() {
		clicarPorTexto("ALERTA SIMPLES");
	}
	
	public void clicarAlertarRestritivo() {
		clicarPorTexto("ALERTA RESTRITIVO");
	}
	
	public void confirmar() {
		clicarPorTexto("CONFIRMAR");
	}
	
	public void sair() {
		clicarPorTexto("SAIR");
	}

	public void clicarForaCaixa() {
		tap(100, 150);
	}
	
}
