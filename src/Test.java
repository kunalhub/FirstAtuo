import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test {

    protected static WebDriver driver;

    public static void main (String[] args)
    {
     System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver.exe");

     // open the driver
        driver = new ChromeDriver();
        // maximise the brower window screen
        driver.manage().window().fullscreen();
        // set implicitywait for driver object
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // open the website
        driver.get("https://demo.nopcommerce.com/");
        // click on register button
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        // enter firstname
        driver.findElement(By.id("FirstName")).sendKeys("Kunal");
        // enter lastname
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Raval");
        // enter email
        driver.findElement(By.name("Email")).sendKeys("kunalraval73@gmail.com");
        // enter password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("love007");
        // confirm password
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("love007");
        // click on register
        driver.findElement(By.xpath("//input[@id='register-button']")).click();

        //driver.quite();


    }
}
