package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class checkoutSteps {

WebDriver driver;

    @Given("user is on Home Page")
    public void user_is_on_home_page() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\BroserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.shop.demoqa.com");
    }
//    @When("he search for product")
//    public void he_search_for_product() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("choose to buy the first item")
//    public void choose_to_buy_the_first_item() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("moves to checkout from mini cart")
//    public void moves_to_checkout_from_mini_cart() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("enter personal details on checkout page")
//    public void enter_personal_details_on_checkout_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("select same delivery addres")
//    public void select_same_delivery_addres() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("select payment method as {string}")
//    public void select_payment_method_as(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("place the order")
//    public void place_the_order() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();

}
