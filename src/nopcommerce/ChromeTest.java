package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class ChromeTest {
    public static void main(String[] args) {
        String baseurl ="https://demo.nopcommerce.com/";//storing base url
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");//setting webdriver
        WebDriver driver = new ChromeDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();//maximizing windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//time out session
        String title =driver.getTitle();//storing tital
        System.out.println("title of the page:"+title);//printing title in console
        String url =driver.getCurrentUrl();//predefined method
        System.out.println("current url:"+url);//getting url
        String source = driver.getPageSource();
        System.out.println("page source:"+source);
        driver.findElement(By.className("ico-login")).click();//clicking on login link
        WebElement emailIdField=driver.findElement(By.id("Email"));//storning email
       emailIdField.sendKeys("Pravina45@gmail.com");//sending key email
        WebElement passwordField = driver.findElement(By.id("Password"));//storing password
        passwordField.sendKeys("london123");//sending key password
       driver.close();//closing browser




    }
}
