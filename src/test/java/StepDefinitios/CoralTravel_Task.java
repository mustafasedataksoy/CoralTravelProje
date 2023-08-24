package StepDefinitios;

import Pages.DialogContent;
import Utulities.GWD;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class CoralTravel_Task {

    DialogContent dc = new DialogContent();

    @Given("Navigate to CoralTravel")
    public void navigateToCoralTravel() {

        GWD.getDriver().get("https://www.coraltatil.com/");
        GWD.getDriver().manage().window().maximize();


    }
    @When("Verify you are on CoralTravel home page")
    public void verifyYouAreOnCoralTravelHomePage() {
        Assert.assertEquals(GWD.getDriver().getCurrentUrl(),"https://www.coraltatil.com/");
        dc.findAndClick("popUp");
        dc.findAndClick("acceptCookies");

    }

    @And("Click Sign up menu button")
    public void clickSignUp() {
        dc.findAndClick("uyeOl");

    }

    @And("Fill out the form and signup the site")
    public void Fillouttheformandsignupthesite() {

        dc.findAndSend("ad","Mustafa Sedat");
        dc.findAndSend("soyAd", "Aksoy");
        dc.findAndSend("email","mustafa23@gmail.com");
        dc.findAndSend("password","wsx456edc");
        dc.findAndSend("rePassword","wsx456edc");
        dc.findAndSend("alanKod","532");
        dc.findAndSend("phone","5238822");
        dc.findAndClick("kvkk1");
        dc.findAndClick("kvkk2");
        dc.findAndClick("uyeOlBtn");

    }


    @Then("Verify that your membership to the site")
    public void verifyThatYourMembershipToTheSite() {
      dc.findAndContainsText("verifySignUp","Mustafa Sedat Aksoy");

    }




}
