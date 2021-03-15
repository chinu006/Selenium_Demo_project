import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class invokeChromeBrowser {

    public static void main (String[] args) {

        //Create driver object for Chrome
        // We will implements methods of Webdriver interface (that give all the methods)
        //Invoke .exe file
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\BroserDrivers\\chromedriver.exe");// Set property
        WebDriver driver = new ChromeDriver();

//        driver.get("http://localhost:4200/"); // Launch URL
//        driver.getTitle();  //get title
//        System.out.println(driver.getTitle()); // print page title
//        System.out.println(driver.getCurrentUrl());//Print URL
//        System.out.println(driver.getPageSource());//Print Page Source

        driver.get("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());


        driver.close();





    }
}
