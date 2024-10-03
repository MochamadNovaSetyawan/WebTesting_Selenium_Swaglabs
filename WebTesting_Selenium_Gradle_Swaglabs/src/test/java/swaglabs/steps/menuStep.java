package swaglabs.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import swaglabs.base.base;
import swaglabs.pages.loginPage;
import swaglabs.pages.menuPage;

public class menuStep extends base {
    menuPage MenuPage;
    loginPage LoginPage;

    @When("Klik menu button")
    public void klikMenuButton() throws InterruptedException {
        MenuPage = new menuPage(driver);
        MenuPage.clickMenu();
    }

    @And("Klik {string}")
    public void klik(String item) throws InterruptedException {
        MenuPage.clickItemMenu(item);
    }

    @Then("Berhasil mengarahkan ke product page")
    public void berhasilMengarahkanKeProductPage() {
        LoginPage = new loginPage(driver);
        LoginPage.verifyHomePage();
        tearDown();
    }

    @Then("Berhasil mengarahkan ke about page")
    public void berhasilMengarahkanKeAboutPage() throws InterruptedException {
        MenuPage.verifyNavigateAboutPage();
        tearDown();
    }

    @Then("Berhasil mengarahkan ke login page")
    public void berhasilMengarahkanKeLoginPage() throws InterruptedException {
        MenuPage = new menuPage(driver);
        MenuPage.verifyNavigateLoginPage();
        tearDown();
    }
}
