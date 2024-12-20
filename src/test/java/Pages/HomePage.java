package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePage {

	@FindBy(xpath="/html/body/main/header/div[3]/div/div/div/div/div/div/ul/li/div[1]/span")
	List<WebElement> menus;
	
	@FindBy(xpath="/html/body/main/header/div[3]/div/div/div/div/div/div/ul/li/div[2]/div/div[1]/ul/li/a")
	List<WebElement> submenus;
	
	@FindBy(xpath="/html/body/main/section/div/div/nav/ol/li[4]/a/span")
	WebElement verifpage;

public HomePage () {
	PageFactory.initElements(Config.driver, this);
}
public void mouseHoverOnMenu (String menutiltle, String submenutitle) throws Exception {
	try {
	for (WebElement menu:menus) {
		if (menu.getText().contains(menutiltle)) {
			Config.actions = new Actions(Config.driver);
			Config.actions.moveToElement(menu).perform();
			Thread.sleep(6000);
		}
	}
	for (WebElement submenu:submenus) {
		if (submenu.getText().contains(submenutitle)) {
			submenu.click();
		}
	}
}catch (Exception e) {}
}
public void veriftitle(String submenutitle) {
	Assert.assertEquals(submenutitle, verifpage.getText());
}
}
