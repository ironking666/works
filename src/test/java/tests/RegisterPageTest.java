package tests;

import config.Config;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.RegisterPage;

public class RegisterPageTest extends Config {
    @BeforeTest
    protected void setUp(){
        getDriver();

    }

    /*@AfterTest
    protected void closeDriver(){
        driver.quit();
    }*/

    @Test
    protected void registerPage(){
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.registerPage();

    }

}
