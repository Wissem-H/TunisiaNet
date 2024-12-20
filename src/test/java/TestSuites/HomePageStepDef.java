package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {

	@Given("utilisateur est sur la page d acceuil")
	public void utilisateur_est_sur_la_page_d_acceuil() {
	   Config.driver= new ChromeDriver();
	   Config.maximizeWindow();
	   Config.driver.get("https://www.tunisianet.com.tn/");
	}

	@When("utilisateur survole la souris sur menus {string} et clique sur submenu {string}")
	public void utilisateur_survole_la_souris_sur_menus_et_clique_sur_submenu(String menutiltle, String submenutitle) throws Exception {
		HomePage page = new HomePage();
		page.mouseHoverOnMenu(menutiltle, submenutitle);
	}

	@Then("utilisateur est dirigé vers la page des submenus {string}")
	public void utilisateur_est_dirigé_vers_la_page_des_submenus(String veriftitle) {
	    HomePage page = new HomePage();
	    page.veriftitle(veriftitle);
	}
}
