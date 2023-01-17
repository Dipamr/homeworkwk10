package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {
    public static void main(String[] args) {
        String baseurl = "http://the-internet.herokuapp.com/login";//storing base url
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");//setting webdriver
        WebDriver driver =new ChromeDriver();//create object
        driver.get(baseurl);
        driver.manage().window().maximize();//maximizing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//timeout session
        String title = driver.getTitle();//storing title
        System.out.println("title of page:"+title);//printing title
        String url =driver.getCurrentUrl();    //pre defined method
        System.out.println("crurent Url:"+url); //print url
        String sourse = driver.getPageSource(); //get source
        System.out.println("page source:"+sourse);
        WebElement usernameField= driver.findElement(By.name("username")); //store user name
        usernameField.sendKeys("Pravina");//sending key
        WebElement passwordField = driver.findElement(By.name("password"));//store password
        passwordField.sendKeys("london123");//send password
        driver.close();




    }
}
