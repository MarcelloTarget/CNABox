package Page.MenuPedagógico;

import static qa.cnabox.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import qa.cnabox.core.BasePage;

public class MenuPedagogicoFiltrarSegundaChamadaPage extends BasePage {
	
	public void SetClicarMenu() throws InterruptedException {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(8) .menu-item span"));
		Thread.sleep(1200);
	}

	public void SetClicarSubMenu() throws InterruptedException {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(8) li:nth-of-type(10) span"));
		Thread.sleep(1200);
	}

	public void AguardaCarregarPagina() throws InterruptedException {
		Thread.sleep(1200);
		
	}
	
	public void DataInicio(String Data) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("#DataInicioPesquisa"));
		Thread.sleep(1000);
		escreveTexto(By.cssSelector("#DataInicioPesquisa"), Data);
		Thread.sleep(1000);
		
	}
	
	public void DataTermino(String Data) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("#DataTerminoPesquisa"));
		Thread.sleep(1000);
		escreveTexto(By.cssSelector("#DataTerminoPesquisa"), Data);
		Thread.sleep(1000);
		
	}
	
	public void SetSituacao(String IdSituacao) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector(".widget-body.no-padding.smart-form fieldset > .row:nth-child(1) [class='col col-6'] .select [data-val='true']"));
		Thread.sleep(1000);
		WebElement Situacao = getDriver().findElement(By.id(".widget-body.no-padding.smart-form fieldset > .row:nth-child(1) [class='col col-6'] .select [data-val='true']"));
		Select comboSituacao = new Select(Situacao);
		comboSituacao.selectByValue(IdSituacao);
		Thread.sleep(1000);
		
	}

	public void SetProfessor(String IdProfessor) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector(".widget-body.no-padding.smart-form fieldset > .row:nth-child(2) > [class='col col-6']:nth-child(1) .select [data-val='true']"));
		Thread.sleep(1000);
		WebElement Professor = getDriver().findElement(By.id(".widget-body.no-padding.smart-form fieldset > .row:nth-child(2) > [class='col col-6']:nth-child(1) .select [data-val='true']"));
		Select comboProfessor = new Select(Professor);
		comboProfessor.selectByValue(IdProfessor);
		Thread.sleep(1000);
		
	}
	
	public void EscreveNomeAluno(String NomeAluno) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("#NomeAluno"));
		Thread.sleep(1000);
		escreveTexto(By.cssSelector("#NomeAluno"), NomeAluno);
		Thread.sleep(1000);
		
	}
		
	public void BtnFIltrar() {
		
		clicarBotaoBy(By.cssSelector(".widget-body footer [type='button']:nth-of-type(1)"));
	}
	
	/***
	 * Executa rolagem da página. Exemplo: RolarPagina("scroll(0,650)");
	 * 
	 * @param rolagem
	 */
	public void RolarPaginaBaixo() {
		((JavascriptExecutor) getDriver()).executeScript("scroll(0,300)");
	}
}
