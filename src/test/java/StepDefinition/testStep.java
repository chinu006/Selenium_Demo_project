package StepDefinition;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testStep {

    WebDriver driver ;

    @Given("Open AUT website")
    public void open_aut_website() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\BroserDrivers\\chromedriver.exe");// Set property
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");

    }
    @Given("navigate to dropdown page")
    public void navigate_to_dropdown_page() {
        driver.navigate().back();
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

        driver.close();
    }

}
