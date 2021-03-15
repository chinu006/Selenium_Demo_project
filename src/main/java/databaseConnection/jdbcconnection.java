//package databaseConnection;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.sql.*;
//
//public class jdbcconnection {
//
//    public static void main(String[] args) throws SQLException {
//
//        String host = "localhost";
//        String port = "3306";
//
//        Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/MyTestApp", "root", "London@123");
//        Statement St = con.createStatement();
//        ResultSet rs = St.executeQuery("select * from employeeinfo where name = 'tas'");
//
//        while (rs.next()) {
//
//            WebDriver driver = new ChromeDriver();
//            driver.get("http://localhost:4200/");
//            driver.manage().window().maximize();
//
//            driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).sendKeys(rs.getString("username"));
//            driver.findElement(By.xpath("//input[@type='password']")).sendKeys(rs.getString("password"));
//
//            System.out.println(rs.getString("id"));
//            System.out.println(rs.getString("location"));
//            System.out.println(rs.getString("age"));
//        }
//
//
//
//        }
//
//
//    }
//
//
//
