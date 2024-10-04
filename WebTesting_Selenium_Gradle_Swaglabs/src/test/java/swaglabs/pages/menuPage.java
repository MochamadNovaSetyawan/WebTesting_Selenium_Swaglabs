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
    By verify_aboutPage = By.className("MuiTypography-body1");
    By Verify_image = By.className("bot_column");
    By verify_title = By.className("product_label");


    public void clickMenu() {
        wait.until(ExpectedConditions.elementToBeClickable(button_menu)).click();
    }

    public void clickItemMenu(String item) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'"+item+"')]"))).click();
    }


    public void verifyNavigatePage(String navigate) {
        switch(navigate) {
            case "mengarahkan ke product page":
                String actualResult1 = driver.findElement(verify_title).getText();
                Assert.assertEquals("Products",actualResult1);
                break;
            case "mengarahkan ke about page":
                String actualResult2 = driver.findElement(verify_aboutPage).getText();
                Assert.assertEquals("The world relies on your code. Test on thousands of different device, browser, and OS configurations–anywhere, any time.", actualResult2);
                break;
            case "mengarahkan ke login page":
                wait.until(ExpectedConditions.visibilityOfElementLocated(Verify_image)).isDisplayed();
                break;
        }
    }
}
