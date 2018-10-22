package Page.MenuPedagógico;

import qa.cnabox.core.BasePage;
import static qa.cnabox.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MenuPedagogicoFiltrarTurmasPage extends BasePage {
	
	public void SetClicarMenu() throws InterruptedException {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(8) .menu-item span"));
		Thread.sleep(1200);
	}

	public void SetClicarSubMenu() throws InterruptedException {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(8) li:nth-of-type(12) span"));
		Thread.sleep(1200);
	}

	public void AguardaCarregarPagina() throws InterruptedException {
		Thread.sleep(1200);
	}
	
	public void SetProfessor(String IdProfessor) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("#ProfessorId"));
		Thread.sleep(1000);
		WebElement Professor = getDriver().findElement(By.id("#ProfessorId"));
		Select comboProfessor = new Select(Professor);
		comboProfessor.selectByValue(IdProfessor);
		Thread.sleep(1000);
	}
	
	public void SetMadrinha(String IdMadrinha) throws InterruptedException {
	
		clicarBotaoBy(By.cssSelector("#MadrinhaTurmaId"));
		Thread.sleep(1000);
		WebElement Madrinha = getDriver().findElement(By.id("#MadrinhaTurmaId"));
		Select comboMadrinha = new Select(Madrinha);
		comboMadrinha.selectByValue(IdMadrinha);
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
	
	public void SetNivel(String IdNivel) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("#NivelId"));
		Thread.sleep(1000);
		WebElement Nivel = getDriver().findElement(By.id("#NivelId"));
		Select comboNivel = new Select(Nivel);
		comboNivel.selectByValue(IdNivel);
		Thread.sleep(1000);
	}
	
	public void SetEstagio(String IdEstagio) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("#EstagioId"));
		Thread.sleep(1000);
		WebElement Estagio = getDriver().findElement(By.id("#EstagioId"));
		Select comboEstagio = new Select(Estagio);
		comboEstagio.selectByValue(IdEstagio);
		Thread.sleep(1000);
		
	}
	
	public void SetSituacaoo(String IdSituacao) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("#StatusTurmaId"));
		Thread.sleep(1000);
		WebElement SituacaoTurma = getDriver().findElement(By.id("#StatusTurmaId"));
		Select comboSituacaoTurma = new Select(SituacaoTurma);
		comboSituacaoTurma.selectByValue(IdSituacao);
		Thread.sleep(1000);
		
	}

}
