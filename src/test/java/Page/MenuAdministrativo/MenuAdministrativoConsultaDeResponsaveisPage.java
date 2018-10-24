package Page.MenuAdministrativo;

import static qa.cnabox.core.DriverFactory.getDriver;

import org.openqa.selenium.By;


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
	
	public void EscreveNomeResponsavel(String NomeResponsavel) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("[name='NomeResponsavel']"));
		Thread.sleep(500);
		escreveTexto(By.cssSelector("[name='NomeResponsavel']"), NomeResponsavel);
	}
	
	public void EscreveNomeAluno(String NomeAluno) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("[name='NomeAluno']"));
		Thread.sleep(500);
		escreveTexto(By.cssSelector("[name='NomeAluno']"), NomeAluno);
	}
	
	public void escreveTel_Cel(String Cel_Tel) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("[name='TelefoneCelular']"));
		Thread.sleep(500);
		escreveTexto(By.cssSelector("[name='TelefoneCelular']"), Cel_Tel);
	}
	
	
	public void escreveEmail(String Email) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("#order-form [name='Email']"));
		Thread.sleep(500);
		escreveTexto(By.cssSelector("#order-form [name='Email']"), Email);
	}
	
	public void EscreveCpfResponsavel(String CPF) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("[name='CPF_CNPJ']"));
		Thread.sleep(500);
		escreveTexto(By.cssSelector("[name='CPF_CNPJ']"), CPF);
				
	}
	
	public void BtnFiltrar() throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("#btnResponsaveisFilter"));
	}
	

}
