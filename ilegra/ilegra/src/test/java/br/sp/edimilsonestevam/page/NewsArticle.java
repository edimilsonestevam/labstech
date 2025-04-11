package br.sp.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.sp.edimilsonestevam.setup.Base;

public class NewsArticle extends Base {

	public NewsArticle(WebDriver browser) {
		super(browser);

	}	
	
	public void readNewsArticle (String chooseNewsArticle) {
		
		System.out.println("• Read News Article...");

		String txtFirstArticle = "Golpe da CNH: entenda funciona e como se proteger";
		String txtSecondArticle = "Golpe dos Correios: entenda como funciona e como identificar ";
		String txtThirdArticle = "Abono indenizatório: o que é, como funciona e regras";

		if(chooseNewsArticle.equalsIgnoreCase("1")){
			browser.findElement(By.linkText(txtFirstArticle)).click();

		}
		else if (chooseNewsArticle.equalsIgnoreCase("2")) {
			browser.findElement(By.linkText(txtSecondArticle)).click();

		}
		else if (chooseNewsArticle.equalsIgnoreCase("3")) {
			browser.findElement(By.linkText(txtThirdArticle)).click();

		}
		else {
			System.out.println("You should inform: 1, 2 or 3!");
		}
	}

}
