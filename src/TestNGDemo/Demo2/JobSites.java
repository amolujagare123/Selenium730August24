package TestNGDemo.Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobSites {

    WebDriver driver;

    @BeforeClass
    public void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public  void closeBrowser() throws InterruptedException {
        driver.close();
    }

    @Test
    public void naukri() {
        driver.get("http://naukri.com");
    }

    @Test
    public void monsterIndia() {
        driver.get("https://www.monsterindia.com");
    }

    @Test
    public void shine() {
        driver.get("https://www.shine.com");
    }

    @Test
    public void timesJobs() {
        driver.get("https://www.timesjobs.com");
    }

    @Test
    public void freshersworld() {
        driver.get("https://www.freshersworld.com");
    }

}
