package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {
    public void clickOnElement(By by) {
    WebElement element = driver.findElement(by);
        element.click();
}

    //This method will get text from element
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();

    }
    //this method will send text on element
    public void sendTextToElement(By by,String text){
        driver.findElement(by).sendKeys(text);
    }
    // for cookie display
    public void swithToAlert(){
        driver.switchTo().alert();
    }
    // This method will accept the alert
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    // his method will select the option by visible text
    public void selectByVisibleTextFromDropDown(By by,String text){
        WebElement dropDown=driver.findElement(by);
        Select select=new Select(dropDown);
        select.selectByVisibleText(text);


    }
    //Hoover to  mouse
    public void mouseHooverToElement(By by){
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(by)).perform();

    }


}
