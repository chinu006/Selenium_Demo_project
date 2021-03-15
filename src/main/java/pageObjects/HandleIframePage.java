package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HandleIframePage {

    public HandleIframePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "html/body/a/img")
    private WebElement iframe_img;


    public void clickOn_iframeImg() {
        iframe_img.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }

    }
}

