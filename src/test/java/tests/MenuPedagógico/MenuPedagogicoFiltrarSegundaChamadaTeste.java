package tests.MenuPedagógico;

import qa.cnabox.core.BaseTest;

import org.junit.Test;

import Page.MenuPedagógico.MenuPedagogicoFiltrarSegundaChamadaPage;

public class MenuPedagogicoFiltrarSegundaChamadaTeste extends BaseTest {
	
	MenuPedagogicoFiltrarSegundaChamadaPage page = new MenuPedagogicoFiltrarSegundaChamadaPage();
	
	@Test
	
	public void DeveFiltrarSegundaChamada() throws InterruptedException {
		
		page.SetClicarMenu();
		page.RolarPaginaBaixo();
		page.SetClicarSubMenu();
		//page.DataInicio("19102018");
		//page.DataTermino("01122018");
		//page.SetSituacao("1");
		//page.SetProfessor("Todos");
		//page.EscreveNomeAluno("Teste");
		page.BtnFIltrar();
	}

}
