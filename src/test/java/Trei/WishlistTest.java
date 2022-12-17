package Trei;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishlistTest {
    private WebDriver driver;

    @Before
    public void getWebDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }

    @Test
    public void addToWishlistSale() {
        driver.findElement(By.cssSelector("#nav .nav-5")).click();
        driver.findElement(By.cssSelector("[title='View Details']")).click();

        driver.findElement(By.cssSelector("#swatch27")).click();
        driver.findElement(By.cssSelector("#swatch81")).click();
        driver.findElement(By.cssSelector(".product-options-bottom [title='Add to Cart']")).click();
    }

    @After
    public void close() {
        driver.close();
    }
}