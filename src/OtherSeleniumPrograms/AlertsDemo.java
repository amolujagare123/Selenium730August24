package OtherSeleniumPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertsDemo {

    @Test
    public void alertTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/amol.html");

        driver.findElement(By.xpath("//button[text()='Try it']")).click();

        Thread.sleep(4000);

        Alert alert = driver.switchTo().alert();
        //alert.accept();
        System.out.println(alert.getText());
        alert.dismiss();
    }
}
