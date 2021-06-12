package com.mercurytours.automations.stepdefinitions;

import com.mercurytours.automations.models.Data;
import com.mercurytours.automations.tasks.GoToRegistrationPage;
import com.mercurytours.automations.tasks.OpenTheBrowser;
import com.mercurytours.automations.tasks.SubmitRegistrationInformation;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class RegisterStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver driver;

    private Actor actors = Actor.named("Actors");

    @Before
    public void setUp(){
        actors.can(BrowseTheWeb.with(driver));
    }

    @Given("^that the user is on the registration page$")
    public void thatTheUserIsOnTheRegistrationPage() {
        actors.wasAbleTo(OpenTheBrowser.on());
        actors.wasAbleTo(new GoToRegistrationPage());
    }

    @When("^the user enters the personal information$")
    public void theUserEntersThePersonalInformation(List<Data> dataList) {
        actors.attemptsTo(new SubmitRegistrationInformation(dataList.get(0)));
    }

    @Then("^could see the 'login successfully' text$")
    public void couldSeeTheLoginSuccessfullyText() {

    }
}
