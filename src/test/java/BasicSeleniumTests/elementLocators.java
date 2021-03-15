package BasicSeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementLocators {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\BroserDrivers\\chromedriver.exe");// Set property
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:4200/");
        driver.findElement(By.id("")).click();
        driver.findElement(By.className("")).sendKeys("");
        driver.findElement(By.name("")).submit();
        driver.findElement(By.linkText("")).click();
        driver.findElement(By.xpath(""));
        driver.findElement(By.cssSelector(""));
    }
}
