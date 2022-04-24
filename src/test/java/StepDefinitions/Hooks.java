package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    static WebDriver driver;
    static HomePage homePage;

    @Before
    public static void user_open_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        // driver.navigate().to("https://www.youtube.com/");
        homePage = new HomePage(driver);
    }

    @After
    public static void quitdriver() throws InterruptedException {

         driver.quit();
    }
}
