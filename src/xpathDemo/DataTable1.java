package xpathDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DataTable1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver(); // upcasting

        driver.manage().window().maximize();
        driver.get("https://editor.datatables.net/examples/simple/inTableControls.html");

       // driver.findElement(By.xpath("//tr[td[text()='Bruno Nash']]//td[contains(@class,'-edit')]/button")).click();


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       // Thread.sleep(10000);

        String name = "Caesar Vance";

        driver.findElement(By.xpath("//tr[td[text()='"+name+"']]//td[contains(@class,'delete')]/button")).click();



    }
}
