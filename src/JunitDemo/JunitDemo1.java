package JunitDemo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo1
{
    @Test
    public void loginTest1()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.org/");

        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("");
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("");

        WebElement Submit = driver.findElement(By.xpath("//input[@name='submit']"));
        Submit.click();

    }
    @Test
    public void loginTest2()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.org/");

        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("admin1");
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("admin");

        WebElement Submit = driver.findElement(By.xpath("//input[@name='submit']"));
        Submit.click();

    }
    @Test
    public void loginTest3()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.org/");

        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("admin1");

        WebElement Submit = driver.findElement(By.xpath("//input[@name='submit']"));
        Submit.click();

    }
    @Test
    public void loginTest4()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.org/");

        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("admin1");
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("admin1");

        WebElement Submit = driver.findElement(By.xpath("//input[@name='submit']"));
        Submit.click();

    }
    @Test
    public void loginTest5()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.org/");

        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("admin");

        WebElement Submit = driver.findElement(By.xpath("//input[@name='submit']"));
        Submit.click();

    }
}
