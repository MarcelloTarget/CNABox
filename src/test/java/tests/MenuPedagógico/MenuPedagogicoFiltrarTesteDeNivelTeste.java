package tests.MenuPedagógico;

import qa.cnabox.core.BaseTest;
import org.junit.Test;

import Page.MenuPedagógico.MenuPedagogicoFiltrarTesteDeNivelPage;

public class MenuPedagogicoFiltrarTesteDeNivelTeste extends BaseTest {
	
	MenuPedagogicoFiltrarTesteDeNivelPage page = new MenuPedagogicoFiltrarTesteDeNivelPage();
	
	@Test
	
	public void DeveFiltrarTesteDeNivel() throws InterruptedException {
		
		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.EscreveNomeAluno("Abilio");
		page.DataRealizacaoInicio("01012018");
		page.DataRealizacaoTermino("31122018");
		page.SetSituacaoTesteDeNivel("1");
		page.SetIdioma("1");
		page.SetCurso("4");
		page.SetNivel("7");
		page.SetEstagio("TODOS");
		page.BtnFiltrar();
		
	}	
}