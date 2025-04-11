package br.sp.edimilsonestevam.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.sp.edimilsonestevam.setup.Base;

import static br.sp.edimilsonestevam.setup.Core.normalizeText;

public class NewsArticle extends Base {

	public NewsArticle(WebDriver browser) {
		super(browser);

	}	
	
	public void readNewsArticle (String chooseNewsArticle) {
		
		System.out.println("• Reading News Article...");

		String txtFirstArticle = "Golpe da CNH: entenda funciona e como se proteger";
		String txtSecondArticle = "Golpe dos Correios: entenda como funciona e como identificar";
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

	public void verifyCurrentPage(String expectedUrl){

		System.out.println("• Verifying Current Page...");

		String currentUrl = browser.getCurrentUrl();
		Assert.assertEquals("Checking Current URL", "https://" + expectedUrl, currentUrl);

	}

	public void verifyNewsArticle(String article, String author, String date){

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

	public void verifyNewsArticleFooter(String firstArticle, String secondArticle, String thirdArticle){

		System.out.println("• Verifying News Article Footer...");

		String xpathFirstArticle = "//a[contains(text(),'Onde fica o código de segurança da CNH? Veja onde encontrar')]";
		String firstArticleTitle  = browser.findElement(By.xpath(xpathFirstArticle)).getText();
		Assert.assertEquals("Checking First News Article",  firstArticle, firstArticleTitle);

		String xpathSecondArticle = "//a[contains(text(),'CNH Social: saiba como tirar a CNH gratuita ')]";
		String secondArticleTitle  = browser.findElement(By.xpath(xpathSecondArticle)).getText();
		Assert.assertEquals("Checking Second News Article",  normalizeText(secondArticle), normalizeText(secondArticleTitle));

		String xpathThirdArticle = "//a[contains(text(),'Multa de Trânsito 2024: conheça os tipos, valores e como recorrer ')]";
		String thirdArticleTitle  = browser.findElement(By.xpath(xpathThirdArticle)).getText();
		Assert.assertEquals("Checking Third News Article",  normalizeText(thirdArticle), normalizeText(thirdArticleTitle));

	}
}
