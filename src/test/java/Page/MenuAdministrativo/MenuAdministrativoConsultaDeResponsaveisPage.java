package Page.MenuAdministrativo;

import static qa.cnabox.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import qa.cnabox.core.BasePage;

public class MenuAdministrativoConsultaDeResponsaveisPage extends BasePage {
	
	public void SetClicarMenu() throws InterruptedException {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(7) .nav-title span"));
		Thread.sleep(1200);
	}

	public void SetClicarSubMenu() throws InterruptedException {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(7) > .sub-menu:nth-child(2) > li:nth-of-type(2) span"));
		Thread.sleep(1200);
	}

	public void AguardaCarregarPagina() throws InterruptedException {
		Thread.sleep(1200);
		
	}
	

}
