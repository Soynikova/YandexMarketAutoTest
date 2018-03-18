package Step;

import Page.YandexMarketPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class YandexMarket {
YandexMarketPage yandexMarketPage;

    public YandexMarket(WebDriver driver) {
        yandexMarketPage= new YandexMarketPage(driver);
    }
    @Step
    public void goToMarket(){
       yandexMarketPage.toMarketClick();
       yandexMarketPage.compClick();
       yandexMarketPage.noutClick();
       yandexMarketPage.lenovoClick();
       yandexMarketPage.hpClick();
    }
    public void Sample(String strPriceFrom,String strPriceTo){
        yandexMarketPage.setPriceFrom(strPriceFrom);
        yandexMarketPage.setPriceTo(strPriceTo);
    }
    public void countLaptop(){
        yandexMarketPage.count();
        String search = yandexMarketPage.setTextOne();
        yandexMarketPage.setInputSearch(search);
        yandexMarketPage.buttonSearchClick();
    }

}
