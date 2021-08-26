package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

    private WebDriver driver;

    public WaitUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void waitUntilClickable(Integer seconds, WebElement webElement) {
        new WebDriverWait(driver, seconds).until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public void waitUntilVisible(Integer seconds, WebElement webElement) {
        new WebDriverWait(driver, seconds).until(ExpectedConditions.visibilityOf(webElement));
    }

}
