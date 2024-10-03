package swaglabs.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class loginPage {
    WebDriver driver;
    WebDriverWait wait;

    public loginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    By field_username = By.id("user-name");
    By field_password = By.id("password");
    By button_login = By.id("login-button");
    By verify_title = By.className("product_label");
    By verify_alert = By.cssSelector("[data-test='error']");
    By Verify_image = By.className("bot_column");


    public void navigateToHomePage() {
        driver.get("https://www.saucedemo.com/v1/index.html");
        boolean isDisplayed = driver.findElement(Verify_image).isDisplayed();
        Assert.assertTrue("Elemen tidak ditampilkan", isDisplayed);
    }

    public void inputUsername(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(field_username)).sendKeys(username);
    }

    public void inputPassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(field_password)).sendKeys(password);
    }

    public void klikLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(button_login)).click();
    }

    public void verifyHomePage() {
        String actualResult = driver.findElement(verify_title).getText();
        Assert.assertEquals("Products",actualResult);
    }

    public void verifyFalseLogin(String alert) {
        String actualResult = driver.findElement(verify_alert).getText();
        Assert.assertEquals(alert,actualResult);
    }
}
