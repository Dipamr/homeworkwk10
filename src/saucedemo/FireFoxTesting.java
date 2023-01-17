package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxTesting {
    public static void main(String[] args) {
        String baseurl = "https://www.saucedemo.com/";//stroing base url
        System.setProperty("webdriver.firefox.driver","src/drivers/geckodriver.exe");//setting webdriver
        WebDriver driver=new FirefoxDriver();//create an object
        driver.get(baseurl);
        driver.manage().window().maximize();//maximize windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//timeout session
        String title = driver.getTitle();//storing title
        System.out.println("title of the page:"+title);//printing title
        String url = driver.getCurrentUrl();
        System.out.println("current url:"+url);//getting url
        String sourse = driver.getPageSource();
        System.out.println("page source:"+sourse);
        WebElement usernamefield= driver.findElement(By.name("user-name"));//storing username
        usernamefield.sendKeys("standard_user");//sending username
        WebElement passwordfield=driver.findElement(By.name("password"));//storing password
        passwordfield.sendKeys("secret_sauce");//sending password
        driver.close();//close




    }
}
