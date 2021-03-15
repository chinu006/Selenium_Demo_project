package BasicSeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.DriverPropertyInfo;

public class selectStaticDropdown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\BroserDrivers\\chromedriver.exe");// Set property
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();

        //Dropdown with select tag
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown); // Create object for select class
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());

        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());

        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());


//        driver.findElement(By.id("divpaxinfo")).click();
//        Thread.sleep(2000L);
//
//        int i = 1;
//        while (i<8){                                             //While loop
//            driver.findElement(By.id("hrefIncAdt")).click();
//            i++;
//        }
//
//        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//        driver.findElement(By.id("btnclosepaxoption")).click();


        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(3000L);

        for (int i = 1; i < 5; i++) {                             // For Loop
            driver.findElement(By.id("hrefIncAdt")).click();

        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        driver.close();
        }


    }

