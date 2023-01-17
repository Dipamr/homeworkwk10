package orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class FireFoxTest {
    public static void main(String[] args) {
        String baseurl = "https://opensource-demo.orangehrmlive.com/";//storing url
        System.setProperty("webdriver.firefox.driver","src/drivers/geckodriver.exe");//setting webdriver
        WebDriver driver = new EdgeDriver();//creating object
        driver.get(baseurl);
        driver.manage().window().maximize();//maximizing windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //timeout session
        String tital = driver.getTitle();   //storing tital
        System.out.println("tital of the page:"+tital);      //printing tital in console
        String url =driver.getCurrentUrl();
        System.out.println("crurent Url:"+url);
        WebElement usernameField= driver.findElement(By.name("username")); //store user name
        usernameField.sendKeys("Admin");//sending key
        WebElement passwordField = driver.findElement(By.name("password"));//store password
        passwordField.sendKeys("admin123");//password send key
        driver.close();//close

    }
}
