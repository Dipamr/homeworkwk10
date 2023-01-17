package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    public static void main(String[] args) {
        String baseurl ="https://www.saucedemo.com/";//stroing base url
        System.setProperty("webdriver.chrome.driver","src/drivers/msedgedriver.exe");//setting browser
        WebDriver driver=new EdgeDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();//maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//timeout session
        String title = driver.getTitle();//storting title
        System.out.println("title of the page:"+title);
        String url =driver.getCurrentUrl();    //pre defined method
        System.out.println("crurent Url:"+url); //getting url
        String sourse = driver.getPageSource();
        System.out.println("page source:"+sourse);
        WebElement usernamefield= driver.findElement(By.name("user-name"));//storing username
        usernamefield.sendKeys("standard_user");//sending username
        WebElement passwordfield=driver.findElement(By.name("password"));//storing password
        passwordfield.sendKeys("secret_sauce");//sending password
        driver.close();//close browser


    }
}
