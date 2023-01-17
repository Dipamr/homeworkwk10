package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Multibrowsing {
    static String browser="Chrome";
    static String baseurl ="https://demo.nopcommerce.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
            driver=new ChromeDriver();
        }else if(browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.Firefox.driver","src/drivers/geckodriver.exe");
            driver=new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver","src/drivers/msedgedriver.exe");
            driver=new EdgeDriver();
        }else {
            System.out.println("not valid browser");
        }
        driver.get(baseurl);//method to invoke url
        driver.manage().window().maximize();//maximizewindow
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//timeout session
        String title= driver.getTitle();
        System.out.println("tital of page:"+title);//pring title
        String url= driver.getCurrentUrl();
        System.out.println("current url:"+url);//printing url
        driver.findElement(By.className("ico-login")).click();//clicling login
        WebElement emailIdField= driver.findElement(By.id("Email"));//storing email
        emailIdField.sendKeys("Pravina45@gmail.com");//sending email key
        WebElement passworffield= driver.findElement(By.id("Password"));//string password
        passworffield.sendKeys("london123");
        driver.close();//close browser

    }
}
