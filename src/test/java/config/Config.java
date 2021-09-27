package config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Config {
    public static WebDriver driver;



    public void getDriver(){
        System.setProperty("webdriver.chrome.driver","/var/krzysztof.waliszewski/IdeaProjects/start/src/main/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        //options.addArguments("headless");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
    }

}
