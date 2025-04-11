package br.sp.edimilsonestevam.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.sp.edimilsonestevam.setup.Base;

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
		String xpathAuthor = "//span[@class='author-name']";
		String xpathDate = "//span[@class='updated']";


	}

	public void verifyNewsArticleFooter(String firstArticle, String secondArticle, String thirdArticle){

		System.out.println("• Verifying News Article Footer...");

		String xpathFirstArticle = "";
		String xpathSecondArticle = "";
		String xpathThirdArticle = "";


	}
}
