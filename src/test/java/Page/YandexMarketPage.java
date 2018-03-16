package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

import static Tests.YandexMarketTest.driver;

@Test
public class YandexMarketPage {


    @FindBy(xpath="//a[@class='home-link home-link_blue_yes home-tabs__link home-tabs__search'][contains(text(),'Маркет')]")
    private WebElement toMarket;

    @FindBy(xpath="//a[@class='link topmenu__link'][contains(text(),'Компьютеры')]")
    private WebElement comp;

    @FindBy(xpath="//a[@class='link catalog-menu__list-item metrika i-bem metrika_js_inited'][contains(text(),'Ноутбуки')]")
    private WebElement nout;

    @FindBy(xpath="//span[@class='NVoaOvqe58'][contains(text(),'Lenovo')]")
    private WebElement lenovo;

    @FindBy(xpath="//span[@class='NVoaOvqe58'][contains(text(),'HP')]")
    private WebElement hp;
    @FindBy(xpath="//input[@id='glpricefrom']")
    private WebElement priceFrom;
    @FindBy(xpath="//input[@id='glpriceto']")
    private WebElement priceTo;
    @FindBy(xpath="//a[@class='link n-link_theme_blue i-bem link_js_inited']\n")
    private WebElement One;




    public YandexMarketPage(WebDriver driver) {
        HtmlElementLoader.populatePageObject(this, driver);
    }

    public YandexMarketPage() {
    }

    public void  toMarketClick(){toMarket.click();}

    public void compClick() { comp.click();

    }
    public void noutClick(){ nout.click();
}
public void  lenovoClick(){
        lenovo.click();
}
public  void hpClick(){
        hp.click();
}
    public void setPriceFrom(String strPricefrom) {
        priceFrom.sendKeys(strPricefrom);
    }
    public void setPriceTo(String strPriceTo) {
        priceTo.sendKeys(strPriceTo);
    }

    public  int count(){
        return driver.findElements(By.xpath("//div[contains(@class, \"n-snippet-card2 i-bem \")]")).size();


    }
    public void setTextOne() {
        One.getText();
}


}