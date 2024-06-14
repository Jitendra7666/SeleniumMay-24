import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.SelectionKey;

public class AddTenant
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://staging-admin.breadowntown.com/");


        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("bhagvan@tepia.co");
        driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@123");
        driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='sidebar-nav'][normalize-space()='Tenants']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();


        Thread.sleep(2000);
            //General-Section
        driver.findElement(By.xpath("//div[@class='tenant-general-add']//button[@class='SiteBtn2 edit-btn-tenant btn'][normalize-space()='Save']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='tenant']")).sendKeys("Tenant-Auto");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='tenant']")).click();
        Select Status = new Select(driver.findElement(By.xpath("//select[@name='status']")));
        Status.selectByVisibleText("Active");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='tenant-general-add']//button[@class='SiteBtn2 edit-btn-tenant btn'][normalize-space()='Save']")).click();
        Thread.sleep(2000);

            //Contact-Section
        driver.findElement(By.xpath("//div[@class='tenant-contact-add']//button[@class='SiteBtn2 edit-btn-tenant btn'][normalize-space()='Save']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='streetAddress']")).sendKeys("TES1");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("TEST2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='state']")).sendKeys("TEST3");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='zip']")).sendKeys("12345");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='website']")).sendKeys("www.test.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='tenantPhone']")).sendKeys("1122334455");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='tenantEmail']")).sendKeys("test12@yopmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("///div[@class='tenant-contact-add']//button[@class='SiteBtn2 edit-btn-tenant btn'][normalize-space()='Save']")).click();
        Thread.sleep(3000);

            //About-Section
        /*driver.findElement(By.xpath("//div[@class='tenant-about-add']//button[@class='SiteBtn2 edit-btn-tenant btn'][normalize-space()='Save']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='tenantNumber']")).sendKeys("Tenant_1111");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@id='category']")).click();
        Select Category = new Select(driver.findElement(By.id("category")));
        Category.selectByVisibleText("Dining");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='ticketURL']")).sendKeys("www.TicketURL.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='reservationURL']")).sendKeys("www.ReservationURL.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='orderOnlineURL']")).sendKeys("www.test.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='tenant-about-add']//button[@class='SiteBtn2 edit-btn-tenant btn'][normalize-space()='Save']")).click();
        Thread.sleep(2000);

            //Wheel of Fortune-Section
        driver.findElement(By.xpath("//div[@class='btn-head d-flex justify-content-between mb-4 ']//button[@class='SiteBtn2 edit-btn-tenant btn'][normalize-space()='Save']")).click();
        Thread.sleep(2000);
        Select StatusSelect = new Select(driver.findElement(By.name("showInWheel")));
        StatusSelect.selectByVisibleText("Active");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='position']")).sendKeys("Test1");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='discountText']")).sendKeys("Test.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='discountSubText']")).sendKeys("SubText");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='btn-head d-flex justify-content-between mb-4 ']//button[@class='SiteBtn2 edit-btn-tenant btn'][normalize-space()='Save']")).click();
        Thread.sleep(4000);

*/











       }
}
