package Page.MenuPedagógico;

import qa.cnabox.core.BasePage;

import static qa.cnabox.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MenuPedagogicoFiltrarValidacaoDeTransferenciaDeTurmaPage extends BasePage {

	public void SetClicarMenu() throws InterruptedException {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(8) .menu-item span"));
		Thread.sleep(1200);
	}

	public void SetClicarSubMenu() throws InterruptedException {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(8) li:nth-of-type(14) span"));
		Thread.sleep(1200);
	}

	public void AguardaCarregarPagina() throws InterruptedException {
		Thread.sleep(1200);
	}
	
	public void EscreveNomeAluno(String NomeAluno) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("[name='NomeAluno']"));
		escreveTexto(By.cssSelector("[name='NomeAluno']"), NomeAluno);
		Thread.sleep(1000);
	}
	
	public void SetSituacao(String IdSituacao) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("#StatusSolicitacaoId"));
		Thread.sleep(1000);
		WebElement Situacao = getDriver().findElement(By.id("#StatusSolicitacaoId"));
		Select comboSituacao = new Select(Situacao);
		comboSituacao.selectByValue(IdSituacao);
		Thread.sleep(1000);
	}
	
	public void SetTurmaAtual(String IdTurmaAtual) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("#TurmaId"));
		Thread.sleep(1000);
		WebElement TurmaAtual = getDriver().findElement(By.id("#TurmaId"));
		Select comboTurmaAtual = new Select(TurmaAtual);
		comboTurmaAtual.selectByValue(IdTurmaAtual);
		Thread.sleep(1000);
	}
	
	public void SetTurmaDestino(String IdTurmaDestino) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("#NovaTurmaId"));
		Thread.sleep(1000);
		WebElement TurmaDestino = getDriver().findElement(By.id("#NovaTurmaId"));
		Select comboTurmaDestino = new Select(TurmaDestino);
		comboTurmaDestino.selectByValue(IdTurmaDestino);
		Thread.sleep(1000);
	}
	
	public void BtnFiltrar() {
		
		clicarBotaoBy(By.cssSelector("#btnSolicitacaoTransferenciaTurmaFilter"));
	}
}
