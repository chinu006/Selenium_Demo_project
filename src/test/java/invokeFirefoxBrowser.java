import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class invokeFirefoxBrowser {

    public static void main (String [] args){

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\BroserDrivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.shop.demoqa.com"); // Launch URL
        driver.getTitle();  //get title
        System.out.println(driver.getTitle());
        driver.close();

        System.out.println(driver.getCurrentUrl());


    }
}
