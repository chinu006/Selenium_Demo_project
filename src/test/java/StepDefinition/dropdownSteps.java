package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pageObjects.dropdownPage;

public class dropdownSteps {

    WebDriver driver;
    dropdownPage dropdwn;

    @Given("Open test website")
    public void open_test_website() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\BroserDrivers\\chromedriver.exe");// Set property
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
    }
    @Given("Navigate to home page")
    public void navigate_to_home_page() {
        System.out.println(driver.getCurrentUrl());
    }

    @Given("select currency by index")
    public void select_currency_by_index() {
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown); // Create object for select class
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());

    }

    @Given("select currency by visible text")
    public void select_currency_by_visible_text() {
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown); // Create object for select class
        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());
    }
    @Given("select currency by value")
    public void select_currency_by_value() {
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown); // Create object for select class
        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        System.out.println(driver.getClass());// Retrieve the class object that represents the runtime class of the project
        System.out.println(driver.getPageSource());// Retrieve page source

    }
    @Then("close the window")
    public void close_the_window() {
        driver.close();
    }


}
