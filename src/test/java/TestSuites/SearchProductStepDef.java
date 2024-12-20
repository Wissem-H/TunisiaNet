package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.SearchProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProductStepDef {

	@Given("utilisateur est sur la page dacceuil")
	public void utilisateur_est_sur_la_page_dacceuil() {
	  Config.driver = new ChromeDriver();
	  Config.maximizeWindow();
	  Config.driver.get("https://www.tunisianet.com.tn/");
	}

	@When("utilisateur écrit le nom de produit {string} dans la barre de recherche")
	public void utilisateur_écrit_le_nom_de_produit_dans_la_barre_de_recherche(String Produit) {
	    SearchProductPage page = new SearchProductPage();
	    page.rechercheproduit(Produit);
	}

	@Then("utilisateur vérifie le résultat de recherche {string}")
	public void utilisateur_vérifie_le_résultat_de_recherche(String Result) { 
		SearchProductPage page = new SearchProductPage();
	    page.rechercheproduit(Result);
}
}