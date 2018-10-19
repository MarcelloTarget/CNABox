package Page.MenuPedagógico;

import static qa.cnabox.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import qa.cnabox.core.BasePage;

public class MenuPedagogicoFiltrarTesteDeNivelPage extends BasePage {

	public void SetClicarMenu() throws InterruptedException {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(8) .menu-item span"));
		Thread.sleep(1200);
	}

	public void SetClicarSubMenu() throws InterruptedException {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(8) li:nth-of-type(11) span"));
		Thread.sleep(1200);
	}

	public void AguardaCarregarPagina() throws InterruptedException {
		Thread.sleep(1200);
	}
	
	public void EscreveNomeAluno(String NomeAluno) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("#Nome"));
		Thread.sleep(1000);
		escreveTexto(By.cssSelector("#Nome"), NomeAluno);
		
	}
	
	public void DataRealizacaoInicio(String Data) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("#DataInicio"));
		Thread.sleep(1000);
		escreveTexto(By.cssSelector("#DataInicio"), Data);
	}
	
	public void DataRealizacaoTermino(String Data) throws InterruptedException {
	
	clicarBotaoBy(By.cssSelector("#DataFim"));
	Thread.sleep(1000);
	escreveTexto(By.cssSelector("#DataFim"), Data);
	
	}
	
	public void SetSituacaoTesteDeNivel(String IdSituacao) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("#order-form fieldset > .row:nth-child(1) > [class='col col-3']:nth-child(4) .select [data-val='true']"));
		Thread.sleep(1000);
		WebElement StatusTesteNivel = getDriver().findElement(By.id("#order-form fieldset > .row:nth-child(1) > [class='col col-3']:nth-child(4) .select [data-val='true']"));
		Select comboSituacaoTesteNivel = new Select(StatusTesteNivel);
		comboSituacaoTesteNivel.selectByValue(IdSituacao);
		Thread.sleep(1000);
	}
	
	public void SetIdioma(String IdIdioma) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("[name='IdiomaId']"));
		Thread.sleep(1000);
		WebElement Idioma = getDriver().findElement(By.id("[name='IdiomaId']"));
		Select comboIdioma = new Select(Idioma);
		comboIdioma.selectByValue(IdIdioma);
		Thread.sleep(1000);
		
	}
	
	public void SetCurso(String IdCurso) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("[name='CursoId']"));
		Thread.sleep(1000);
		WebElement Curso = getDriver().findElement(By.id("[name='CursoId']"));
		Select comboCurso = new Select(Curso);
		comboCurso.selectByValue(IdCurso);
		Thread.sleep(1000);
	}
}
