package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {
    public static void main(String[] args) {
        String baseurl="https://www.saucedemo.com/";//storing url
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");//setting browser
        WebDriver driver =new ChromeDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();//maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//timeout session
        String title=driver.getTitle();
        System.out.println("title of the page:"+title);//printing title
        String url= driver.getCurrentUrl();//pre defined method
        System.out.println("current url:"+url);//getting url
        String source=driver.getPageSource();
        System.out.println("page source:"+source);
        WebElement usernamefield=driver.findElement(By.name("user-name"));//storing username
        usernamefield.sendKeys("standard_user");//sending key
        WebElement passwordField= driver.findElement(By.id("password"));//storing password
        passwordField.sendKeys("secret_sauce");
        driver.close();//close browser
    }
}
