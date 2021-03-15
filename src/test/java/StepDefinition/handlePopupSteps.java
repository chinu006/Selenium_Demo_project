package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class handlePopupSteps {

    WebDriver driver;

    @Given("navigate to alert handle page")
    public void navigate_to_alert_handle_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\BroserDrivers\\chromedriver.exe");// Set property
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Given("accept it")
    public void accept_alert() {
        Alert alert = driver.switchTo().alert();
        String alertMessage = driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        alert.accept();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.quit();
    }
    @Given("open popup")
    public void open_popup() {
        driver.findElement(By.name("cusid")).sendKeys("53920");
        driver.findElement(By.name("submit")).submit();

    }
}
