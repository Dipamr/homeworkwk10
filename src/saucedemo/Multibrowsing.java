package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Multibrowsing {
    static String browser = "chrome";
    static String baseURL = " https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.Chrome.driver", "src/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.firefox.driver", "src/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "src/drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            System.out.println("not valid browser");
        }
        driver.get(baseURL);//method to invoke url
        driver.manage().window().maximize();//maximizewindow
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//timeout session
        String title = driver.getTitle();
        System.out.println("title of the page:"+title);//printing title
        String url =driver.getCurrentUrl();
        System.out.println("crurent Url:"+url);//printing url
        String sourse = driver.getPageSource();
        System.out.println("page source:"+sourse);
        WebElement usernamefield= driver.findElement(By.name("user-name"));//storing username
        usernamefield.sendKeys("standard_user");//sending username key
        WebElement passwordfield=driver.findElement(By.name("password"));//storing password
        passwordfield.sendKeys("secret_sauce");//sending key password
        driver.close();//close driver


    }
}