package AssertionDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class AddCustomer {



    @Test
    public void addCustomerTest()
    {
        WebDriver driver = new ChromeDriver(); // upcasting

        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        //WebElement lnkAddCustomer = driver.findElement(By.linkText("Add Customer"));
        WebElement lnkAddCustomer = driver.findElement(By.partialLinkText("d Cust"));
        lnkAddCustomer.click();

        driver.findElement(By.name("name")).sendKeys("rajeshwari1");
        driver.findElement(By.name("address")).sendKeys("xyz");
        driver.findElement(By.name("contact1")).sendKeys("656565656");
        driver.findElement(By.name("contact2")).sendKeys("65656565");
        driver.findElement(By.name("Submit")).click();

        String expected = "Dublicat Entry. Please Verify";

        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='error-box round']")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("actual="+actual);
        System.out.println("expected="+expected);

        Assert.assertEquals(actual,expected,"incorrect or no error message");

    }

    @Test
    public void addCustomerTest2()
    {
        WebDriver driver = new ChromeDriver(); // upcasting

        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        //WebElement lnkAddCustomer = driver.findElement(By.linkText("Add Customer"));
        WebElement lnkAddCustomer = driver.findElement(By.partialLinkText("d Cust"));
        lnkAddCustomer.click();

        String name = "rajeshwari2";

        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys("xyz");
        driver.findElement(By.name("contact1")).sendKeys("656565656");
        driver.findElement(By.name("contact2")).sendKeys("65656565");
        driver.findElement(By.name("Submit")).click();

        String expected = "[ "+name+" ] Customer Details Added !";

        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='confirmation-box round']")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("actual="+actual);
        System.out.println("expected="+expected);

        Assert.assertEquals(actual,expected,"incorrect or no success message");

    }

    @Test
    public void addCustomerTest3()
    {
        WebDriver driver = new ChromeDriver(); // upcasting

        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        //WebElement lnkAddCustomer = driver.findElement(By.linkText("Add Customer"));
        WebElement lnkAddCustomer = driver.findElement(By.partialLinkText("d Cust"));
        lnkAddCustomer.click();

        String name = "rajeshwari3";

        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("contact1")).sendKeys("12");


        driver.findElement(By.name("Submit")).click();

        String expected = "PLEASE ENTER AT LEAST 3 CHARACTERS.";

        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//*[@class='error']")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("actual="+actual);
        System.out.println("expected="+expected);

        Assert.assertEquals(actual,expected,"incorrect or no error message");

    }

    @Test
    public void addCustomerTest4()
    {
        WebDriver driver = new ChromeDriver(); // upcasting

        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        //WebElement lnkAddCustomer = driver.findElement(By.linkText("Add Customer"));
        WebElement lnkAddCustomer = driver.findElement(By.partialLinkText("d Cust"));
        lnkAddCustomer.click();

        String name = "rajeshwari3";

      //  driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("contact1")).sendKeys("12");
        driver.findElement(By.name("contact2")).sendKeys("12");


        driver.findElement(By.name("Submit")).click();

        String expected1 = "PLEASE ENTER A CUSTOMER NAME";
        String expected2 = "PLEASE ENTER AT LEAST 3 CHARACTERS.";
        String expected3 = "PLEASE ENTER AT LEAST 3 CHARACTERS.";

        ArrayList<String> expected = new ArrayList<>();
        expected.add(expected1);
        expected.add(expected2);
        expected.add(expected3);
        ArrayList<String> actual = new ArrayList<>();


        try {
            List<WebElement> wbList = driver.findElements(By.xpath("//label[@class='error']"));

            for (WebElement wb:wbList)
            {
                actual.add(wb.getText());
            }

        }
        catch (Exception e)
        {

        }
        System.out.println("actual="+actual);
        System.out.println("expected="+expected);

        Assert.assertEquals(actual,expected,"incorrect or no error message");

    }


}
