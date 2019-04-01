package tests.GerarContratosFormaPGPersonalizado;
import qa.cnabox.core.BaseTest;
import org.junit.Test;
import Page.GerarContratosFormaPGPersonalizado.ProcessoMatriculaPGBoletoPage;;

public class ProcessoMatriculaPGBoletoTest extends BaseTest {
		
		ProcessoMatriculaPGBoletoPage page = new ProcessoMatriculaPGBoletoPage();
		
		//*********************************************************Cadastro de Prospect**************************************************************//

		@Test
		public void DeveCadastrarNovoProspect() throws InterruptedException {
			
			//// Cadastrar Aluno////
			page.SetClicarMenu();
			page.Tempo(4000);
			page.SetClicarSubMenu();
			page.Tempo(4000);
			page.SetClicarCadastrarProspect();
			page.Tempo(4000);
			page.SetEscreveNomeAluno();
			page.Tempo(2000);
			page.SetEscreveEmail();
			page.Tempo(2000);
			page.ClicarCampoAtendimento();
			page.Tempo(4000);
			page.ClicarCampoDescri��o();
			page.Tempo(2000);
			page.SetSexoMasculino();
			page.Tempo(2000);
			page.SetDataNascimento(" 14111986 ");
			page.Tempo(2000);
			page.SetEstadoCivil("3");
			page.Tempo(2000);
			page.RolarPaginaPageDown();
			page.SetTelefoneFixo(" 11345499472 ");
			page.SetTelefoneCelular(" 11997499671 ");
			page.RolarPaginaPageDown();
			page.Tempo(4000);
			page.ClicarCampoCep();
			page.Tempo(2000);
			page.SetCep("18045520");
			page.Tempo(4000);
			page.SetNumeroResidencia("120");
			page.Tempo(4000);
			page.RolarPaginaPageDown();
			page.Tempo(4000);
			page.SetSelecionarIdioma();
			page.Tempo(4000);
			page.SetSelecionarEstagio("20");
			page.SetSelecionarHorario();
			page.Tempo(4000);
			page.BuscaCPF();
			page.Tempo(5000);
			page.RolarPaginaPageDown();
			page.Tempo(3000);
			page.SetSelecionarMidia("41");
			page.Tempo(3000);
			page.SetSelecionarCampanha("9");
			page.Tempo(3000);
			page.SetoRolarCimaSemPageUP();
			page.Tempo(3000);
			page.SetoRolarCimaSemPageUP();
			page.Tempo(3000);
			page.ClicarMatricula();
			page.Tempo(3000);
			page.ClicarSalvar();
			
		//////// Passo 1 da matricula////
			page.Tempo(5000);
			page.RolarPagina();
			page.Tempo(4000);
			
			
			page.RolarPaginaPageDown2();
			page.Tempo(4000);
			page.ClicarProximoPasso1();
			
			////// Passo 2 da matricula////
			page.Tempo(4000);
			page.RolarPagina();
			page.Tempo(3000);
			page.RolarPagina();
			///// Passo 3 da matricula///	
			page.SetProximo3();
			page.Tempo(3000);
			
			//// legenda de Cuso = 4-Adulto, 6-especializa��o, 2-infantil, 3-Pr�-adolescente, 5-professional, 17- Seniors///
			page.Tempo(3000);
			page.SetCurso("4");
			page.Tempo(3000);
			// Legenda de modalidade= 1 Extensivo, 2 intensivo, 3 plus////
			
			page.SetEstagio("2078");
			page.Tempo(2000);
			page.SetModalidade("1");
			page.Tempo(2000);
			page.SetProximoestagio("1");
			page.Tempo(2000);
			
			
			page.RolarPagina();
			page.Tempo(2000);
			page.Setproximopasso();
			
			////Passo 4 da matricula//////
			page.Tempo(4000);
			page.RolarPagina();
			page.Tempo(2000);
			page.SetFormadePG();
			page.Tempo(2000);
			page.SetAdicionarParcelas(); 
			page.Tempo(2000);
			page.SetCondicao("3");
			page.Tempo(2000);
			page.Setdata("01102018");
			page.Tempo(2000);
			page.SetFormaDePagamento("6");
			page.Tempo(2000);
			page.Setresponsavel();
			page.RolarPagina();
			page.Tempo(3000);
			page.SetEstagioLancamento();
			page.Tempo(3000);
			page.SetQuantidadedeparcelas();
			page.Tempo(3000);
			page.SetClicar();
			page.Tempo(3000);
			page.SetAdicionar();
			page.Tempo(3000);
			page.SetAdicionarParcelas();
			page.Tempo(1000);
			page.SetCondicao("3");
			page.Tempo(1000);
			page.Setdata("01042019");
			page.Tempo(2000);
			page.SetFormaDePagamento("6");
			page.Tempo(2000);
			page.Setresponsavel();
			page.Tempo(1000);
			page.SetEstagioLancamento2();
			page.Tempo(1000);
			page.SetQuantidadedeparcelas();
			page.SetClicar();
			page.SetAdicionar();
			page.Tempo(5000);
			page.RolarPaginaPageDown();
			page.Tempo(2000);
			page.Ajustarparcela();
			page.Tempo(2000);
			page.RolarPagina();
			page.Tempo(3000);
			page.Ajustarparcelalancamento();
			page.Tempo(2000);
			page.PageUp();
			page.Tempo(2000);
			page.Adicionarajuste();
			page.Tempo(2000);
			page.PageUp();
	//////// Material//////////////		
			page.Tempo(2000);
			page.SetLancarmaterial();
			page.Tempo(2000);
			page.SetAdicionarparcelaMate();
			page.Tempo(1000);
			page.SetAdicionarcondicaomaterial("2");
			page.Tempo(3000);
			page.Setdatamaterial("01102018");
			page.Tempo(1000);
			page.SetAdicionarformadepagamentoMD("6");
			page.Tempo(2000);
			page.SetresponsavelMD();
			page.Tempo(2000);
			page.SetValordaparcela();
			page.Tempo(2000);
			page.Setquantidadeparcela();
			page.Tempo(2000);
			page.SetAdicionarMD();
			page.Tempo(2000);
			page.RolarPaginaPageDown();
			page.Tempo(1000);
			page.Ajustarparcelamaterial();
			page.Tempo(200);
			page.Ajustarparcelamaterial2();
			page.Tempo(2000);
			page.proximopassofinal();
			page.Tempo(2000);
			page.Concluircontratodown();
			page.Tempo(2000);
			page.Concluircontrato();
			page.Tempo(3000);
			
		}
	}


