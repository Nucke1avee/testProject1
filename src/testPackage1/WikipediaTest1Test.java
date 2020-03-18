//package testPackage1;
//
//import org.junit.Test;
//import org.junit.Before;
//import org.junit.After;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.WebElement;
//
//import org.openqa.selenium.JavascriptExecutor;
//
//import org.openqa.selenium.Keys;
//
//import java.util.*;
//
//
//public class WikipediaTest1Test {
//    private WebDriver driver;
//    private Map<String, Object> vars;
//    JavascriptExecutor js;
//
//    //типа подготовка
//    @Before
//    public void setUp() {
//        System.setProperty("webdriver.gecko.driver", "C:\\GeckoDriver.exe");
//        /*DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//        capabilities.setCapability("marionette", true);*/
//
//        driver = new FirefoxDriver(); //ну только драйвер надо на ИЕшный, соответственно поменять
//        js = (JavascriptExecutor) driver;
//        vars = new HashMap<String, Object>();
//    }
//
//    //это в конце он запускает, драйвер закрывает
//    @After
//    public void tearDown() {
//        driver.quit();
//    }
//
//    //сам тест, собстна
//    @Test
//    public void wikipediaTest1() {
//        driver.get("https://www.wikipedia.org/");
//        driver.manage().window().setSize(new Dimension(1382, 744));
//        driver.findElement(By.cssSelector(".other-project:nth-child(8) .other-project-title")).click();
//        driver.findElement(By.linkText("Wikipedia")).click();
//        driver.findElement(By.id("searchLanguage")).click();
//        {
//            WebElement dropdown = driver.findElement(By.id("searchLanguage"));
//            dropdown.findElement(By.xpath("//option[. = 'English']")).click();
//        }
//        driver.findElement(By.cssSelector("option:nth-child(12)")).click();
//        driver.findElement(By.id("searchInput")).click();
//        driver.findElement(By.id("searchInput")).sendKeys("Nightwish");
//        driver.findElement(By.id("searchInput")).sendKeys(Keys.DOWN);
//        driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
//        js.executeScript("window.scrollTo(0,10612)"); //а вот тут мы падаем по ходу...
//        driver.findElement(By.linkText("Human. :II: Nature. World Tour")).click();
//        driver.findElement(By.linkText("Beast in Black")).click();
//    }
//}
