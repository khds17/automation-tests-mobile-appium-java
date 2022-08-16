package tests;

import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;
import pages.DragDropPage;
import pages.MenuPage;

public class DragDropTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private DragDropPage page = new DragDropPage();
	
	private String[] estadoInicial = new String[]{"Esta", "é uma lista", "Drag em Drop!", "Faça um clique longo,", "e arraste para", "qualquer local desejado."};
	private String[] estadoIntermediario = new String[]{"é uma lista", "Drag em Drop!", "Faça um clique longo,", "e arraste para", "Esta", "qualquer local desejado."};
	private String[] estadoFim = new String[]{"Faça um clique longo,", "é uma lista", "Drag em Drop!", "e arraste para", "Esta", "qualquer local desejado."};

	
	@Test
	public void deveEfetuarDragDrop() {
		menu.acessarDragDrop();
		esperar(1000);
		Assert.assertArrayEquals(estadoInicial, page.obterLista());
		page.arrastar("Esta", "e arraste para");
		esperar(3000);
		Assert.assertArrayEquals(estadoIntermediario, page.obterLista());
		page.arrastar("Faça um clique longo,", "é uma lista");
		Assert.assertArrayEquals(estadoFim, page.obterLista());
	}

}
