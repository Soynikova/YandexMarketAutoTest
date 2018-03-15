package Step;

import Page.YandexMarketPage;
import org.openqa.selenium.WebDriver;

public class YandexMarket {
YandexMarketPage yandexMarketPage;

    public YandexMarket(WebDriver driver) {
        yandexMarketPage= new YandexMarketPage(driver);
    }

    public void goToMarket(){
       yandexMarketPage.toMarketClick();
    }
}
