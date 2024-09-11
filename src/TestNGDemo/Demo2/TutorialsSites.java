package TestNGDemo.Demo2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialsSites extends Base {


    @Test
    public void w3schools() {
        driver.get("https://www.w3schools.com");
    }

    @Test
    public void tutorialspoint() {
        driver.get("https://www.tutorialspoint.com");
    }

    @Test
    public void geeksForGeeks() {
        driver.get("https://www.geeksforgeeks.org");
    }

    @Test
    public void javatpoint() {
        driver.get("https://www.javatpoint.com");
    }
}
