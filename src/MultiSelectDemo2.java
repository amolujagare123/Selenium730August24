import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDemo2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.click.in/pune/classifieds/60/post.html");

        // 1. find the web element
        WebElement jobLocation1 = driver.findElement(By.id("source_118"));

        // 2. create the object of Select class
        Select selText1 = new Select(jobLocation1);

        Thread.sleep(2000);

        // 3. select the option
        selText1.selectByVisibleText("Bangalore");
        selText1.selectByVisibleText("Mumbai");
        selText1.selectByVisibleText("Goa");

        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]")).click();

        WebElement jobLocation2 = driver.findElement(By.id("fld_118"));
        Select selText2 = new Select(jobLocation2);
        selText2.selectByVisibleText("Mumbai");
        selText2.selectByVisibleText("Goa");


        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]")).click();




    }
}
