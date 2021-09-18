package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\Coding\\IdeaProjects\\testProject1\\src\\selenium\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //выставляем максимальное ожидание элемента до его появления

        //driver.manage().window().maximize(); //управление окном драйвера (тут - на весь экран)
        //driver.manage().window().setSize(new Dimension(640, 480)); //управление окном драйвера


        driver.get("https://coursehunter.net/course/selenium-webdriver-java-dlya-nachinayushchih");
        //driver.navigate().to("http://google.com"); //то же самое
        //driver.navigate().back(); //на шаг назад
        //driver.navigate().forward(); //на шаг вперед
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        WebElement link = driver.findElement(By.linkText("Текст гиперссылки")); //находим элемент по тексту гиперссылки и присваеваем его переменной
        WebElement link2 = driver.findElement(By.partialLinkText("Текст гиперссылки")); //находим элемент по части текста


        driver.quit(); //закрытие браузера
    }
}
