package testPackage1.ololo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page {
    private WebDriver driver;

    //конструктор класса
    public Page(WebDriver driver) {
        this.driver = driver;
    }

    //элементы страницы
    private By searchField = By.xpath("//input[@name = 'search']");
    private By searchButton = By.xpath("//button[@class = 'pure-button pure-button-primary-progressive']");
    private By imagePenguin = By.xpath("//img[@alt = 'Tux the penguin']");
    private By linusImage = By.xpath("//img[@alt = 'LinuxCon Europe Linus Torvalds 03 (cropped).jpg']");
    private By language = By.xpath("//select[@id = 'searchLanguage']");
    private By en = By.xpath("//option[@value = 'en']");
    // and etc...

    //сами методы для управления всем этим безобразием
    public void searchSomething() {
        driver.findElement(language).click();
        driver.findElement(en).click();
        driver.findElement(searchField).sendKeys("Linux");
        driver.findElement(searchButton).click();
        driver.findElement(imagePenguin).click();
    }

    public void searchSomething(String something) {
        //перегруженный предыдущий метод
        driver.findElement(language).click();
        driver.findElement(en).click();
        driver.findElement(searchField).sendKeys(something);
        driver.findElement(searchButton).click();
        driver.findElement(linusImage).click();

    }

    public void startFrom(String startPage) {
        driver.get(startPage);
    }

    //etc...
}
