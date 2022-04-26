package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //Find log in link and click on login link
        clickOnElement(By.linkText("Log in"));
        String expectedMessage = "Welcome, Please Sign In!";
        //Find the welcome test element and get the text
            String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        //Validate actual and expected message
        Assert.assertEquals("Not navigate to both page", expectedMessage, actualMessage);
    }

    @Test

    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Find log in link and click on login link
        clickOnElement(By.linkText("Log in"));
        //Enter valid username
        sendTextToElement(By.id("Email"),"missjoan1231@gmail.com");
        //Enter valid password
        sendTextToElement(By.name("Password"),"abc1234");
        //Click on ‘LOGIN’ button
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));
        //log out
        String expectedMessage = "Log out";
        String actualResult11 = getTextFromElement(By.linkText("Log out"));
        //verify messages
        Assert.assertEquals(expectedMessage, actualResult11);
        clickOnElement(By.linkText("Log out"));
    }

    @Test
    public void verifyTheErrorMessage() {
        // click on the ‘Login’ link
        clickOnElement(By.linkText("Log in"));
//        //Enter Invalid username
        sendTextToElement(By.xpath("//input[@id='Email']"),"missjoan1231@gmail.com");
        //Enter Invalid password
        sendTextToElement(By.name("Password"),"abc1234");
        //Click on ‘LOGIN’ button
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));
        //verify messages
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        String actualLogin = getTextFromElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]"));
        Assert.assertEquals(expectedMessage, actualLogin);
    }
    @After
    public void tearDown() {
        closeBrowser();

    }
}





