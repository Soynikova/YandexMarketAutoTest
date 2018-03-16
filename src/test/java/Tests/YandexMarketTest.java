package Tests;

import Step.YandexMarket;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class YandexMarketTest{
    public static WebDriver driver;
    YandexMarket yandexMarket;

    public YandexMarketTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tech\\Desktop\\chromedriver_win32\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ekaterina\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        yandexMarket =new YandexMarket(driver);

    }

    public void browser() throws Throwable {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://yandex.ru/");
    }
    @Test
    public void Market() throws Throwable {
        browser();
        yandexMarket.goToMarket();
        yandexMarket.Sample("0","30000");
        yandexMarket.countLaptop();

    }

}
