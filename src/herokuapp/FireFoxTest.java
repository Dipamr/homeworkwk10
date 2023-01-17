package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxTest {
    public static void main(String[] args) {
        String baseurl="http://the-internet.herokuapp.com/login";//storing base url
        System.setProperty("webdriver.firefox.driver","src/drivers/geckodriver.exe");//setting webdriver
        WebDriver driver = new FirefoxDriver();//create object
        driver.get(baseurl);
        driver.manage().window().maximize();//maximize window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//time out session
        String title = driver.getTitle();
        System.out.println("tital of the page:"+title);
        String url= driver.getCurrentUrl();//pre defined method
        System.out.println("current url:"+url);//getting url
        String source=driver.getPageSource();
        System.out.println("page source:"+source);
        WebElement usernamefield = driver.findElement(By.name("username"));//store user name
        usernamefield.sendKeys("Pravina");//sending key
        WebElement passwordfield = driver.findElement(By.name("password"));//store password
        passwordfield.sendKeys("london123");//sending key
        driver.close();//close








    }
}
