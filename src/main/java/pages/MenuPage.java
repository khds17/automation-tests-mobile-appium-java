package pages;

import core.BasePage;

public class MenuPage extends BasePage{
			
	public void acessarFormulario() {
		clicarPorTexto("Formulário");
	}
	
	public void acessarAlertas() {
		clicarPorTexto("Alertas");
	}
	
	public void acessarSplash() {
		clicarPorTexto("Splash");
	}
	
	public void acessarAbas() {
		clicarPorTexto("Abas");
	}
	
	public void acessarAccordion() {
		clicarPorTexto("Accordion");
	}	
	
	public void acessarCliques() {
		clicarPorTexto("Cliques");
	}
	
	public void acessarSwipe() {
		clicarPorTexto("Swipe");
	}
	
	public void acessarSwipeList() {
		scrollDown();
		clicarPorTexto("Swipe List");
	}
	
	public void acessarDragDrop() {
		scrollDown();
		clicarPorTexto("Drag and drop");
	}
	
	public void acessarSeuBarrigaHibrido() {
		clicarPorTexto("SeuBarriga Híbrido");
	}
	
	public void acessarSBNativo() {
		clicarPorTexto("SeuBarriga Nativo");
	}

}
