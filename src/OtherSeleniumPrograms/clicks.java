package OtherSeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class clicks {

    @Test
    public void alertTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");

        WebElement doubleClickButton = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));


        WebElement rightClickButton = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));

        Actions actions = new Actions(driver);

        Thread.sleep(2000);


        actions.doubleClick(doubleClickButton).perform();
        Thread.sleep(4000);

        actions.contextClick(rightClickButton).perform();


        //driver.findElement(By.xpath("//a[text()='T-Shirts'][@data-reactid='31']")).click();




    }
}
