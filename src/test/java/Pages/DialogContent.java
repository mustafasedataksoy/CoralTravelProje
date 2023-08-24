package Pages;

import Utulities.GWD;
import io.cucumber.datatable.internal.difflib.myers.MyersDiff;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DialogContent  extends Parent{

    public DialogContent() {

        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css = "button[id='cboxClose']")
    private WebElement popUp;

    @FindBy(css = "button[class='btn btn-primary btn-sm acceptcookies']")
    private WebElement acceptCookies;

    @FindBy(css = "span[class='login-icon-signup']")
     private WebElement uyeOl;

    @FindBy(id = "cphMain_Widget_126_ctl02_name")
     private WebElement ad;

    @FindBy(id = "cphMain_Widget_126_ctl02_sirname")
    private WebElement soyAd;

    @FindBy(id = "cphMain_Widget_126_ctl02_eMail")
    private WebElement email;

    @FindBy(css = "input[id='cphMain_Widget_126_ctl02_pass']")
    private WebElement password;

    @FindBy(id = "cphMain_Widget_126_ctl02_pass2")
    private WebElement rePassword;


    @FindBy(id = "cphMain_Widget_126_ctl02_PoCode")
    private WebElement alanKod;

    @FindBy(id = "cphMain_Widget_126_ctl02_phone")
    private WebElement phone;

    @FindBy(xpath = "(//div[@class='input-container'])[11]")
    private WebElement kvkk1;

    @FindBy(xpath = "(//div[@class='input-container'])[12]")
    private WebElement kvkk2;

    @FindBy(css = "a[id='Save']")
    private WebElement uyeOlBtn;

    @FindBy(xpath = "//strong[text()='Sayın Mustafa Sedat Aksoy']")
    private WebElement verifySignUp;



    WebElement myElement;

    public void findAndClick(String strElement)
    {
        switch (strElement)
        {
            case "popUp": myElement=popUp
            ;break;

            case "acceptCookies" :myElement=acceptCookies;
            break;

            case "uyeOl" : myElement=uyeOl;
            break;

            case "kvkk1" : myElement=kvkk1;
            break;

            case "kvkk2" :myElement=kvkk2;
            break;

            case "uyeOlBtn" : myElement=uyeOlBtn;
            break;



        }

        clickFunction(myElement);

    }

    public void findAndSend(String strElement, String value)
    {
        switch (strElement)
        {
            case "ad" :myElement=ad;
            break;

            case "soyAd": myElement=soyAd;
            break;

            case "email": myElement=email;
                break;

            case "password": myElement=password;
                break;


            case "rePassword": myElement=rePassword;
                break;


            case "alanKod": myElement=alanKod;
                break;

            case "phone": myElement=phone;
                break;


        }

        sendKeysFunction(myElement , value);

    }

    public void findAndContainsText(String strElement , String text)
    {
        switch (strElement)
        {
            case "verifySignUp" : myElement=verifySignUp;
            break;

        }

         verifyContainsText(myElement,text);

    }



}
