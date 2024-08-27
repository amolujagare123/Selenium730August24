package xpathDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DataMyntra2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver(); // upcasting

        driver.manage().window().maximize();
        driver.get("https://www.myntra.com");
        WebElement men =  driver.findElement(By.xpath("//a[text()='Men'][@data-reactid='21']"));

           Actions actions = new Actions(driver);
           actions.moveToElement(men).perform();
           driver.findElement(By.xpath("//a[text()='T-Shirts'][@data-reactid='31']")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String name = "DIXCY SCOTT";

        String price = driver.findElement(By.xpath("//div[ h3[text()='"+name+"']]//span[@class='product-discountedPrice']")).getText();

        System.out.println(price);





    }
}
