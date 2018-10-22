package tests.MenuPedagógico;

import qa.cnabox.core.BaseTest;
import org.junit.Test;

import Page.MenuPedagógico.MenuPedagogicoFiltrarAlocacaoDeAlunosPage;


public class MenuPedagogicoAlocacaoFiltrarDeAlunosTeste extends BaseTest {

	 MenuPedagogicoFiltrarAlocacaoDeAlunosPage page = new  MenuPedagogicoFiltrarAlocacaoDeAlunosPage();
	 
	 @Test
	 
	 public void DeveFiltrarAlunoAutorizacaoDeAlocacao() throws InterruptedException {
		 
		 page.SetClicarMenu();
		 page.SetClicarSubMenu();
		 page.EscreveNomeAluno("Gabriel Santos Cordeiro");
		 page.SetSituacaoAlocacao("3");
		 page.SetTurmaDestino("Todos");
		 page.BtnFiltrar();
	 }
	 
	
}
