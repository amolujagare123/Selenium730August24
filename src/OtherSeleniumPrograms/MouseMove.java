package OtherSeleniumPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseMove {

    @Test
    public void alertTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.myntra.com/");

        WebElement men = driver.findElement(By.xpath("//a[@class='desktop-main'][normalize-space()='Men']"));

        Thread.sleep(2000);

        Actions actions = new Actions(driver);

        actions.moveToElement(men).perform();


        driver.findElement(By.xpath("//a[text()='T-Shirts'][@data-reactid='31']")).click();




    }
}
