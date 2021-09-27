package pageObject;

import config.Config;
import helpers.SeleniumFluentWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterPage {

    @FindBy(css = ".login")
    WebElement login;

    public SeleniumFluentWait wait;

    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        wait= new SeleniumFluentWait(driver);
    }

    public void registerPage(){
        wait.waitForElementToBeClickable(login);
        login.click();
    }


}
