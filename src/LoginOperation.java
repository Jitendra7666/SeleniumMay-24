import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOperation
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");

        WebElement txtusername = driver.findElement(By.id("username"));
        txtusername.sendKeys("admin");

        WebElement txtpassword = driver.findElement(By.id("password"));
        txtpassword.sendKeys("Admin12");


        Thread.sleep(2000);



    }
}
