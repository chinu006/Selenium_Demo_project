import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class invokeIEbrowser {

    public static void main(String[] args) {

        System.setProperty("webdriver.ie.driver", "C:\\Users\\BroserDrivers\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();

        driver.get("http://localhost:4200/"); // Launch URL
        driver.getTitle();  //get title
        System.out.println(driver.getTitle());
        driver.close();
    }
}
