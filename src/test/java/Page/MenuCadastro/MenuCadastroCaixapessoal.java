package Page.MenuCadastro;

import qa.cnabox.core.BasePage;

import org.openqa.selenium.By;


public class MenuCadastroCaixapessoal extends BasePage {
 
	public void SetclicarMenuCadastro() throws InterruptedException {

		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(10) .menu-item"));
		Thread.sleep(1000);
		} 

	
	
	
	
}
