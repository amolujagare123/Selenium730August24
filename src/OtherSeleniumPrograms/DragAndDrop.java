package OtherSeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {

    @Test
    public void alertTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");

        WebElement source = driver.findElement(By.xpath("//img[@id='drag1']"));
        WebElement target = driver.findElement(By.xpath("//div[@id='div2']"));

        Thread.sleep(2000);

        Actions actions = new Actions(driver);

        Thread.sleep(4000);

        actions.dragAndDrop(source,target).perform();

        //driver.findElement(By.xpath("//a[text()='T-Shirts'][@data-reactid='31']")).click();




    }
}
