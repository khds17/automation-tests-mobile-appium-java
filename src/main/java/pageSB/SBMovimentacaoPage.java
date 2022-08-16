package pageSB;

import org.openqa.selenium.By;

import core.BasePage;

public class SBMovimentacaoPage extends BasePage {
	
	public void salvar() {
		clicarPorTexto("SALVAR");
	}
	
	public void setDescricao(String valor) {
		escrever(By.className("android.widget.EditText"), valor);
	}
	
	public void setInteressado(String valor) {
		escrever(By.xpath("//android.widget.EditText[2]"), valor);
	}
	
	public void setValor(String valor) {
		escrever(By.xpath("//android.widget.EditText[3]"), valor);
	}
	
	public void setConta(String valor) {
		selecionarCombo(By.xpath("//android.widget.Spinner[2]"), valor);
	}

}
