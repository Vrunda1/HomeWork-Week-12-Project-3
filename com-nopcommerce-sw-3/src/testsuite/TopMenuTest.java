package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    //NavigateToComputerPage
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //click on the ‘Computers’ Tab and click

        WebElement computerLink = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
        computerLink.click();

        //Verify the text ‘Computers

        String expectedResult = "Computers";

        WebElement actualMessage = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
        String actualResult = actualMessage.getText();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        // click on the ‘Electronics’ Tab
        WebElement electronics = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        electronics.click();

        String expectedResult = "Electronics";

        WebElement actual = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        String actualText = actual.getText();

        //Verify the text ‘Electronics’
        Assert.assertEquals(expectedResult, actualText);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        // click on the ‘‘Digital downloads’ Tab
        WebElement apparel = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1] "));
        apparel.click();

        String expectedResult = "Apparel";

        WebElement actualElement = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]"));
        String actualMessage = actualElement.getText();

        //Verify the text ‘Apparel’
        Assert.assertEquals(expectedResult, actualMessage);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //click on the ‘Digital downloads’ Tab
        WebElement digiDownLoad = driver.findElement(By.linkText("Digital downloads"));
        digiDownLoad.click();

        String expectedResult = "Digital downloads";

        WebElement actualElement = driver.findElement(By.linkText("Digital downloads"));
        String actualMessage = actualElement.getText();

        //Verify the text ‘Apparel’
        Assert.assertEquals(expectedResult, actualMessage);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
//         // click on the ‘Books’Tab

        WebElement book = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]"));
        book.click();

        String expectedResult = "Books";

        WebElement actualElement = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]"));
        String actualMessage = actualElement.getText();

        //Verify the text ‘Books’
        Assert.assertEquals(expectedResult, actualMessage);

    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //click on the ‘Jewelry’ Tab
        WebElement jewelry = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));
        jewelry.click();

        String expectedResult = "Jewelry";

        WebElement actualElement = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));
        String actualMessage1 = actualElement.getText();

        //Verify the text ‘Jewelry’
        Assert.assertEquals(expectedResult, actualMessage1);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        //click on the ‘Gift Cards’ Tab
        WebElement giftcard = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]"));
        giftcard.click();

        String expectedResult = "Gift Cards";

        WebElement actualElement = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]"));
        String actualMessage1 = actualElement.getText();

        //Verify the text ‘Gift Cards’
        Assert.assertEquals(expectedResult, actualMessage1);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}















