package Tests;

import Step.YandexMarket;
import com.google.common.io.Files;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
@Test
public class YandexMarketTest{
    public static WebDriver driver;
    YandexMarket yandexMarket;


    public YandexMarketTest() {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tech\\Desktop\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ekaterina\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        yandexMarket = new YandexMarket(driver);
    }

    public void browser() throws Throwable {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://yandex.ru/");
    }
    @Step
    public void Market() throws Throwable {
        browser();
        yandexMarket.goToMarket();
        screenshot();;
        yandexMarket.Sample("0","30000");
        screenshot();
        yandexMarket.countLaptop();
        screenshot();

    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }

    public void screenshot() {
        saveScreenshot(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));

    }

}
