package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxTest {
    public static void main(String[] args) {
        String baseurl ="https://demo.nopcommerce.com/";//storing url
        System.setProperty("web driver firefox.driver","src/drivers/geckodriver.exe");//storing webdriver
        WebDriver driver = new FirefoxDriver();
        driver.get(baseurl);
        driver.manage().window().maximize(); //maximizing windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title = driver.getTitle();  //storing title
        System.out.println("title of the page:" +title);//printing title
        String url = driver.getCurrentUrl();
        System.out.println("current url:"+url);
        driver.findElement(By.className("ico-login")).click();//clickin on login
        WebElement emailIdField = driver.findElement(By.id("Email"));//sending key email
        emailIdField.sendKeys("Pravina45@gmail.com");
        WebElement passwordField = driver.findElement(By.id("Password"));//sending password
        passwordField.sendKeys("london123");
        driver.close();



    }
}
