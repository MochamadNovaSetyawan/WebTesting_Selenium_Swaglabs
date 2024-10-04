package swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class productPage {
    WebDriver driver;
    WebDriverWait wait;

    public productPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    }


    public void KlikProductDetail(String product) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'"+product+"')]"))).click();
    }
}
