package testPackage1.ololo;

import org.junit.After;
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

        page.startFrom("https://www.wikipedia.org/");
        page.searchSomething("linus torvalds");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
