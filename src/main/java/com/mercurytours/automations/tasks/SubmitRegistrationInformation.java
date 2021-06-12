package com.mercurytours.automations.tasks;


import com.mercurytours.automations.models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.mercurytours.automations.userinterfaces.RegistrationForm.*;

public class SubmitRegistrationInformation implements Task {

    Data data;

    public SubmitRegistrationInformation(Data data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.getFirstName()).into(FIRST_NAME),
                Enter.theValue(data.getLastName()).into(LAST_NAME),
                Enter.theValue(data.getPhoneNumber()).into(PHONE),
                Enter.theValue(data.getEmailAddress()).into(EMAIL),
                Enter.theValue(data.getUserName()).into(USER_NAME),
                Enter.theValue(data.getPassword()).into(PASSWORD),
                Enter.theValue(data.getPassword()).into(CONFIRM_PASSWORD),
                Click.on(SUBMIT_BUTTON)

        );
    }
}
