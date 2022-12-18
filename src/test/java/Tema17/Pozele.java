package Tema17;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Pozele {
    private WebDriver driver;

    @Before
    public void getWebDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");

    }

    //poza 1
    @Test
    public void search() {
        driver.findElement(By.cssSelector("#search")).sendKeys("tale");
        driver.findElement(By.cssSelector("[title='Search']")).click();
    }

    //poza 2
    @Test
    public void addPozition() {
        driver.findElement(By.cssSelector("#nav .nav-5")).click();
        driver.findElement(By.cssSelector("[title='Sort By']")).click();
    }

    //poza 3
    @Test
    public void addProduse() {
        driver.findElement(By.cssSelector("#search")).sendKeys("vase");
        driver.findElement(By.cssSelector("[title='Search']")).click();
        driver.findElement(By.cssSelector("[title='View Details']")).click();
        driver.findElement(By.cssSelector("#super_group_387")).clear();
        driver.findElement(By.cssSelector("#super_group_387")).sendKeys("1");
        driver.findElement(By.cssSelector(".add-to-box [title='Add to Cart']")).click();

        driver.findElement(By.cssSelector("#nav .nav-5")).click();
        driver.findElement(By.cssSelector("[title='View Details']")).click();
        driver.findElement(By.cssSelector("#swatch27 > span.swatch-label > img")).click();
        driver.findElement(By.cssSelector("#swatch81 > span.swatch-label")).click();
        driver.findElement(By.cssSelector(".add-to-cart [title='Add to Cart']")).click();
    }

    //poza 4
    @Test
    public void deleteProdus() {
        driver.findElement(By.cssSelector("#nav .nav-5")).click();
        driver.findElement(By.cssSelector("[title='View Details']")).click();
        driver.findElement(By.cssSelector("#swatch27 > span.swatch-label > img")).click();
        driver.findElement(By.cssSelector("#swatch81 > span.swatch-label")).click();
        driver.findElement(By.cssSelector(".add-to-cart [title='Add to Cart']")).click();

        driver.findElement(By.cssSelector("#search")).sendKeys("tale");
        driver.findElement(By.cssSelector("[title='Search']")).click();
        driver.findElement(By.cssSelector("[title='View Details']")).click();
        driver.findElement(By.cssSelector("#downloadable-links-list label")).click();
        driver.findElement(By.cssSelector(".add-to-cart [title='Add to Cart']")).click();
        driver.findElement(By.cssSelector("#shopping-cart-table .product-cart-remove")).click();
    }


    @After
    public void close() {
        driver.close();
    }
}
