package Pages;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class DisqueSSDPage {

	@FindBy(xpath="/html/body/main/section/div/div/div[2]/section/section/div[3]/div/div/div/div/article/div/div[2]/h2/a")
	List<WebElement> productList;
	
	@FindBy(xpath="/html/body/main/section/div/div/nav/ol/li[5]/a/span")
	WebElement verifproduct;

	@FindBy(xpath="/html/body/main/section/div/div/div/section/div[1]/div[3]/div[4]/form/div[2]/div/div[2]/button")
	WebElement ajoutpanier;
	
	@FindBy(xpath="/html/body/div[8]/div/div/div/div[2]/div/div/a")
	WebElement btncommander;
	
	@FindBy(xpath="/html/body/main/section/div/div/div/section/div/div/div[1]/div[2]/ul/li[2]/div/div[2]/div[1]/a")
	WebElement verifpanier;
	
public DisqueSSDPage () {
		PageFactory.initElements(Config.driver, this);
	}

public void ClickProductName (String ProductName){
	try {
	for(WebElement product:productList) {
		if(product.getText().contains(ProductName)){
			product.click();
			Config.attente(10);
			ajoutpanier.click();
			WebDriverWait wait = new WebDriverWait(Config.driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(btncommander));
			btncommander.click();	
			Config.attente(10);
			String actualtext= verifpanier.getText();
			Assert.assertEquals(ProductName, actualtext);
		}
		}
}catch (Exception e) {}

}
}