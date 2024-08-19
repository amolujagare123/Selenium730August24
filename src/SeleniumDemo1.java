import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumDemo1 {

    public static void main(String[] args) {

       WebDriver driver = new ChromeDriver(); // upcasting

      //  WebDriver driver = new FirefoxDriver();
     //   WebDriver driver = new EdgeDriver();

      //  WebDriver driver = new SafariDriver();

     //  WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://gmail.com");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

    }
}
