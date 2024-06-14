import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class SeleniumDemo
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();          // Use to open Chrome
        driver.manage().window().maximize();            // Use to maximize the screen (Default it's displayed minimize)
        driver.get("https://facebook.com/");

        driver.switchTo().newWindow((WindowType.WINDOW));
        driver.get("https://Instagram.com");

        driver.switchTo().newWindow((WindowType.WINDOW));
        driver.get("https://Naukri.com");

        Thread.sleep(2000);
        List<String > windows = new ArrayList<>(driver.getWindowHandles()); // Use to store list of all windows

        driver.switchTo().window(windows.get(1));                           // Use to switch on particular window (Index start form ZERO)

        System.out.println(driver.getTitle());
    }


}
