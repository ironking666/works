package helpers;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.List;

public class SeleniumFluentWait {

    private WebDriver driver;


    public SeleniumFluentWait(WebDriver driver) {
        this.driver = driver;
    }
    public void waitForElementToBeDisplayed(WebElement element) {
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(3500))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOf(element));
    }

    // public void waitForElementToBeDisplay(WebElement element) {
    //org.openqa.selenium.support.ui.FluentWait<WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<>(driver);
    //wait.withTimeout(Duration.ofSeconds(10))
    //.pollingEvery(Duration.ofMillis(3500))
    //.ignoring(NoSuchElementException.class);
    // wait.until(ExpectedConditions.visibilityOf(element));


    public void waitForElementToBeClickable(WebElement element) {
        org.openqa.selenium.support.ui.FluentWait<WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(5500))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public List<WebElement> waitUntilList(final List<WebElement> elementsToWaitFor, Duration interval) {
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(3500))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfAllElements(elementsToWaitFor));
        //.withTimeout(interval);
        return (elementsToWaitFor);

    }
    public void waitForElementExist(WebElement element) {
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofMillis(4500))
                .ignoring(StaleElementReferenceException.class);

        wait.until(ExpectedConditions.visibilityOf(element));
    }
}



