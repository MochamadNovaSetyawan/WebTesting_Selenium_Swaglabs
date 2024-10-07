package swaglabs.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import swaglabs.base.base;
import swaglabs.pages.loginPage;
import swaglabs.pages.menuPage;

public class menuStep extends base {
    menuPage MenuPage;

    @When("Klik menu button")
    public void klikMenuButton() {
        MenuPage = new menuPage(driver);
        MenuPage.clickMenu();
    }

    @And("Klik menu {string}")
    public void klik(String menu) {
        MenuPage.clickItemMenu(menu);
    }

    @Then("Berhasil mengarahkan ke {string}")
    public void berhasilMengarahkanKeProductPage(String navigate) {
        MenuPage.verifyNavigatePage(navigate);
        tearDown();
    }
}
