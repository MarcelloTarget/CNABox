package tests.MenuPedagógico;

import qa.cnabox.core.BaseTest;
import org.junit.Test;

import Page.MenuPedagógico.MenuPedagogicoFiltrarTurmasPage;

public class MenuPedagogicoFiltrarTurmaTeste extends BaseTest {
	
	MenuPedagogicoFiltrarTurmasPage page = new MenuPedagogicoFiltrarTurmasPage();
	
	@Test
	
	
	public void DeveFiltrarTurma() throws InterruptedException{
		
		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.SetProfessor("Todos");
		page.SetMadrinha("Todos");
		page.SetIdioma("1");
		page.SetCurso("4");
		page.SetNivel("7");
		page.SetEstagio("TODOS");
		page.SetSituacaoo("1");
		page.BtnFiltrar();
	}
	

}
