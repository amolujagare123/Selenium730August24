package TestNGDemo.Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobSites extends Base{


    @Test
    public void naukri() {
        driver.get("http://naukri.com");
        Assert.assertEquals(driver.getTitle(),"Naukri - job",
                "this is not a naukri page");
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
