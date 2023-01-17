package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    public static void main(String[] args) {
        String baseurl = "https://demo.nopcommerce.com/";//storing base url
        System.setProperty("webdriver.edge.driver","src/drivers/msedgedriver.exe"); //setting webdriver
        WebDriver driver=new EdgeDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();//maximizing windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //timeout session
        String tital = driver.getTitle();   //storing tital
        System.out.println("tital of the page:"+tital);//printing tital in console
        String url =driver.getCurrentUrl();
        System.out.println("crurent Url:"+url);
        driver.findElement(By.className("ico-login")).click();  //clicking on login link
        WebElement emailIdField=driver.findElement(By.id("Email")); //storing email
        emailIdField.sendKeys("Pravina45@gmail.com");//sending key to email
        WebElement passwordField =driver.findElement(By.id("Password")); //storing password
        passwordField.sendKeys("london123"); //send key to password field
        driver.close();  //closing browser




    }
}
