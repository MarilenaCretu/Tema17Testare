package Trei;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
    private WebDriver driver;

    @Before
    public void getWebDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }

    @Test
    public void register() {
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("[title='Register']")).click();

        driver.findElement(By.cssSelector("#firstname")).sendKeys("Marilena");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Mari");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("marilena_c2001@yahoo.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("Emilia123");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("Emilia123");
        driver.findElement(By.cssSelector("[title='Register'] span span")).click();
    }
    @After
    public void close() {
        driver.close();
    }
}
