package tests.MenuFinanceiro;
import org.junit.Test;
import Page.MenuFinanceiro.MenuFinanceiroAntecipacaodeRecebivel;
import qa.cnabox.core.BaseTest;

public class MenuFinanceiroAnecipacaoRecebivelTest  extends BaseTest {

	MenuFinanceiroAntecipacaodeRecebivel page = new MenuFinanceiroAntecipacaodeRecebivel();
	@Test
	
	public void MenuFinanceiroAntecipacaodeRecebivel() throws InterruptedException { 

		page.SetclicarMenuFinanceiro();
		page.SetclicarMenuAntecipacaorecebiveis();
		page.ClicaremNovaOperação();
		page.ClicarTipo("2");
		page.SelecionarOperacao("False");
		page.ClicarOperadora();
		page.clicarfiltrar();
		page.Setclicarnasparcelas();
		page.SetSelecionarcontaCreditada("1016");
		page.RolarPaginaPageDown();
		page.clicarbotaorodape();
		page.RolarPaginaPageDown();
		
	}
}
