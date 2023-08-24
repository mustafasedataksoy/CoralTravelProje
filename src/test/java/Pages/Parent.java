package Pages;

import Utulities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {


    public void sendKeysFunction(WebElement element , String value)
    {
        waitUntilVisible(element);
        element.clear();
        element.sendKeys(value);
       // scrollToElement(element);
    }




    public void waitUntilVisible(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));


    }


    public void scrolltoElement(WebElement element)
    {
        JavascriptExecutor js = (JavascriptExecutor)  GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",element);
    }



    public void clickFunction(WebElement element)
    {
        waitUntilClickable(element);
        waitUntilVisible(element);
       // scrollToElement(element);
        element.click();

    }


    public void waitUntilClickable(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(),Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void verifyContainsText(WebElement element , String text)
    {
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
    }




}
