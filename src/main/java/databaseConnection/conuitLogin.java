//package databaseConnection;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.sql.SQLException;
//
//public class conuitLogin extends jdbcconnection {
//
//    public static void main(String[] args) throws SQLException {
//
//        jdbcconnection con = new jdbcconnection();
//
//
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\BroserDrivers\\chromedriver.exe");// Set property
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("http://localhost:4200/");
//        driver.manage().window().maximize();
//
//        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
//        //driver.findElement(By.xpath("//input[@type='text']")).sendKeys(rs.getString("username"));
//        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("");
//
//    }
//}