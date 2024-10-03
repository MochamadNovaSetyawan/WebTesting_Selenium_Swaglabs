package swaglabs.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import swaglabs.base.base;
import swaglabs.pages.loginPage;

public class loginStep extends base {
        loginPage LoginPage;

    @Given("Navigasi ke login page")
    public void navigasiKeLoginPage() {
        initialize();
        LoginPage = new loginPage(driver);
        LoginPage.navigateToHomePage();
    }

    @When("Input {string} di username field")
    public void inputDiUsernameField(String username) {
        LoginPage.inputUsername(username);
    }

    @And("Input {string} di password field")
    public void inputDiPasswordField(String password) {
        LoginPage.inputPassword(password);
    }

    @And("Klik login button")
    public void klikLoginButton() {
        LoginPage.klikLoginButton();
    }

    @Then("Berhasil bernavigasi ke home page")
    public void berhasilBernavigasiKeHomePage() {
        LoginPage.verifyHomePage();
        tearDown();
    }

    @Then("Tidak berhasil masuk ke login page dan terdapat alert {string}")
    public void tidakBerhasilMasukKeLoginPageDanTerdapatAlert(String alert) {
        LoginPage.verifyFalseLogin(alert);
        tearDown();
    }

    @Given("Sudah login")
    public void sudahLogin() {
        initialize();
        LoginPage = new loginPage(driver);
        LoginPage.navigateToHomePage();
        LoginPage.inputUsername("standard_user");
        LoginPage.inputPassword("secret_sauce");
        LoginPage.klikLoginButton();
    }
}
