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

        WebElement txtusername1 = driver.findElement(By.id("username"));
        txtusername1.sendKeys("admin");

        WebElement txtpassword1 = driver.findElement(By.id("password"));
        txtpassword1.sendKeys("Admin12");


        Thread.sleep(2000);



    }
}
