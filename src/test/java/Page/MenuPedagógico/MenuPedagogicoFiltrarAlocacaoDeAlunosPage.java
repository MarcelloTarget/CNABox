package Page.MenuPedagógico;

import static qa.cnabox.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import qa.cnabox.core.BasePage;

public class MenuPedagogicoFiltrarAlocacaoDeAlunosPage extends BasePage {

	public void SetClicarMenu() throws InterruptedException {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(8) .menu-item span"));
		Thread.sleep(1200);
	}

	public void SetClicarSubMenu() throws InterruptedException {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(8) li:nth-of-type(13) span"));
		Thread.sleep(1200);
	}

	public void AguardaCarregarPagina() throws InterruptedException {
		Thread.sleep(1200);
	}
	
	public void EscreveNomeAluno(String NomeAluno) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("[name='NomeAluno']"));
		escreveTexto(By.cssSelector("[name='NomeAluno']"), NomeAluno);
		
	}
	
	public void SetSituacaoAlocacao(String IdSituacao) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("#StatusSolicitacaoId"));
		Thread.sleep(1000);
		WebElement Situacao = getDriver().findElement(By.id("#StatusSolicitacaoId"));
		Select comboSituacao = new Select(Situacao);
		comboSituacao.selectByValue(IdSituacao);
		Thread.sleep(1000);
	}
	
	public void SetTurmaDestino(String IdTurma) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("#TurmaId"));
		Thread.sleep(1000);
		WebElement Turma = getDriver().findElement(By.id("#TurmaId"));
		Select comboTurma = new Select(Turma);
		comboTurma.selectByValue(IdTurma);
		Thread.sleep(1000);
	}
	
	public void BtnFiltrar() {
		
		clicarBotaoBy(By.cssSelector("#btnSolicitacaoAlocacaoAlunoFilter"));
		
	}
	
}
