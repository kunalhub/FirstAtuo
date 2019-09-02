import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrengWeb {
    protected static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        // open the driver
        driver = new ChromeDriver();
        // maximise the brower window screen
        driver.manage().window().fullscreen();
        // set implicitywait for driver object
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // open the website
        driver.get("https://opensource-demo.orangehrmlive.com/");
        // enter username
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        // enter Password
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        // click on login
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        // click on welcome admin
        driver.findElement(By.xpath("//a[@id='welcome']")).click();
        // click on logout
        driver.findElement(By.xpath("//a[@href='/index.php/auth/logout']")).click();

        // drive.quite();

    }
    }


