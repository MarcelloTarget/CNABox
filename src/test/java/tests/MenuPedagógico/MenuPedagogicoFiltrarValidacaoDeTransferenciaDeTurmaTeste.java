package tests.MenuPedag�gico;

import org.junit.Test;

import Page.MenuPedag�gico.MenuPedagogicoFiltrarValidacaoDeTransferenciaDeTurmaPage;
import qa.cnabox.core.BaseTest;

public class MenuPedagogicoFiltrarValidacaoDeTransferenciaDeTurmaTeste extends BaseTest {

	MenuPedagogicoFiltrarValidacaoDeTransferenciaDeTurmaPage page = new MenuPedagogicoFiltrarValidacaoDeTransferenciaDeTurmaPage();
	
	@Test
	
	public void DeveFiltrarTransferenciaDeTurma() throws InterruptedException {
		
		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.EscreveNomeAluno("Ana Caroline");
		page.SetTurmaAtual("Todos");
		page.SetTurmaDestino("Todos");
		page.BtnFiltrar();
		
	}
	
	
	
}
