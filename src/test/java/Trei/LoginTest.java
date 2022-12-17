package Trei;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver driver;

    @Before
    public void getWebDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }

    @Test
    public void loginWithValidData(){
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("[title='Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("marilena_c2001@yahoo.com");
        driver.findElement(By.id("pass")).sendKeys("Emilia123");
        driver.findElement(By.id("send2")).click();

        WebElement welcomeTextElement = driver.findElement(By.cssSelector(".hello strong"));
        String expectedText = "Hello, Marilena Mari!";
        String actualText = welcomeTextElement.getText();
        Assert.assertEquals(expectedText,actualText);

        WebElement myAccount = driver.findElement(By.cssSelector(".block-account span"));
        Assert.assertTrue(myAccount.isDisplayed());
    }

    @After
    public void close() {
        driver.close();
    }
}
