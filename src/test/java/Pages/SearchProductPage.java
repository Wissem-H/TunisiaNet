package Pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class SearchProductPage {
	
@FindBy(id="search_query_top")
WebElement recherche;

@FindBy(xpath="/html/body/main/section/div/div/div[2]/section/p")
WebElement verifrecherche;

public SearchProductPage () {
	Config.attente(10);
	PageFactory.initElements(Config.driver, this);
}

public void rechercheproduit(String NomProd) {
	try {
	recherche.sendKeys(NomProd+Keys.ENTER); 
	Config.attente(10);
	Assert.assertTrue(verifrecherche.getText().toLowerCase().contains(NomProd));
}catch (Exception e) {
}
}
}