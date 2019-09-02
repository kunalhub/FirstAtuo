import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NopCommers {

    protected static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver.exe");

        // open the driver
        driver = new ChromeDriver();
        // maximise the brower window screen
        driver.manage().window().fullscreen();
        // set implicitywait for driver object
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // open the website
        driver.get("https://demo.nopcommerce.com/");
        // click on log in
        driver.findElement(By.xpath("//a[@href=\"/login?returnUrl=%2F\"]")).click();
        // enter email
        driver.findElement(By.xpath("//input[@class='email']")).sendKeys("kunalraval73@gmail.com");
        // enter Password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("love007");
        // click on login
        driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();
        // click on apple macbook pro 13-inch
        driver.findElement(By.xpath("//h2//a[@href=\"/apple-macbook-pro-13-inch\"]")).click();
        // click in email a friend
        driver.findElement(By.xpath("//input[@value='Email a friend']")).click();
        // click on enater friend's email
        driver.findElement(By.xpath("//input[@class='friend-email']")).sendKeys("kunalraval73@gmail.com");
        // type massage
        driver.findElement(By.xpath("//textarea[@id='PersonalMessage']")).sendKeys("please check this");
        // click on send email
        driver.findElement(By.xpath("//input[@name='send-email']")).click();
        //driver.quite();

    }
}
