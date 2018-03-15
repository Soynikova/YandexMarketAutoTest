package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

@Test
public class YandexMarketPage {
    @FindBy(xpath="//a[@class='home-link home-link_blue_yes home-tabs__link home-tabs__search'][contains(text(),'Маркет')]")
    private WebElement toMarket;

    public YandexMarketPage(WebDriver driver) {
        HtmlElementLoader.populatePageObject(this, driver);
    }

    public void  toMarketClick(){toMarket.click();}

}
