package orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {
    public static void main(String[] args) {
        String baseurl ="https://opensource-demo.orangehrmlive.com/";//storing url
        System.setProperty("web driver.chrome","src/drivers/chromedriver.exe");//setting webdriver
        WebDriver driver = new ChromeDriver();//create object
        driver.get(baseurl);
        driver.manage().window().maximize();//maximize window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//timeout session
        String title= driver.getTitle();//stroing title
        System.out.println("title of page:"+title);//printing title
        String url =driver.getCurrentUrl();//pre defined method
        System.out.println("current url:"+url);//getting url
        String sourse = driver.getPageSource();
        System.out.println("page source:"+sourse);
        WebElement usernameField= driver.findElement(By.name("username")); //store user name
        usernameField.sendKeys("Admin");//sending key
        WebElement passwordField = driver.findElement(By.name("password"));//store password
        passwordField.sendKeys("admin123");//password send key
        driver.close();//













    }
}
