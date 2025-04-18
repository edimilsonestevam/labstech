package br.sp.edimilsonestevam.page;

import br.sp.edimilsonestevam.setup.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static br.sp.edimilsonestevam.setup.Core.normalizeText;

public class NewsArticle extends Base {

	public NewsArticle(WebDriver browser) {
		super(browser);

	}	
	
	public void readNewsArticle (String chooseNewsArticle) {
		
		System.out.println("• Reading News Article...");

		String txtFirstArticle = "Atividade Rural: entenda quais são e como comprovar trabalho";
		String txtSecondArticle = "Planejamento previdenciário: o que é, para que serve e como fazer";
		String txtThirdArticle = "Programa Destino Futuro: entenda como impacta o turismo brasileiro";

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

	public void verifyNewsArticleTop(String article, String author, String date){

		System.out.println("• Verifying News Article...");

		String xpathArticle = "//h1[@class='entry-title']";
		String newsArticleTitle  = browser.findElement(By.xpath(xpathArticle)).getText();
		Assert.assertEquals("Checking News Article",  article, newsArticleTitle);

		String xpathAuthor = "//span[@class='author-name']";
		String newsArticleAuthor  = browser.findElement(By.xpath(xpathAuthor)).getText();
		Assert.assertEquals("Checking Author",  author, newsArticleAuthor);

		String xpathDate = "//span[@class='updated']";
		String newsArticleDate  = browser.findElement(By.xpath(xpathDate)).getText();
		Assert.assertEquals("Checking Date",  date, newsArticleDate);

	}

	public void verifyNewsArticleDown(String firstArticle, String secondArticle, String thirdArticle){

		System.out.println("• Verifying News Article Footer...");

		String xpathFirstArticle = "//a[contains(text(),'Autodeclaração Rural: o que é e como preencher em 2025')]";
		String firstArticleTitle  = browser.findElement(By.xpath(xpathFirstArticle)).getText();
		Assert.assertEquals("Checking First News Article",  firstArticle, firstArticleTitle);

		String xpathSecondArticle = "//a[contains(text(),'Aposentadoria Rural: quais são os requisitos em 2024 ')]";
		String secondArticleTitle  = browser.findElement(By.xpath(xpathSecondArticle)).getText();
		Assert.assertEquals("Checking Second News Article",  normalizeText(secondArticle), normalizeText(secondArticleTitle));

		String xpathThirdArticle = "//a[contains(text(),'Pensão por Morte Rural: como funciona e quem tem direito')]";
		String thirdArticleTitle  = browser.findElement(By.xpath(xpathThirdArticle)).getText();
		Assert.assertEquals("Checking Third News Article",  normalizeText(thirdArticle), normalizeText(thirdArticleTitle));

	}
}
