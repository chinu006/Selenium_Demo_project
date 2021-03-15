package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class dropdownPage {
    public dropdownPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "#ctl00_mainContent_DropDownListCurrency")
    private WebElement select_Currency;

    public void select_Currency(String currencyDropdownBtn) {
        select_Currency.click();
        try { Thread.sleep(2000);}
        catch (InterruptedException e) {}
    }
}
