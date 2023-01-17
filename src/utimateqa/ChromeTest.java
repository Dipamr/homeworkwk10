package utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {
    public static void main(String[] args) {
        String baseurl="https://courses.ultimateqa.com/users/sign_in";//stroing url
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");//setting webdriver
        WebDriver driver = new ChromeDriver();//object create
        driver.get(baseurl);
        driver.manage().window().maximize();//maximizing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//timeout session
        String title=driver.getTitle();
        System.out.println("title of the page:"+title); //printing title
        String source=driver.getPageSource();
        System.out.println("page source:"+source);
        WebElement emailIdField=driver.findElement(By.id("user[email]"));//storning email
        emailIdField.sendKeys("Pravina45@gmail.com");
        WebElement passwordField = driver.findElement(By.id("user[password]"));//storing password
        passwordField.sendKeys("london123");
        driver.close();

    }
}
