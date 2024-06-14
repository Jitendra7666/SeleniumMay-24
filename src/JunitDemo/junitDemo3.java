package JunitDemo;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitDemo3
{
    static WebDriver driver;

    @BeforeClass  //
    public static void OpenBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void CloseBrowser()
    {
        driver.close();
    }
    @Test
    public void loginTest1()
    {
        driver.get("http://stock.scriptinglogic.org/");

        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("");
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("");

        WebElement Submit = driver.findElement(By.xpath("//input[@name='submit']"));
        //Submit.click();

    }
    @Test
    public void loginTest2()
    {
        driver.get("http://stock.scriptinglogic.org/");

        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("admin1");
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("admin");

        WebElement Submit = driver.findElement(By.xpath("//input[@name='submit']"));
      //  Submit.click();

    }
    @Test
    public void loginTest3()
    {
        driver.get("http://stock.scriptinglogic.org/");

        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("admin1");

        WebElement Submit = driver.findElement(By.xpath("//input[@name='submit']"));
        //Submit.click();

    }
    @Test
    public void loginTest4()
    {
        driver.get("http://stock.scriptinglogic.org/");

        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("admin1");
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("admin1");

        WebElement Submit = driver.findElement(By.xpath("//input[@name='submit']"));
        //Submit.click();

    }
    @Test
    public void loginTest5()
    {
        driver.get("http://stock.scriptinglogic.org/");

        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("admin");

        WebElement Submit = driver.findElement(By.xpath("//input[@name='submit']"));
        //Submit.click();

    }
}
