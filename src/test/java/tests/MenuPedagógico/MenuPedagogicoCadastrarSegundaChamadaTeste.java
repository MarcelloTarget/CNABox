package tests.MenuPedagógico;

import org.junit.Test;

import Page.MenuPedagógico.MenuPedagogicoCadastrarSegundaChamadaPage;
import qa.cnabox.core.BaseTest;


public class MenuPedagogicoCadastrarSegundaChamadaTeste extends BaseTest {
	
	MenuPedagogicoCadastrarSegundaChamadaPage page = new MenuPedagogicoCadastrarSegundaChamadaPage();
	
	@Test
	
	public void DeveCadastrarNovaSegundaChamada() throws InterruptedException {
		
		page.SetClicarMenu();
		page.RolarPaginaBaixo();
		page.SetClicarSubMenu();
		page.AguardaCarregarPagina();
		page.BtnCadastrarSegChamada();
		page.SetIdioma("1");
		page.SetTipoAvaliacao("1");
		//***Verificar datas disponíveis e informar no page abaixo***
		page.SetData("19102018");
		//***Verificar horários de início e fim disponíveis e informar nos pages abaixo***
		page.SetHorarioInicio("1200");
		page.SetHorarioTermino("1400");
		page.EscreveDescricao("Teste");
		page.BtnProximo();
		page.AguardaCarregarPagina();
		page.SetSala();
		page.SetProfessor();
		page.RolarPagina();
		//page.BtnSalvar();
		
		
		
		
	}
	

}
