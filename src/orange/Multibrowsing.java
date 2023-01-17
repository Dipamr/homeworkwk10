package orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Multibrowsing {
    static String browser="Chrome";
    static String basrurl="https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.Chrome.driver","src/drivers/chromedriver.exe");
            driver=new ChromeDriver();
        }else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.Firefox.driver","src/drivers/geckodriver.exe");
            driver=new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver","src/drivers/msedgedriver.exe");
            driver=new EdgeDriver();
        }else{
            System.out.println("not valid browser");
        }
        driver.get(basrurl);//method to invoke url
        driver.manage().window().maximize();//maximizewindow
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//timeout session
        String title= driver.getTitle();
        System.out.println("title is:"+title);//printing title
        String url= driver.getCurrentUrl();
        System.out.println("current url:"+url);//printing url
        WebElement uernameIdfield = driver.findElement(By.name("username"));//storing username
        uernameIdfield.sendKeys("Admin");//sending email key
        WebElement passwordfield= driver.findElement(By.name("password"));//storing email
        passwordfield.sendKeys("admin123");//sending password key
        driver.close();//close browser

    }

}
