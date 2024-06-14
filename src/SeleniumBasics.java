import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();             // Use to open Chrome
        driver.manage().window().maximize();               // Use to maximize the screen (Default it's displayed minimize)
        driver.get("https://facebook.com/");               // Use to open Website/URL

        Thread.sleep(4000);                           // Use to put waiting time for execution

        driver.switchTo().newWindow((WindowType.TAB));     // Use to open new website in same Tab
        //driver.switchTo().newWindow((WindowType.WINDOW));// Use to open new website in new Tab
        driver.get("https://Instagram.com/");

        System.out.println(driver.getTitle());             // Use to get title of website
        System.out.println(driver.getCurrentUrl());        // User to get URL of website

        Thread.sleep(4000);
        driver.close();
        //driver.quit();




       }
}
