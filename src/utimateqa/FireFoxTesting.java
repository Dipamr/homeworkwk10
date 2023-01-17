package utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxTesting {
    public static void main(String[] args) {
        String baseurl ="https://courses.ultimateqa.com/users/sign_in" ;//strore url
        System.setProperty("webdriver.firefox.driver","src/drivers/geckodriver.exe");//setting webdriver
        WebDriver driver = new FirefoxDriver();//object create
        driver.get(baseurl);
        driver.manage().window().maximize();//maximize
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//timeout session
        String title=driver.getTitle();
        System.out.println("title of the page:"+title); //printing title
        String source=driver.getPageSource();
        System.out.println("page source:"+source);
        WebElement emailIdField=driver.findElement(By.id("user[email]"));//storning email
        emailIdField.sendKeys("Pravina45@gmail.com");//sending key email
        WebElement passwordField = driver.findElement(By.id("user[password]"));//storing password
        passwordField.sendKeys("london123");//sending key password
        driver.close();//closing browser
    }
}
