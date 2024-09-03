package TestNGDemo.Demo2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSites {
    WebDriver driver;

    @BeforeClass
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void closeBrowser() throws InterruptedException {
        driver.close();
    }

    @Test
    public void facebook() {
        driver.get("https://www.facebook.com");
    }

    @Test
    public void twitter() {
        driver.get("https://www.twitter.com");
    }

    @Test
    public void instagram() {
        driver.get("https://www.instagram.com");
    }

    @Test
    public void linkedin() {
        driver.get("https://www.linkedin.com");
    }
}
