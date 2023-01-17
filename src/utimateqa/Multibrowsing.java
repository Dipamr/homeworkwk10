package utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Multibrowsing {
    static String browser = "Chrome";
    static String baseURL = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.firefox.driver", "src/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "src/drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            System.out.println("not valid browser ");
        }
        driver.get(baseURL);//method to invoke url
        driver.manage().window().maximize();//maximizewindow
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//time out session
        String title = driver.getTitle();
        System.out.println("title of the page:" + title);//printing title
        String url =driver.getCurrentUrl();
        System.out.println("crurent Url:"+url);//printing url
        String source = driver.getPageSource();
        System.out.println("page source:" + source);
        WebElement emailIdField = driver.findElement(By.id("user[email]"));//storing email
        emailIdField.sendKeys("Pravina45@gmail.com");//sending key email
        WebElement passwordField = driver.findElement(By.id("user[password]"));//storing password
        passwordField.sendKeys("london123");//sending key password
        driver.close();//close browser
    }

}