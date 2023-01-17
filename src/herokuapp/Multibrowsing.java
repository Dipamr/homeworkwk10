package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Multibrowsing {
    static String browser = "Chrome";
    static String baseurl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.firefox.driver", "src/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.Chrome.driver", "src/drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            System.out.println("not valid browse");
        }
        driver.get(baseurl);//method to invoke url
        driver.manage().window().maximize();//maximize window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//timeout session
        String title=driver.getTitle();//predefined method
        System.out.println("title os the page:"+title);//priting title
        String url=driver.getCurrentUrl();
        System.out.println("current url:"+url);//printing url
        WebElement usernamefield = driver.findElement(By.name("username"));//storing username
        usernamefield.sendKeys("Pravina");//sendind key to email
        WebElement password = driver.findElement(By.name("password"));//storing password
        password.sendKeys("london123");//sending key to password
        driver.close();//close browser



    }
}