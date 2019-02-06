package Page.MenuFinanceiro;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import qa.cnabox.core.BasePage;

public class BoletoGeracaodeBoletos  extends BasePage {
	
	public void clicarmenufinanceiro () throws InterruptedException {
		
		Thread.sleep(2000);
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(9) .nav-title"));
		Thread.sleep(2000);
	}
		
	public void clicarmenufinanceiroBoletos () throws InterruptedException {
		
		clicarBotaoBy(By.linkText("Boleto"));
		Thread.sleep(2000);
	}
	
	public void clicarGeraçãodeboletos () throws InterruptedException {
		
		clicarBotaoBy(By.linkText("Boleto"));
		Thread.sleep(2000);
	}
	

}
