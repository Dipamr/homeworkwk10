package orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    public static void main(String[] args) {
        String baseurl="https://opensource-demo.orangehrmlive.com/";//strring base url
        System.setProperty("web driver.edge.driver","src/drivers/msedgedriver.exe");//setting webdriver
        WebDriver driver =new EdgeDriver();//create object
        driver.get(baseurl);
        driver.manage().window().maximize();//maximize window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//time out session
        String title = driver.getTitle();//
        System.out.println("title of the page:"+title);//printing title
        String url =driver.getCurrentUrl();    //pre defined method
        System.out.println("crurent Url:"+url); //getting url
        String sourse = driver.getPageSource();
        System.out.println("page source:"+sourse);
        WebElement usernameField= driver.findElement(By.name("username")); //store user name
        usernameField.sendKeys("Admin");//sending key
        WebElement passwordField = driver.findElement(By.name("password"));//store password
        passwordField.sendKeys("admin123");//password send key
        driver.close();//close




    }
}
