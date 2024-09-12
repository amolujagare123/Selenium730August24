package DataProvider;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class LoginDataProviderWithHeaders {

    @Test (dataProvider = "getData")
    public void loginTest2(String username,String password)
    {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys(username);

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys(password);

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }

    @DataProvider
    Object[][] getData() throws IOException {

        FileInputStream fis = new FileInputStream("Data/data2.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Sheet2");
        int rowCount = sheet.getPhysicalNumberOfRows(); // 6
        Object[][] data = new Object[rowCount-1][2];

        for(int i=0; i < rowCount-1 ;i++) // 6 ---> 0 - 5
        {
            XSSFRow row = sheet.getRow(i+1);

            data[i][0] = row.getCell(0).toString();
            data[i][1] =  row.getCell(1).toString();
        }

        return data;
    }
}
