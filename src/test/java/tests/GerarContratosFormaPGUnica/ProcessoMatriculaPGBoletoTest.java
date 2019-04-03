package tests.GerarContratosFormaPGUnica;

import qa.cnabox.core.BaseTest;

import org.junit.Test;

import Page.GerarContratosFormaPGUnica.ProcessoMatriculaPGBoletoPage;;

public class ProcessoMatriculaPGBoletoTest extends BaseTest {
	
	ProcessoMatriculaPGBoletoPage page = new ProcessoMatriculaPGBoletoPage();
	
	//*********************************************************Cadastro de Prospect**************************************************************//

	@Test
	public void DeveCadastrarNovoProspect() throws InterruptedException {
		
		//// Cadastrar Aluno////
		page.Tempo(4000);
		page.SetClicarMenu();
		page.Tempo(2000);
		page.SetClicarSubMenu();
		page.Tempo(2000);
		page.SetClicarCadastrarProspect();
		page.Tempo(7000);
		page.SetEscreveNomeAluno();
		page.Tempo(2000);
		page.SetEscreveEmail();
		page.ClicarCampoAtendimento();
		page.Tempo(2000);
		page.ClicarCampoDescrição();
		page.SetSexoMasculino();
		page.Tempo(2000);
		page.SetDataNascimento(" 14111986");
		page.SetEstadoCivil("3");
		page.RolarPaginaPageDown();
		page.SetTelefoneFixo(" 11345499472 ");
		page.SetTelefoneCelular(" 11997499671 ");
		page.Tempo(2000);
		page.ClicarCampoCep();
		page.SetCep("18045520");
		page.Tempo(2000);
		page.SetNumeroResidencia("120");
		page.Tempo(2000);
		page.RolarPaginaPageDown();
		page.Tempo(2000);
		page.SetSelecionarIdioma();
		page.Tempo(2000);
		page.RolarPaginaPageDown();
		page.Tempo(2000);
		page.SetSelecionarHorario();
		page.Tempo(2000);
//		page.BuscaCPF();
		page.setCPF();
		page.Tempo(2000);
		page.RolarPaginaPageDown();
		page.Tempo(3000);
		page.SetSelecionarMidia("41");
		page.Tempo(2000);
		page.SetSelecionarCampanha("9");
		page.Tempo(2000);
		page.scrollPageTop();
		page.ClicarMatricula();
		page.Tempo(2000);
		page.sendPageDown();
		page.Tempo(2000);
		page.ClicarSalvar();
		
	//////// Passo 1 da matricula////
		page.Tempo(6000);
		page.scrollPageEnd();
		page.Tempo(3000);
		page.ClicarProximoPasso1();
		
		////// Passo 2 da matricula////
		page.Tempo(5000);
		page.scrollPageEnd();
		page.Tempo(2000);
		page.SetProximo3();
		
		///// Passo 3 da matricula///	
		page.Tempo(5000);
		page.SetCurso("4");
		page.sendTab();
		page.Tempo(1000);
		page.sendTab();
		page.sendPageDown();
		//// legenda de estágios = 2078-Basico, 2066-Yong, 2062-Pre-School, 2070-Kids, 2074-TEENS, 2088-Fast///
		page.SetEstagio("2078");
		// Legenda de modalidade= 1 Extensivo, 2 intensivo, 3 plus////
		page.Setmodalidade("1");
		page.Tempo(2000);
		page.SetProximoestagio("1");
		page.Tempo(2000);
		page.RolarPagina();
		page.Tempo(2000);
		page.Setproximopasso();
		
		////Passo 4 da matricula//////
		page.Tempo(4000);
		page.RolarPagina();
		page.Tempo(1000);
		page.SetFormadePG("6");
		page.Tempo(1000);
		page.SetParcelas("12");
		page.Tempo(1000);
		page.Setdata("01102019");
		page.Tempo(1000);
		page.Setproximopassofinal();
		
		//// Passo 5 da matricula ////
		page.Tempo(6000);
		page.scrollPageEnd();
		page.Tempo(2000);
		page.SetTemplante();
		page.Tempo(2000);
		page.SetConcluir();
		
	}
}
