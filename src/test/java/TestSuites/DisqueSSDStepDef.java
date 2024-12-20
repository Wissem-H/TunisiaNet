package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.DisqueSSDPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DisqueSSDStepDef {
	@Given("utilisateur est sur la page de disque SSD")
	public void utilisateur_est_sur_la_page_de_disque_ssd() {
	    Config.driver = new ChromeDriver();
	    Config.maximizeWindow();
	    Config.driver.get("https://www.tunisianet.com.tn/379-disques-ssd");
	}

	@When("utilisateur clique sur le produit {string}")
	public void utilisateur_clique_sur_le_produit(String ProductName) {
		
	    DisqueSSDPage disque = new DisqueSSDPage();
	    disque.ClickProductName(ProductName);
	    
	}

	@When("utilisateur commande le produit")
	public void utilisateur_commande_le_produit(String btncommander) {
		DisqueSSDPage disque = new DisqueSSDPage();
	    disque.ClickProductName(btncommander);
	}

	@Then("utilisateur vérifie la commande")
	public void utilisateur_vérifie_la_commande(String verifpanier) {
		DisqueSSDPage disque = new DisqueSSDPage();
	    disque.ClickProductName(verifpanier);
	}
}
