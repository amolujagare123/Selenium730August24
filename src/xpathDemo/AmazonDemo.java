package xpathDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver(); // upcasting

        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/s?k=amol+ujagare");

        driver.findElement(By.xpath("//img[contains (@alt ,'The Investment')]")).click();





    }
}
