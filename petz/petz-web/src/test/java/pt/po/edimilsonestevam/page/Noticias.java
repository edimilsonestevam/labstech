package pt.po.edimilsonestevam.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pt.po.edimilsonestevam.setup.Base;

public class Noticias extends Base{

	public Noticias(WebDriver navegador) {
		super(navegador);

	}

	public void verificarNoticiaPesquisada(String tituloNoticia) {
		
		System.out.println("• Validando Notícia Pesquisada...");
		
		String noticia1 = "Por que o cachorro lambe o dono? Isso faz mal? É hora de descobrir!";
		String noticia2 = "Cachorro gosta de música? Saiba mais sobre o assunto";
		String noticia3 = "Cachorro filhote pode comer ração de cachorro grande?";
		
		String xPathTituloNoticia1 = "//a[contains(text(),'Por que o cachorro lambe o dono? Isso faz mal? É h')]";
		String xPathTituloNoticia2 = "//a[contains(text(),'Cachorro gosta de música? Saiba mais sobre o assunto')]";  //EXISTEM DOIS ELEMENTOS COM O MESMO XPATH E SEM ID
		String xPathTituloNoticia3 = "//a[contains(text(),'Cachorro filhote pode comer ração de cachorro grande?')]"; //EXISTEM DOIS ELEMENTOS COM O MESMO XPATH E SEM ID
		
		String tituloNoticiaPesquisada1 = navegador.findElement(By.xpath(xPathTituloNoticia1)).getText();
		String tituloNoticiaPesquisada2 = navegador.findElement(By.xpath(xPathTituloNoticia2)).getText();
		String tituloNoticiaPesquisada3 = navegador.findElement(By.xpath(xPathTituloNoticia3)).getText();

		
		if(tituloNoticia.equalsIgnoreCase(noticia1)) {
			Assert.assertEquals("Validando Título da Notícia 1", tituloNoticia, tituloNoticiaPesquisada1);
		}
		else if(tituloNoticia.equalsIgnoreCase(noticia2)) {
			Assert.assertEquals("Validando Título da Notícia 2", tituloNoticia, tituloNoticiaPesquisada2);
		}
		else if(tituloNoticia.equalsIgnoreCase(noticia3)) {
			Assert.assertEquals("Validando Título da Notícia 3", tituloNoticia, tituloNoticiaPesquisada3);
		}
		else {
			System.out.println("Dados informados estão errados!");
		}
	}
}
