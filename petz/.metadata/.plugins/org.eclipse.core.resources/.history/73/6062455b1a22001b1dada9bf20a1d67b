package pt.po.edimilsonestevam.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pt.po.edimilsonestevam.setup.Base;

public class Home extends Base{

	public Home(WebDriver navegador) {
		super(navegador);

	}

	public void verificarPaginaAtual(String paginaEsperada) {
		
	}
	
	public void consultarNoticiaTitulo(String tituloNoticia) {
		
		System.out.println("Informando o Título da Notícia...");
		
		String iconeLupa = "btn btn-search";
		String idCampoPesquisa = "searchAddon1";
	
		navegador.findElement(By.className(iconeLupa)).click();
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		navegador.findElement(By.id(idCampoPesquisa)).sendKeys(tituloNoticia);
	
	}
	
	public void confirmarOperacaoPesquisa() {
		
		System.out.println("Clicando no botão Busca...");
		
		String botaoBusca = "btn";
		
		navegador.findElement(By.className(botaoBusca)).click();
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
}
