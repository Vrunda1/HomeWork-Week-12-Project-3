package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class RegisterTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        // click on the ‘Register’ link
        clickOnElement(By.linkText("Register"));

        //Verify the text ‘Register’
        String expectedOutput = "Register";

       // WebElement actual = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        String actualMessage = getTextFromElement(By.xpath("//a[contains(text(),'Register')]"));
        Assert.assertEquals(expectedOutput, actualMessage);
    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {
        // click on the ‘Register’ link
        clickOnElement(By.linkText("Register"));
        //  Select gender radio button
       clickOnElement(By.xpath("//input[@id='gender-female']"));
       //Enter First name
        sendTextToElement(By.id("FirstName"),"Rosaa");
        //Enter Last name
                sendTextToElement(By.xpath("//input[@id='LastName']"),"Shaarmaa");
        // select birth
        clickOnElement(By.xpath("//select[@name='DateOfBirthDay']/option[10]"));
        //Select month
       clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]"));
        //Select year
       clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]"));
        //Select Email
        sendTextToElement(By.xpath("//input[@id='Email']"),"missjoan1231@gmail.com");

        //Select password
        sendTextToElement(By.xpath("//input[@id='Password']"),"abc1234");

        //Select confirm password
        sendTextToElement(By.xpath("//input[@id='ConfirmPassword']"),"abc1234");

        //Select register
        clickOnElement(By.xpath("//button[@id='register-button']"));

        //Verifying
        String expectedResult = "Your registration completed";
        String actualMessage = getTextFromElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
       Assert.assertEquals(expectedResult, actualMessage);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
