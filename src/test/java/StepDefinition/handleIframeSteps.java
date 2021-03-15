package StepDefinition;

import com.google.common.base.Verify;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.HandleIframePage;

import java.util.concurrent.TimeUnit;

public class handleIframeSteps {

    WebDriver driver;
    HandleIframePage iframePage;

    @Given("user is on guru99 home page")
    public void user_is_on_guru99_home_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\BroserDrivers\\chromedriver.exe");// Set property
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/guru99home/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Given("switch to the frame")
    public void switch_to_the_frame() {
        driver.switchTo().frame("a077aa5e");
    }
    @Then("click the element")
    public void click_the_element() {
        driver.findElement(By.xpath("html/body/a/img")).click();
        System.out.println(driver.getCurrentUrl());
    }

    @Given("find total number of Iframes present in the web page")
    public void find_total_number_of_iframes_present_in_the_web_page() {

        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Total number of iframes present in the web page is " + size);

    }
    @Given("find the index of iframe")
    public void find_the_index_of_iframe() {
        int size = driver.findElements(By.tagName("iframe")).size();
        for(int i=0; i<=size; i++){
            driver.switchTo().frame(1);
            int total=driver.findElements(By.xpath("html/body/a/img")).size();
            System.out.println(total);
            driver.switchTo().defaultContent();
            }
    }
    @Given("switch to frame")
    public void switch_to_frame() {
        driver.switchTo().frame(1);

    }
    @Given("click on element present in iframe")
    public void click_on_element_present_in_iframe() {
        iframePage = new HandleIframePage(driver);
        iframePage.clickOn_iframeImg();
        //driver.findElement(By.xpath("html/body/a/img")).click();

    }

    @Then("navigate back to the parent frame")
        public void navigate_back_to_the_parent_frame() {
            driver.switchTo().parentFrame();
            System.out.println(driver.getCurrentUrl());
//        WebElement textPresentOnUI = driver.findElement(By.xpath(""));
//        String elementText = textPresentOnUI.getText();

        if(driver.findElement(By.xpath("//font[contains(text(),'THIS IS A DEMO PAGE FOR TESTING')]"))!= null){
            System.out.println("Element is Present");
        }else{
            System.out.println("Element is Absent");
        }

    }
    @Then("close all windows")
    public void close_all_windows() {
        driver.quit();

        }

    }

