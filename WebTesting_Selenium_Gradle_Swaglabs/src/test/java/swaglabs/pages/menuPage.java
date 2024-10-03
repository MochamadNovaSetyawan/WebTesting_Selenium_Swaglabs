package swaglabs.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class menuPage {
    WebDriver driver;
    WebDriverWait wait;

    public menuPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    By button_menu = By.className("bm-burger-button");
    By verify_abotPage = By.className("MuiTypography-body1");
    By Verify_image = By.className("bot_column");


    public void clickMenu() {
        wait.until(ExpectedConditions.elementToBeClickable(button_menu)).click();
    }

    public void clickItemMenu(String item) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'"+item+"')]"))).click();
    }


    public void verifyNavigateAboutPage() {
        String actualResult = driver.findElement(verify_abotPage).getText();
        Assert.assertEquals("The world relies on your code. Test on thousands of different device, browser, and OS configurations–anywhere, any time.",actualResult);

    }

    public void verifyNavigateLoginPage() {
        boolean isDisplayed = driver.findElement(Verify_image).isDisplayed();
        Assert.assertTrue("Elemen tidak ditampilkan", isDisplayed);

    }

//    public void verifyEmptyCart() {
//        String actualResult = driver.findElement(verify_alert).getText();
//        Assert.assertEquals(alert,actualResult);
//
//    }


}
