package testPackage1.ololo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestPage {
    private WebDriver driver;
    private Page page;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\GeckoDriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test() {
        page = new Page(driver);
        page.startFrom("https://www.wikipedia.org/");
        page.searchSomething();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        page.startFrom("https://www.wikipedia.org/");
        page.searchSomething("linus torvalds");

        String actURL = driver.getCurrentUrl();
        String expURL = "https://en.wikipedia.org/wiki/File:LinuxCon_Europe_Linus_Torvalds_03_(cropped).jpg";
        Assert.assertEquals(expURL, actURL);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
